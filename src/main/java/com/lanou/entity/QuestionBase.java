package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionBase implements Serializable {
    private int id;
    private String major;
    private int level;
    private String source;
    private int perid;
    private String seg;
    private String title;
}


