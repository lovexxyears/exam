package com.lanou.controller;

import com.lanou.entity.*;
import com.lanou.service.UserService;
import com.lanou.service.impl.*;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j
@RequestMapping("/exam1")
@RestController
public class TbExamination1Controller {
    @Autowired
    private TbExaminationService1Impl tbExaminationService1;

    @Autowired
    private TbQuestionSubjectiveServiceImpl tbQuestionSubjectiveServiceImpl;

    @Autowired
    private TbQuestionChooseServiceImpl tbQuestionChooseService;

    @Autowired
    private TbQuestionCodeServiceImpl tbQuestionCodeService;

    @Autowired
    private TbQuestionJudgeServiceImpl tbQuestionJudgeService;

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultObject selectAll(int page, int limit) {
        return ResultObject.createSuccessWithData(tbExaminationService1.selectAll(page, limit));
    }

    @RequestMapping(value = "examAdd", method = RequestMethod.POST)
    public ResultObject examAdd(String major, int level, String seg, int clazzId, int perid, int chooseScore, int chooseSum, int codeScore, int codeSum, int judgeScore, int judgeSum, int subjectiveScore, int subjectiveSum) {
        System.out.println("controller");
        return ResultObject.createSuccessWithData(tbExaminationService1.insertQuestion(major, level, seg, clazzId, perid, chooseScore, chooseSum, codeScore, codeSum, judgeScore, judgeSum, subjectiveScore, subjectiveSum));
    }

    @RequestMapping(value = "/updateStatus", method = RequestMethod.POST)
    public ResultObject updateStatus(int status, int eid) {
        tbExaminationService1.updateExamStatus(status, eid);
        return ResultObject.createSuccessWithData("");
    }

//    @RequestMapping(value = "/selectCloose",method = RequestMethod.POST)
//    public ResultObject selectCloose(TbQuestionChoose tbQuestionChoose){
//        return ResultObject.createSuccessWithData(tbQuestionChooseService.selectCloose(tbQuestionChoose));
//    }
//
//    @RequestMapping(value = "/selectCode",method = RequestMethod.POST)
//    public ResultObject selectCode(TbQuestionCode tbQuestionCode){
//        return ResultObject.createSuccessWithData(tbQuestionCodeService.selectCode(tbQuestionCode));
//    }
//
//    @RequestMapping(value = "/selectJudge",method = RequestMethod.POST)
//    public ResultObject selectJudge(TbQuestionJudge tbQuestionJudge){
//        return ResultObject.createSuccessWithData(tbQuestionJudgeService.selectCode(tbQuestionJudge));
//    }
//
//    @RequestMapping(value = "/selectSubjective",method = RequestMethod.POST)
//    public ResultObject selectSubjective(TbQuestionSubjective tbQuestionSubjective){
//        return ResultObject.createSuccessWithData(tbQuestionSubjectiveService.selectCode(tbQuestionSubjective));
//    }

//    @RequestMapping(value = "/examAdd", method = RequestMethod.POST)
//    public ResultObject examAdd(TbExamination1 tbExamination1,String major,int level,String seg, int chooseScore, int chooseSum, int codeScore, int codeSum, int judgeScore, int judgeSum, int subjectiveScore, int subjectiveSum) {
//        System.out.println(tbExamination1);
////        return ResultObject.createSuccessWithData(tbExaminationService1.insertQuestion(tbExamination1,major,level,seg,chooseScore,chooseSum,codeScore,codeSum,judgeScore,judgeSum,subjectiveScore,subjectiveSum));
//        return ResultObject.createSuccessWithData(tbExaminationService1.insertExam(tbExamination1));
//    }

