package com.lanou.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lanou.entity.ResultObject;
import com.lanou.entity.TbUser;
import com.lanou.service.impl.*;
import org.apache.shiro.SecurityUtils;
import org.aspectj.org.eclipse.jdt.core.IField;
import org.eclipse.core.internal.jobs.ObjectMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/myexam")
public class MyExamController {
    @Autowired
    private TbExaminationService1Impl tbExaminationService1;

    @Autowired
    private TbQuestionChooseServiceImpl tbQuestionChooseService;

    @Autowired
    private TbQuestionCodeServiceImpl tbQuestionCodeService;

    @Autowired
    private TbQuestionJudgeServiceImpl tbQuestionJudgeService;

    @Autowired
    private TbQuestionSubjectiveServiceImpl tbQuestionSubjectiveService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultObject selectAll(int page, int limit) {
        TbUser tbUser = (TbUser) SecurityUtils.getSubject().getPrincipal();
        int sid = tbUser.getId();
        return ResultObject.createSuccessWithData(tbExaminationService1.selectMyexam(page, limit, sid));
    }


    @RequestMapping(value = "/queryCloose", method = RequestMethod.POST)
    public ResultObject selectClooseByEId(int eid) {
        return ResultObject.createSuccessWithData(tbQuestionChooseService.selectByEId(eid));

    }

    @RequestMapping(value = "/queryJudge", method = RequestMethod.POST)
    public ResultObject selectJudgeByEId(int eid) {
        return ResultObject.createSuccessWithData(tbQuestionJudgeService.selectByEId(eid));
    }

    @RequestMapping(value = "/querySubjective", method = RequestMethod.POST)
    public ResultObject querySubjective(int eid) {
        return ResultObject.createSuccessWithData(tbQuestionSubjectiveService.selectByEId(eid));
    }

    @RequestMapping(value = "/queryCode", method = RequestMethod.POST)
    public ResultObject queryCode(int eid) {
        return ResultObject.createSuccessWithData(tbQuestionCodeService.selectByEId(eid));
    }


    @RequestMapping(value = "/subAnswer", method = RequestMethod.POST)
    public ResultObject subAnswer(@RequestBody Map<String, Object> map) {
        TbUser tbUser = (TbUser) SecurityUtils.getSubject().getPrincipal();
        int sid = tbUser.getId();

        Object eidO = map.get("eid");
        int eid = Integer.valueOf((String) eidO);
        int type = 0;
//        for循环次数 为四种题型id最大值  之中的最大值  此处为节省时间直接固定100 后续修改
        for (int i = 0; i < 100; i++) {
            if (map.get("choose" + i) != null) {
                type = 1;
                tbExaminationService1.insertAnswer(eid, sid, i, type, (String) map.get("choose" + i));
            } else if (map.get("code" + i) != null) {
                type = 4;
                tbExaminationService1.insertAnswer(eid, sid, i, type, (String) map.get("code" + i));
            } else if (map.get("judge" + i) != null) {
                type = 2;
                tbExaminationService1.insertAnswer(eid, sid, i, type, (String) map.get("judge" + i));
            } else if (map.get("sub" + i) != null) {
                type = 3;
                tbExaminationService1.insertAnswer(eid, sid, i, type, (String) map.get("sub" + i));
            }
        }
        if (map.size() != 0) {
            return ResultObject.createSuccessWithData("");
        } else {
            return ResultObject.createErrorWithData("提交失败");
        }
    }

    @RequestMapping(value = "/updateSubmitStatus", method = RequestMethod.POST)
    public ResultObject updateSubmitStatus(int submitStatus, int eid) {

        return ResultObject.createSuccessWithData(tbExaminationService1.updateSubmitStatus(submitStatus, eid));
    }


    @RequestMapping(value = "/searchMyScore", method = RequestMethod.GET)
    public ResultObject searchMyScore() {
        TbUser tbUser = (TbUser) SecurityUtils.getSubject().getPrincipal();
        int uid = tbUser.getId();
        return ResultObject.createSuccessWithData(tbExaminationService1.searchMyScore(uid));
    }

}
