package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbQuestionChoose implements Serializable {

private int id;
    private String major;
    private int level;
    private String source;
    private int perid;
    private String seg;
    private String title;
    private String choiseA;
    private String choiseB;
    private String choiseC;
    private String choiseD;
    private int correct;
    private UserInfo userInfo;

    private Answer answer;
}
