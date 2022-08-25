package com.lanou.dao;

import com.lanou.entity.TbExamination;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface TbExaminationDao {
    List<TbExamination> selectAll();

    TbExamination selectById(@Param("cid")int cid);

    int insertExam(@Param("tbExamination") TbExamination tbExamination);

    List<TbUser> selectUId(@Param("perid")int perid);

   int insertChoose(@Param("chooseScore") int chooseScore,@Param("cid")int cid,@Param("eid")int eid,@Param("uid")int uid);

   int insertCode(@Param("codeScore") int codeScore,@Param("cid")int cid,@Param("eid")int eid,@Param("uid")int uid);

   int insertJudge(@Param("judgeScore") int judgeScore,@Param("cid")int cid,@Param("eid")int eid,@Param("uid")int uid);

   int insertSubjective(@Param("subjectiveScore") int subjectiveScore,@Param("cid")int cid,@Param("eid")int eid,@Param("uid")int uid);

    int deleteById(@Param("id") int id);

    List<TbExamination> searchExamination(TbExamination tbExamination);

   int deleteCHRByEId(@Param("eid") int eid);
   int deleteCORByEId(@Param("eid") int eid);
   int deleteJRByEId(@Param("eid") int eid);
   int deleteSRByEId(@Param("eid") int eid);
}
