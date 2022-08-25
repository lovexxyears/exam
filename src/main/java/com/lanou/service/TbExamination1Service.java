package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.entity.TbExamination1;
import org.apache.ibatis.annotations.Param;

public interface TbExamination1Service {

    PageInfo<TbExamination1> selectAll(int page, int limit);


    int insertQuestion(String major,int level,String seg,int clazzid, int perid, int chooseScore, int chooseSum, int codeScore, int codeSum, int judgeScore, int judgeSum, int subjectiveScore, int subjectiveSum);

    int updateExamStatus(int status,int eid);

    int deleteById(@Param("id") int id);

//    PageInfo<TbExamination> searchExamination(TbExamination tbExamination, int page, int limit);

    int deleteERByEId(@Param("eid") int eid);

    PageInfo<TbExamination1> selectMyexam(int page, int limit,int sid);

    int insertAnswer(int eid,int sid,int reuid,int type,String answer);

    int insertScore(int eid,int sid,int score);

    int updateSubmitStatus(int submitStatus,int eid);
}
