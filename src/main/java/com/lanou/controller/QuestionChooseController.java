package com.lanou.controller;

import com.lanou.entity.ResultObject;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.service.impl.TbQuestionChooseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "choose")
@RestController
public class QuestionChooseController {

    @Autowired
    private TbQuestionChooseServiceImpl tbQuestionChooseService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultObject selectAll(int page,int limit){
        return ResultObject.createSuccessWithData(tbQuestionChooseService.selectAll(page,limit));
    }

    @RequestMapping(value = "questionAdd",method = RequestMethod.POST)
    public ResultObject questionAdd(TbQuestionChoose tbQuestionChoose){
        System.out.println(tbQuestionChoose);
        return ResultObject.createSuccessWithData(tbQuestionChooseService.insertQuestion(tbQuestionChoose));
    }

    @RequestMapping(value = "getQuestionById",method = RequestMethod.GET)
    public ResultObject getQuestionById(int id){
        return ResultObject.createSuccessWithData(tbQuestionChooseService.getQuestionById(id));
    }

    @RequestMapping(value = "questionUpdate",method = RequestMethod.POST)
    public ResultObject updateQuestion(TbQuestionChoose tbQuestionChoose){
        return ResultObject.createSuccessWithData(tbQuestionChooseService.updateQuestion(tbQuestionChoose));
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public ResultObject deleteById(int id){
        tbQuestionChooseService.deleteById(id);
        return ResultObject.createSuccessWithData("");
    }
    @RequestMapping(value = "/deleteByIds", method = RequestMethod.POST)
    public ResultObject deleteByIds(String ids){
        String[] ids1=ids.split(" ");
        for (int i = 0; i < ids1.length; i++) {
            tbQuestionChooseService.deleteById(Integer.parseInt(ids1[i]));
        }

        return ResultObject.createSuccessWithData("");
    }


    @RequestMapping(value = "searchQuestion", method = RequestMethod.POST)
    public ResultObject searchQuestion(TbQuestionChoose tbQuestionChoose,int page, int limit){
        return ResultObject.createSuccessWithData(tbQuestionChooseService.searchQuestion(tbQuestionChoose,page,limit));
    }
}
