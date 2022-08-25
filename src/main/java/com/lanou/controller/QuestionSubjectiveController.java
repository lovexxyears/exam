package com.lanou.controller;

import com.lanou.entity.ResultObject;
import com.lanou.entity.TbQuestionJudge;
import com.lanou.entity.TbQuestionSubjective;
import com.lanou.service.impl.TbQuestionSubjectiveServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "subjective")
@RestController
public class QuestionSubjectiveController {

    @Autowired
    private TbQuestionSubjectiveServiceImpl tbQuestionSubjectiveServiceImpl;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultObject selectAll(int page,int limit){
        return ResultObject.createSuccessWithData(tbQuestionSubjectiveServiceImpl.selectAll(page,limit));
    }

    @RequestMapping(value = "questionAdd",method = RequestMethod.POST)
    public ResultObject questionAdd(TbQuestionSubjective tbQuestionSubjective){
        return ResultObject.createSuccessWithData(tbQuestionSubjectiveServiceImpl.insertQuestion(tbQuestionSubjective));
    }

    @RequestMapping(value = "getQuestionById",method = RequestMethod.GET)
    public ResultObject getQuestionById(int id){
        return ResultObject.createSuccessWithData(tbQuestionSubjectiveServiceImpl.getQuestionById(id));
    }

    @RequestMapping(value = "questionUpdate",method = RequestMethod.POST)
    public ResultObject updateQuestion(TbQuestionSubjective tbQuestionSubjective){
        return ResultObject.createSuccessWithData(tbQuestionSubjectiveServiceImpl.updateQuestion(tbQuestionSubjective));
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public ResultObject deleteById(int id){
        tbQuestionSubjectiveServiceImpl.deleteById(id);
        return ResultObject.createSuccessWithData("");
    }
    @RequestMapping(value = "/deleteByIds", method = RequestMethod.POST)
    public ResultObject deleteByIds(String ids){
        String[] ids1=ids.split(" ");
        for (int i = 0; i < ids1.length; i++) {
            tbQuestionSubjectiveServiceImpl.deleteById(Integer.parseInt(ids1[i]));
        }
        return ResultObject.createSuccessWithData("");
    }


    @RequestMapping(value = "searchQuestion", method = RequestMethod.POST)
    public ResultObject searchQuestion(TbQuestionSubjective tbQuestionSubjective,int page, int limit){
        return ResultObject.createSuccessWithData(tbQuestionSubjectiveServiceImpl.searchQuestion(tbQuestionSubjective,page,limit));
    }
}
