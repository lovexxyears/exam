package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;

// 用于试卷生成时 获取 考卷id
@Data
public class ExamPaper implements Serializable {
//   private int id;
   private int eid;    //试卷id
   private int qid;   //考题id
   private int type;
   private int score;
}
