package com.hnu.frentopia.domain;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder @Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User{
    @Id @Column(name = "id")
    private String userId;
    @Column(name="pw")
    private String userPW;
    @Column(name="name")
    private String userName;
    @Column(name="gen")
    private char userGen;
    @Column(name="age")
    private int userAge;
    @Column(name="major")
    private String userMajor;
    @Column(name="school_num")
    private int userSchoolNum;
    @Column(name="phone_num")
    private int userPhoneNum;
    @Column(name="rating_score")
    private double userRatingScore;
    @Column(name="create_at") @CreatedDate
    private String userCreateAt;
}
