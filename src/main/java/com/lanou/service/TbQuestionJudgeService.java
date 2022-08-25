package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionCode;
import com.lanou.entity.TbQuestionJudge;
import com.lanou.entity.TbQuestionSubjective;

import java.util.List;


public interface TbQuestionJudgeService {
    PageInfo<TbQuestionJudge> selectAll(int page, int limit);

    int insertQuestion(TbQuestionJudge tbQuestionJudge);

    TbQuestionJudge getQuestionById(int id);

    int updateQuestion(TbQuestionJudge tbQuestionJudge);

    int deleteById(int id);

    PageInfo<TbQuestionJudge> searchQuestion(TbQuestionJudge tbQuestionJudge, int page, int limit);

    List<TbQuestionJudge> selectCode(TbQuestionJudge tbQuestionJudge);

    List<TbQuestionJudge> selectByEId(int eid);

    List<TbQuestionJudge> selectByEIdAndUId(int eid, int sid);
}
