package com.lanou.controller;

import com.lanou.entity.ResultObject;
import com.lanou.entity.TbQuestionCode;
import com.lanou.entity.TbQuestionJudge;
import com.lanou.service.TbQuestionCodeService;
import com.lanou.service.TbQuestionJudgeService;
import com.lanou.service.impl.TbQuestionJudgeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "judge")
@RestController
public class QuestionJudgeController {

    @Autowired
    private TbQuestionJudgeServiceImpl tbQuestionJudgeService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultObject selectAll(int page,int limit){
        return ResultObject.createSuccessWithData(tbQuestionJudgeService.selectAll(page,limit));
    }

    @RequestMapping(value = "questionAdd",method = RequestMethod.POST)
    public ResultObject questionAdd(TbQuestionJudge tbQuestionJudge){
        return ResultObject.createSuccessWithData(tbQuestionJudgeService.insertQuestion(tbQuestionJudge));
    }

    @RequestMapping(value = "getQuestionById",method = RequestMethod.GET)
    public ResultObject getQuestionById(int id){
        return ResultObject.createSuccessWithData(tbQuestionJudgeService.getQuestionById(id));
    }

    @RequestMapping(value = "questionUpdate",method = RequestMethod.POST)
    public ResultObject updateQuestion(TbQuestionJudge tbQuestionJudge){
        return ResultObject.createSuccessWithData(tbQuestionJudgeService.updateQuestion(tbQuestionJudge));
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public ResultObject deleteById(int id){
        tbQuestionJudgeService.deleteById(id);
        return ResultObject.createSuccessWithData("");
    }
    @RequestMapping(value = "/deleteByIds", method = RequestMethod.POST)
    public ResultObject deleteByIds(String ids){
        String[] ids1=ids.split(" ");
        for (int i = 0; i < ids1.length; i++) {
            tbQuestionJudgeService.deleteById(Integer.parseInt(ids1[i]));
        }
        return ResultObject.createSuccessWithData("");
    }


    @RequestMapping(value = "searchQuestion", method = RequestMethod.POST)
    public ResultObject searchQuestion(TbQuestionJudge tbQuestionJudge,int page, int limit){
        return ResultObject.createSuccessWithData(tbQuestionJudgeService.searchQuestion(tbQuestionJudge,page,limit));
    }
}
