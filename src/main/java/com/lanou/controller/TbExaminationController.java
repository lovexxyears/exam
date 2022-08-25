package com.lanou.controller;

import com.lanou.entity.*;
import com.lanou.service.impl.*;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Log4j
@RequestMapping("/exam")
@RestController
public class TbExaminationController {
    @Autowired
    private TbExaminationServiceImpl tbExaminationServiceImpl;

    @Autowired
    private TbQuestionChooseServiceImpl tbQuestionChooseService;

    @Autowired
    private TbQuestionCodeServiceImpl tbQuestionCodeService;

    @Autowired
    private TbQuestionJudgeServiceImpl tbQuestionJudgeService;

    @Autowired
    private TbQuestionSubjectiveServiceImpl tbQuestionSubjectiveService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultObject selectAll(int page, int limit){
        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.selectAll(page,limit));
    }

    @RequestMapping(value = "/selectCloose",method = RequestMethod.POST)
    public ResultObject selectCloose(TbQuestionChoose tbQuestionChoose){
        return ResultObject.createSuccessWithData(tbQuestionChooseService.selectCloose(tbQuestionChoose));
    }

    @RequestMapping(value = "/selectCode",method = RequestMethod.POST)
    public ResultObject selectCode(TbQuestionCode tbQuestionCode){
        return ResultObject.createSuccessWithData(tbQuestionCodeService.selectCode(tbQuestionCode));
    }

    @RequestMapping(value = "/selectJudge",method = RequestMethod.POST)
    public ResultObject selectJudge(TbQuestionJudge tbQuestionJudge){
        return ResultObject.createSuccessWithData(tbQuestionJudgeService.selectCode(tbQuestionJudge));
    }

    @RequestMapping(value = "/selectSubjective",method = RequestMethod.POST)
    public ResultObject selectSubjective(TbQuestionSubjective tbQuestionSubjective){
        return ResultObject.createSuccessWithData(tbQuestionSubjectiveService.selectCode(tbQuestionSubjective));
    }

    @RequestMapping(value = "/examAdd",method = RequestMethod.POST)
    public ResultObject examAdd(TbExamination tbExamination){
        log.debug(tbExamination);
        log.error(tbExamination);
        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.insertExam(tbExamination));
    }

    @RequestMapping(value = "/addChoose",method = RequestMethod.POST)
    public ResultObject addChoose(int chooseScore,int cid,int eid){
        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.insertChoose(chooseScore,cid,eid));
    }

    @RequestMapping(value = "/addCode",method = RequestMethod.POST)
    public ResultObject addCode(int codeScore,int cid,int eid){
        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.insertCode(codeScore,cid,eid));
    }

    @RequestMapping(value = "/addJudge",method = RequestMethod.POST)
    public ResultObject addJudge(int judgeScore,int cid,int eid){
        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.insertJudge(judgeScore,cid,eid));
    }

    @RequestMapping(value = "/addSubjective",method = RequestMethod.POST)
    public ResultObject addSubjective(int subjectiveScore,int cid,int eid){
        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.insertSubjective(subjectiveScore,cid,eid));
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public ResultObject deleteById(int id){
        tbExaminationServiceImpl.deleteById(id);
        tbExaminationServiceImpl.deleteCHRByEId(id);
        tbExaminationServiceImpl.deleteCORByEId(id);
        tbExaminationServiceImpl.deleteJRByEId(id);
        tbExaminationServiceImpl.deleteSRByEId(id);
        return ResultObject.createSuccessWithData("");
    }
    @RequestMapping(value = "/deleteByIds", method = RequestMethod.POST)
    public ResultObject deleteByIds(String ids){
        String[] ids1=ids.split(" ");
        for (int i = 0; i < ids1.length; i++) {
            tbExaminationServiceImpl.deleteById(Integer.parseInt(ids1[i]));
            tbExaminationServiceImpl.deleteCHRByEId(Integer.parseInt(ids1[i]));
            tbExaminationServiceImpl.deleteCORByEId(Integer.parseInt(ids1[i]));
            tbExaminationServiceImpl.deleteJRByEId(Integer.parseInt(ids1[i]));
            tbExaminationServiceImpl.deleteSRByEId(Integer.parseInt(ids1[i]));
            tbExaminationServiceImpl.deleteById(Integer.parseInt(ids1[i]));
        }
        return ResultObject.createSuccessWithData("");
    }


    @RequestMapping(value = "searchExamination", method = RequestMethod.POST)
    public ResultObject searchExamination(TbExamination tbExamination,int page, int limit){
        return ResultObject.createSuccessWithData(tbExaminationServiceImpl.searchExamination(tbExamination,page,limit));
    }
}
