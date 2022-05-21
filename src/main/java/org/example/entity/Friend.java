package org.example.entity;

public class Friend {
    private int id;
    private String name;
    private int year;
    private String local;
    private String nation;

    public Friend() {}

    public Friend(String name, int year, String local, String nation) {
        this.name = name;
        this.year = year;
        this.local = local;
        this.nation = nation;
    }

    public Friend(int id, String name, int year, String local, String nation) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.local = local;
        this.nation = nation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "\nFriend {" +
                "\n     id = " + id +
                "\n     name = '" + name + '\'' +
                "\n     year = " + year +
                "\n     local = '" + local + '\'' +
                "\n     nation = '" + nation + '\'' +
                "\n}";
    }
}
