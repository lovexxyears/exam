

package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class TbQuestionSubjective extends QuestionBase implements Serializable {
    private UserInfo userInfo;
    private Answer answer;
}
