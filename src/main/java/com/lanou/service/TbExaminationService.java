package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.entity.TbExamination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbExaminationService {
    PageInfo<TbExamination> selectAll(int page, int limit);

    int insertExam(TbExamination tbExamination);

    int insertChoose(int chooseScore,int cid,int eid);

    int insertCode(int codeScore,int cid,int eid);

    int insertJudge(int judgeScore,int cid,int eid);

    int insertSubjective(int subjectiveScore,int cid,int eid);

    int deleteById(@Param("id") int id);

    PageInfo<TbExamination> searchExamination(TbExamination tbExamination,int page, int limit);

    int deleteCHRByEId(@Param("eid") int eid);
    int deleteCORByEId(@Param("eid") int eid);
    int deleteJRByEId(@Param("eid") int eid);
    int deleteSRByEId(@Param("eid") int eid);
}
