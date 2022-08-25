package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbQuestionCode extends QuestionBase implements Serializable {
    private String usercase;
    private String correct;
    private UserInfo userInfo;
}
