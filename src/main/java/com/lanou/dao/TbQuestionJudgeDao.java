package com.lanou.dao;

import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionJudge;
import com.lanou.entity.TbQuestionSubjective;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbQuestionJudgeDao {
    List<TbQuestionJudge> selectAll();

    int insertQuestion(@Param("question") TbQuestionJudge tbQuestionJudge);

    TbQuestionJudge getQuestionById(int id);

    int updateQuestion(TbQuestionJudge tbQuestionJudge);

    int deleteById(@Param("id") int id);

    List<TbQuestionJudge> searchQuestion(TbQuestionJudge tbQuestionJudge);

    List<TbQuestionJudge> selectByEId(int eid);

    List<TbQuestionJudge> selectByEIdAndUId(@Param("eid") int eid, @Param("sid") int sid);
}
