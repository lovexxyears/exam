package com.lanou.dao;

import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionJudge;
import com.lanou.entity.TbQuestionSubjective;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbQuestionSubjectiveDao {
    List<TbQuestionSubjective> selectAll();

    int insertQuestion(@Param("question") TbQuestionSubjective tbQuestionSubjective);

    TbQuestionSubjective getQuestionById(int id);

    int updateQuestion(TbQuestionSubjective tbQuestionSubjective);

    int deleteById(@Param("id") int id);

    List<TbQuestionSubjective> searchQuestion(TbQuestionSubjective tbQuestionSubjective);

    List<TbQuestionSubjective> selectByEId(int eid);


    List<TbQuestionSubjective> selectByEIdAndUId(@Param("eid") int eid,@Param("sid") int sid);
}
