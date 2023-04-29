package com.hnu.frentopia.domain;

import lombok.Data;

@Data
public class User{
    private String userId;
    private String userPW;
    private String userName;
    private char userGen;
    private int userAge;
    private String userMajor;
    private int userSchoolNum;
    private int userPhoneNum;
    private double userRatingScore;
    private String userCreateAt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) {
        this.userPW = userPW;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getUserGen() {
        return userGen;
    }

    public void setUserGen(char userGen) {
        this.userGen = userGen;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserMajor() {
        return userMajor;
    }

    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor;
    }

    public int getUserSchoolNum() {
        return userSchoolNum;
    }

    public void setUserSchoolNum(int userSchoolNum) {
        this.userSchoolNum = userSchoolNum;
    }

    public int getUserPhoneNum() {
        return userPhoneNum;
    }

    public void setUserPhoneNum(int userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }

    public double getUserRatingScore() {
        return userRatingScore;
    }

    public void setUserRatingScore(double userRatingScore) {
        this.userRatingScore = userRatingScore;
    }

    public String getUserCreateAt() {
        return userCreateAt;
    }

    public void setUserCreateAt(String userCreateAt) {
        this.userCreateAt = userCreateAt;
    }
}
