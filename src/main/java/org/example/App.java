package org.example;

import org.example.configiguration.AppConfig;
import org.example.entity.Friend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        System.out.println(communication.getAllFriend());

        System.out.println(communication.getFriend(3));

        Friend friend = new Friend("Sergey", 2000, "SPB", "RUS");
        communication.saveFriend(friend);

        Friend friend2 = communication.getFriend(2);
        friend2.setLocal("Moscow");
        communication.saveFriend(friend2);

        communication.deleteFriend(friend.getId());

    }

}
