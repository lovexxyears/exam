package com.lanou.dao;


import com.lanou.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbExamination1Dao {
    List<TbExamination1> selectAll();

    TbExamination1 selectById(@Param("cid") int cid);

    int insertExam(@Param("tbExamination1") TbExamination1 tbExamination1);

    List<TbUser> selectUId(@Param("perid") int perid, @Param("clazzid") int clazzid);

    List<TbQuestionChoose> selectChooseRan(@Param("chooseNum") int chooseNum, @Param("major") String major, @Param("level") int level, @Param("seg") String seg);

    List<TbQuestionCode> selectCodeRan(@Param("codeNum") int codeNum, @Param("major") String major, @Param("level") int level, @Param("seg") String seg);

    List<TbQuestionJudge> selectJudgeRan(@Param("judgeNum") int judgeNum, @Param("major") String major, @Param("level") int level, @Param("seg") String seg);

    List<TbQuestionSubjective> selectSubjectiveRan(@Param("subjectiveNum") int subjectiveNum, @Param("major") String major, @Param("level") int level, @Param("seg") String seg);

    int insertRUExam(@Param("examPaper") ExamPaper examPaper);

    int updateExamStatus(@Param("status") int status, @Param("eid") int eid);

    List<TbExamination1> selectMyexam(@Param("sid") int sid);


    //   String selectMajor(@Param("perid") int perid );
//   int insertChoose(@Param("chooseScore") int chooseScore, @Param("cid") int cid, @Param("eid") int eid, @Param("uid") int uid);
//
//   int insertCode(@Param("codeScore") int codeScore, @Param("cid") int cid, @Param("eid") int eid, @Param("uid") int uid);
//
//   int insertJudge(@Param("judgeScore") int judgeScore, @Param("cid") int cid, @Param("eid") int eid, @Param("uid") int uid);
//
//   int insertSubjective(@Param("subjectiveScore") int subjectiveScore, @Param("cid") int cid, @Param("eid") int eid, @Param("uid") int uid);
//
    int deleteById(@Param("id") int id);

    //
//    List<TbExamination> searchExamination(TbExamination tbExamination);
//
    int deleteERByEId(@Param("eid") int eid);
//   int deleteCORByEId(@Param("eid") int eid);
//   int deleteJRByEId(@Param("eid") int eid);
//   int deleteSRByEId(@Param("eid") int eid);

    int insertAnswer(@Param("eid") int eid, @Param("sid") int sid, @Param("reuid") int reuid, @Param("type") int type, @Param("answer") String answer);

    int insertScore(@Param("eid") int eid, @Param("sid") int sid, @Param("score") int score);


    int updateSubmitStatus(@Param("submitStatus") int submitStatus,@Param("eid") int eid);

    int searchMyScore(@Param("uid") int uid);
}
