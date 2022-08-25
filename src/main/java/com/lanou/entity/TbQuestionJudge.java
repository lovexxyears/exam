package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbQuestionJudge extends QuestionBase implements Serializable {
    private int correct;
    private UserInfo userInfo;
    private Answer answer;
}
