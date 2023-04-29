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
}
