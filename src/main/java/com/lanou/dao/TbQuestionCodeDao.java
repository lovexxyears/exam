package com.lanou.dao;

import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionCode;
import com.lanou.entity.TbQuestionSubjective;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbQuestionCodeDao {
    List<TbQuestionCode> selectAll();

    int insertQuestion(@Param("question") TbQuestionCode tbQuestionCode);

    TbQuestionCode getQuestionById(int id);

    int updateQuestion(TbQuestionCode tbQuestionCode);

    int deleteById(@Param("id") int id);

    List<TbQuestionCode> searchQuestion(TbQuestionCode tbQuestionCode);

    List<TbQuestionCode> selectByEId(int eid);

    List<TbQuestionCode> selectByEIdAndUId(@Param("eid") int eid, @Param("sid") int sid);
}