    //    @RequestMapping(value = "/addChoose",method = RequestMethod.POST)
//    public ResultObject addChoose(int chooseScore,int cid,int eid){
//        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.insertChoose(chooseScore,cid,eid));
//    }
//
//    @RequestMapping(value = "/addCode",method = RequestMethod.POST)
//    public ResultObject addCode(int codeScore,int cid,int eid){
//        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.insertCode(codeScore,cid,eid));
//    }
//
//    @RequestMapping(value = "/addJudge",method = RequestMethod.POST)
//    public ResultObject addJudge(int judgeScore,int cid,int eid){
//        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.insertJudge(judgeScore,cid,eid));
//    }
//
//    @RequestMapping(value = "/addSubjective",method = RequestMethod.POST)
//    public ResultObject addSubjective(int subjectiveScore,int cid,int eid){
//        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.insertSubjective(subjectiveScore,cid,eid));
//    }
//
    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public ResultObject deleteById(int id) {
        tbExaminationService1.deleteERByEId(id);
        tbExaminationService1.deleteById(id);
        return ResultObject.createSuccessWithData("");
    }
//    @RequestMapping(value = "/deleteByIds", method = RequestMethod.POST)
//    public ResultObject deleteByIds(String ids){
//        String[] ids1=ids.split(" ");
//        for (int i = 0; i < ids1.length; i++) {
//            tbExaminationServiceImpl.deleteById(Integer.parseInt(ids1[i]));
//            tbExaminationServiceImpl.deleteCHRByEId(Integer.parseInt(ids1[i]));
//            tbExaminationServiceImpl.deleteCORByEId(Integer.parseInt(ids1[i]));
//            tbExaminationServiceImpl.deleteJRByEId(Integer.parseInt(ids1[i]));
//            tbExaminationServiceImpl.deleteSRByEId(Integer.parseInt(ids1[i]));
//            tbExaminationServiceImpl.deleteById(Integer.parseInt(ids1[i]));
//        }
//        return ResultObject.createSuccessWithData("");
//    }
//
//
//    @RequestMapping(value = "searchExamination", method = RequestMethod.POST)
//    public ResultObject searchExamination(TbExamination tbExamination,int page, int limit){
//        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.searchExamination(tbExamination,page,limit));
//    }


    @RequestMapping(value = "/paperList", method = RequestMethod.POST)
    public ResultObject paperList(int page, int limit, int eid) {
        return ResultObject.createSuccessWithData(userService.selectAllStudentsByEId(page, limit, eid));
    }

    @RequestMapping(value = "/resultList", method = RequestMethod.POST)
    public ResultObject resultList(int page, int limit, int eid) {
        return ResultObject.createSuccessWithData(userService.selectAllStudentsRestultByEId(page, limit, eid));
    }


    @RequestMapping(value = "/querySubjective", method = RequestMethod.POST)
    public ResultObject querySubjective(int eid, int sid) {
        return ResultObject.createSuccessWithData(tbQuestionSubjectiveServiceImpl.selectByEIdAndUId(eid, sid));
    }

    @RequestMapping(value = "/submitSubScore", method = RequestMethod.POST)
    public ResultObject submitSubScore(int eid, int sid, int subScore) {
        List<TbQuestionChoose> listChoose = tbQuestionChooseService.selectByEIdAndUId(eid, sid);
        int k = 0;
        int chooseScore1 = 0;
        for (int i = 0; i < listChoose.size(); i++) {
            chooseScore1 = listChoose.get(i).getAnswer().getScore();
            System.out.println("answer" + Integer.parseInt(listChoose.get(i).getAnswer().getAnswer()));
            System.out.println(listChoose.get(i).getCorrect());
            System.out.println(listChoose.get(i).getAnswer().getAnswer().equals(listChoose.get(i).getCorrect()));
            if (Integer.parseInt(listChoose.get(i).getAnswer().getAnswer()) == listChoose.get(i).getCorrect()) {
                k++;
            }
        }
        int chooseScore = chooseScore1 * k;

        List<TbQuestionJudge> listJudge = tbQuestionJudgeService.selectByEIdAndUId(eid, sid);
        k = 0;
        int judgeScore1 = 0;
        for (int i = 0; i < listJudge.size(); i++) {
            judgeScore1 = listJudge.get(i).getAnswer().getScore();
            if (Integer.parseInt(listJudge.get(i).getAnswer().getAnswer()) == listJudge.get(i).getCorrect()) {
                k++;
            }
        }
        int judgeScore = judgeScore1 * k;

        System.out.println("chooseScore" + chooseScore);
        System.out.println("judgeScore" + judgeScore);

        int codeScore = 0;

        int score = subScore + chooseScore + judgeScore + codeScore;

        return ResultObject.createSuccessWithData(tbExaminationService1.insertScore(eid, sid, score));
//        return ResultObject.createSuccessWithData("");
    }
}
