package com.company;

public class User {
    private String nick_name;
    private String user_name;
    private String password;

    public User(String nick_name, String user_name, String password) {
        this.nick_name = nick_name;
        this.user_name = user_name;
        this.password = password;
    }


    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "nick_name='" + nick_name + '\'' +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
