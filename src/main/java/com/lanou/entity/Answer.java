package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Answer implements Serializable {
    private int id;
    private String answer;
    private int score;
}
