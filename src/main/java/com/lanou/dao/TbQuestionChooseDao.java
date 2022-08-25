package com.lanou.dao;

import com.github.pagehelper.PageInfo;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionSubjective;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbQuestionChooseDao {
    List<TbQuestionChoose> selectAll();

    int insertQuestion(@Param("question") TbQuestionChoose tbQuestionChoose);

    TbQuestionChoose getQuestionById(int id);

    int updateQuestion(TbQuestionChoose tbQuestionChoose);

    int deleteById(@Param("id") int id);

    List<TbQuestionChoose> searchQuestion(TbQuestionChoose tbQuestionChoose);

    List<TbQuestionChoose> selectByEId(int eid);
    List<TbQuestionChoose> selectByEIdAndUId(@Param("eid") int eid, @Param("sid") int sid);
}
