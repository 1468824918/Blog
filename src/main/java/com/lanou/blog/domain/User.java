package com.lanou.blog.domain;

/**
 * Created by dllo on 17/12/4.
 */
public class User {
    private int userId;
    private String userName;
    private String password;
    private int level;
    private String des;
    private String tel;
    private String address;
    private String againPassword;

    public User() {
    }

    public User(String userName, String password, int level, String des, String tel, String address) {
        this.userName = userName;
        this.password = password;
        this.level = level;
        this.des = des;
        this.tel = tel;
        this.address = address;
    }

    public User(int userId, String userName, String password, int level, String des, String tel, String address) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.level = level;
        this.des = des;
        this.tel = tel;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", level=" + level +
                ", des='" + des + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getAgainPassword() {
        return againPassword;
    }

    public void setAgainPassword(String againPassword) {
        this.againPassword = againPassword;
    }
}
