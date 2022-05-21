package org.example;

import org.example.entity.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    private final RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/FriendsBase/api/friends/";

    public Communication(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Friend> getAllFriend() {
        ResponseEntity<List<Friend>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null ,
                new ParameterizedTypeReference<List<Friend>>() {});
        return responseEntity.getBody();
    }

    public Friend getFriend(int id) {
        return restTemplate.getForObject(URL + id, Friend.class);
    }

    public void saveFriend(Friend friend) {
        int id = friend.getId();

        if (id==0) {
            ResponseEntity<String> response = restTemplate.postForEntity(URL, friend, String.class);
            System.out.println(response.getBody());
            System.out.println("New Friend was added");
        }
        else {
            restTemplate.put(URL, friend);
            System.out.println("Friend with ID " + id + " was updated");
        }
    }

    public void deleteFriend(int id) {
        restTemplate.delete(URL + id);
        System.out.println("Friend with ID " + id + " was deleted");
    }


}
