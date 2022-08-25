package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.entity.TbExamination;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionSubjective;

import java.util.List;


public interface TbQuestionChooseService {
    PageInfo<TbQuestionChoose> selectAll(int page, int limit);

    int insertQuestion(TbQuestionChoose tbQuestionChoose);

    TbQuestionChoose getQuestionById(int id);

    int updateQuestion(TbQuestionChoose tbQuestionChoose);

    int deleteById(int id);

    PageInfo<TbQuestionChoose> searchQuestion(TbQuestionChoose tbQuestionChoose,int page, int limit);

    List<TbQuestionChoose> selectCloose(TbQuestionChoose tbQuestionChoose);

    List<TbQuestionChoose> selectByEId(int eid);

    List<TbQuestionChoose> selectByEIdAndUId(int eid, int sid);
}
