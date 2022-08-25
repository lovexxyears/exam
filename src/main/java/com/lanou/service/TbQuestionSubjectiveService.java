package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionCode;
import com.lanou.entity.TbQuestionJudge;
import com.lanou.entity.TbQuestionSubjective;

import java.util.List;


public interface TbQuestionSubjectiveService {
    PageInfo<TbQuestionSubjective> selectAll(int page, int limit);

    int insertQuestion(TbQuestionSubjective tbQuestionSubjective);

    TbQuestionSubjective getQuestionById(int id);

    int updateQuestion(TbQuestionSubjective tbQuestionSubjective);

    int deleteById(int id);

    PageInfo<TbQuestionSubjective> searchQuestion(TbQuestionSubjective tbQuestionSubjective, int page, int limit);

    List<TbQuestionSubjective> selectCode(TbQuestionSubjective tbQuestionSubjective);

    List<TbQuestionSubjective> selectByEId(int eid);

    List<TbQuestionSubjective> selectByEIdAndUId(int eid,int sid);
}
