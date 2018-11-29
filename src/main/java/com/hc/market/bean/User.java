package com.hc.market.bean;

public class User {
    private Integer user_id;
    private String user_name;
    private String user_email;
    private String user_password;
    private String user_pictrue;
    private String user_info;

    public User() {
    }

    public User(Integer user_id, String user_name, String user_email, String user_password, String user_pictrue, String user_info) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_pictrue = user_pictrue;
        this.user_info = user_info;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_pictrue() {
        return user_pictrue;
    }

    public void setUser_pictrue(String user_pictrue) {
        this.user_pictrue = user_pictrue;
    }

    public String getUser_info() {
        return user_info;
    }

    public void setUser_info(String user_info) {
        this.user_info = user_info;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_pictrue='" + user_pictrue + '\'' +
                ", user_info='" + user_info + '\'' +
                '}';
    }
}
