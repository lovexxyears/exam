package com.lanou.controller;

import com.lanou.entity.ResultObject;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionCode;
import com.lanou.service.TbQuestionCodeService;
import com.lanou.service.impl.TbQuestionChooseServiceImpl;
import com.lanou.service.impl.TbQuestionCodeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "code")
@RestController
public class QuestionCodeController {

    @Autowired
    private TbQuestionCodeServiceImpl tbQuestionCodeService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResultObject selectAll(int page,int limit){
        return ResultObject.createSuccessWithData(tbQuestionCodeService.selectAll(page,limit));
    }

    @RequestMapping(value = "questionAdd",method = RequestMethod.POST)
    public ResultObject questionAdd(TbQuestionCode tbQuestionCode){
        return ResultObject.createSuccessWithData(tbQuestionCodeService.insertQuestion(tbQuestionCode));
    }

    @RequestMapping(value = "getQuestionById",method = RequestMethod.GET)
    public ResultObject getQuestionById(int id){
        return ResultObject.createSuccessWithData(tbQuestionCodeService.getQuestionById(id));
    }

    @RequestMapping(value = "questionUpdate",method = RequestMethod.POST)
    public ResultObject updateQuestion(TbQuestionCode tbQuestionCode){
        return ResultObject.createSuccessWithData(tbQuestionCodeService.updateQuestion(tbQuestionCode));
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    public ResultObject deleteById(int id){
        tbQuestionCodeService.deleteById(id);
        return ResultObject.createSuccessWithData("");
    }
    @RequestMapping(value = "/deleteByIds", method = RequestMethod.POST)
    public ResultObject deleteByIds(String ids){
        String[] ids1=ids.split(" ");
        for (int i = 0; i < ids1.length; i++) {
            tbQuestionCodeService.deleteById(Integer.parseInt(ids1[i]));
        }
        return ResultObject.createSuccessWithData("");
    }


    @RequestMapping(value = "searchQuestion", method = RequestMethod.POST)
    public ResultObject searchQuestion(TbQuestionCode tbQuestionCode,int page, int limit){
        return ResultObject.createSuccessWithData(tbQuestionCodeService.searchQuestion(tbQuestionCode,page,limit));
    }
}
