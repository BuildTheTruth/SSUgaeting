package com.project.network.ssugaeting.item;

/**
 * Created by Jin on 2018-04-07.
 */

public class Profile {
    // Essential Information
    private String id;
    private String password;
    private String email;
    private String name;
    // Additional Information
    private String stateMsg;
    private String age;
    private String height;
    private String address;
    private String hobby;
    private String occupation;
    private String position;
    private String imageURL;

    public Profile(String name, String stateMsg) {
        this.name=name;
        this.stateMsg=stateMsg;
    }

    public Profile(String id, String password, String email, String name, String stateMsg, String age, String height, String address, String hobby, String occupation, String position, String imageURL) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.name = name;
        this.stateMsg = stateMsg;
        this.age = age;
        this.height = height;
        this.address = address;
        this.hobby = hobby;
        this.occupation = occupation;
        this.position = position;
        this.imageURL = imageURL;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStateMsg(String stateMsg) {
        this.stateMsg = stateMsg;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getStateMsg() {
        return stateMsg;
    }

    public String getAge() {
        return age;
    }

    public String getHeight() {
        return height;
    }

    public String getAddress() {
        return address;
    }

    public String getHobby() {
        return hobby;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getPosition() {
        return position;
    }

    public String getImageURL() {
        return imageURL;
    }
}
