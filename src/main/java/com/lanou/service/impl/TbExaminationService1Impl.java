package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.dao.TbExamination1Dao;
import com.lanou.entity.*;
import com.lanou.service.TbExamination1Service;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Log4j
@Service
public class TbExaminationService1Impl implements TbExamination1Service {
    @Autowired
    private TbExamination1Dao tbExamination1Dao;

    @Override
    public PageInfo<TbExamination1> selectAll(int page, int limit) {
        PageHelper.startPage(page, limit);
        PageInfo<TbExamination1> pageInfo = new PageInfo<TbExamination1>(tbExamination1Dao.selectAll());
        return pageInfo;
    }

    @Override
    public int insertQuestion(String major, int level, String seg, int clazzId, int perid, int chooseScore, int chooseSum, int codeScore, int codeSum, int judgeScore, int judgeSum, int subjectiveScore, int subjectiveSum) {
        //生成试卷
        TbExamination1 tbExamination1 = new TbExamination1();
        tbExamination1.setPerid(perid);
        tbExamination1.setClazzId(clazzId);
        tbExamination1.setCreated(new Date());
        tbExamination1.setStatus(1);
        tbExamination1Dao.insertExam(tbExamination1);
        int eid = tbExamination1.getId();
//        System.out.println(tbExamination1.getId()+"id----------------");


//        TbExamination1 tbExamination2 = tbExamination1Dao.selectById(eid);
//        int clazzid = tbExamination1.getClazzId();
//        System.out.println("clazzid"+clazzid);

        //根据教师id 和 班级id 查询学生信息  id
        List<TbUser> userList = tbExamination1Dao.selectUId(perid, clazzId);

        //查询题库 生成试题
        List<TbQuestionChoose> listChoose = tbExamination1Dao.selectChooseRan(chooseSum, major, level, seg);

        List<TbQuestionCode> listCode = tbExamination1Dao.selectCodeRan(codeSum, major, level, seg);

        List<TbQuestionJudge> listJudge = tbExamination1Dao.selectJudgeRan(judgeSum, major, level, seg);

        List<TbQuestionSubjective> listSubjective = tbExamination1Dao.selectSubjectiveRan(subjectiveSum, major, level, seg);

        System.out.println(userList.size() + "size");
        System.out.println(listChoose.size() + "size");
        System.out.println(listCode.size() + "size");
        System.out.println(listJudge.size() + "size");
        System.out.println(listSubjective.size() + "size");
//        ArrayList<Integer> chooseIdsList = new ArrayList<>();
//        ArrayList<Integer> codeIdsList = new ArrayList<>();
//        ArrayList<Integer> judgeIdsList = new ArrayList<>();
//        ArrayList<Integer> subjectiveIdsList = new ArrayList<>();
        int type;
        ExamPaper examPaper = new ExamPaper();
        for (int i = 0; i < listChoose.size(); i++) {
            type = 1;

            examPaper.setEid(eid);
            examPaper.setQid(listChoose.get(i).getId());
            examPaper.setType(type);
            examPaper.setScore(chooseScore);

            tbExamination1Dao.insertRUExam(examPaper);
//            chooseIdsList.add(examPaper.getId());
        }

        for (int i = 0; i < listJudge.size(); i++) {
            type = 2;

            examPaper.setEid(eid);
            examPaper.setQid(listJudge.get(i).getId());
            examPaper.setType(type);
            examPaper.setScore(judgeScore);
            tbExamination1Dao.insertRUExam(examPaper);
//            judgeIdsList.add(examPaper.getId());
        }

        for (int i = 0; i < listSubjective.size(); i++) {
            type = 3;
            examPaper.setEid(eid);
            examPaper.setQid(listSubjective.get(i).getId());
            examPaper.setType(type);
            examPaper.setScore(subjectiveScore);
            tbExamination1Dao.insertRUExam(examPaper);
//            subjectiveIdsList.add(examPaper.getId());
        }

        for (int i = 0; i < listCode.size(); i++) {
            type = 4;
            examPaper.setEid(eid);
            examPaper.setQid( listCode.get(i).getId());
            examPaper.setType(type);
            examPaper.setScore(codeScore);
            tbExamination1Dao.insertRUExam(examPaper);
//            codeIdsList.add(examPaper.getId());
        }

//        for (int i = 0; i < chooseIdsList.size(); i++) {
//            for (int j = 0; j < userList.size(); j++) {
//                tbExamination1Dao.
//            }
//        }

        return 0;
    }

    @Override
    public int updateExamStatus(int status, int eid) {
        return tbExamination1Dao.updateExamStatus(status, eid);
    }

    @Override
    public int deleteById(int id) {
        return tbExamination1Dao.deleteById(id);
    }

    //
//    @Override
//    public PageInfo<TbExamination> searchExamination(TbExamination tbExamination, int page, int limit) {
//        PageHelper.startPage(page, limit);
//        PageInfo<TbExamination> pageInfo = new PageInfo<TbExamination>(tbExaminationDao.searchExamination(tbExamination));
//
//        return pageInfo;
//    }
//
    @Override
    public int deleteERByEId(int eid) {
        return tbExamination1Dao.deleteERByEId(eid);
    }

    @Override
    public PageInfo<TbExamination1> selectMyexam(int page, int limit,int sid) {
        PageHelper.startPage(page, limit);
        PageInfo<TbExamination1> pageInfo = new PageInfo<TbExamination1>(tbExamination1Dao.selectMyexam(sid));
        return pageInfo;
    }

    @Override
    public int insertAnswer(int eid, int sid, int reuid,int type, String answer) {
        return tbExamination1Dao.insertAnswer(eid,sid,reuid,type,answer);
    }

    @Override
    public int insertScore(int eid, int sid, int score) {
        return tbExamination1Dao.insertScore(eid,sid,score);
    }

    @Override
    public int updateSubmitStatus(int submitStatus,int eid) {
        return tbExamination1Dao.updateSubmitStatus(submitStatus,eid);
    }

    public int searchMyScore(int uid){
        return tbExamination1Dao.searchMyScore(uid);
    }

}
