package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionCode;
import com.lanou.entity.TbQuestionSubjective;

import java.util.List;


public interface TbQuestionCodeService {
    PageInfo<TbQuestionCode> selectAll(int page, int limit);

    int insertQuestion(TbQuestionCode tbQuestionCode);

    TbQuestionCode getQuestionById(int id);

    int updateQuestion(TbQuestionCode tbQuestionCode);

    int deleteById(int id);

    PageInfo<TbQuestionCode> searchQuestion(TbQuestionCode tbQuestionCode, int page, int limit);

    List<TbQuestionCode> selectCode(TbQuestionCode tbQuestionCode);

    List<TbQuestionCode> selectByEId(int eid);

    List<TbQuestionCode> selectByEIdAndUId(int eid, int sid);
}
