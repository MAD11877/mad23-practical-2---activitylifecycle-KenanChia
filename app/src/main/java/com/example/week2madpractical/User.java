package com.example.week2madpractical;

public class User {
    public String name;
    public String desc;
    public int id = 0;
    public boolean followed;
    public User(String name, String desc, int id, boolean followed) {
        this.name = name;
        this.desc = desc;
        this.id = id;
        this.followed = followed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }
}
