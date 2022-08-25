package com.lanou.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lanou.entity.ResultObject;
import com.lanou.entity.TbClazz;
import com.lanou.service.ClazzService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j
@RestController
@RequestMapping("/clazz")
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @RequiresRoles(logical = Logical.OR, value = {"管理员", "教学总监", "讲师"})
    @RequestMapping(value = "/queryByPage", method = {RequestMethod.GET, RequestMethod.POST})
    public ResultObject queryClazzByPage(int page) {
        return ResultObject.createSuccessWithData(clazzService.selectAll(page));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员", "教学总监", "讲师"})
    @RequestMapping(value = "/querySercher", method = {RequestMethod.GET, RequestMethod.POST})
    public ResultObject querySercher(String keyword, int page) {
        return ResultObject.createSuccessWithData(clazzService.selectByKeyWord(keyword, page));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员", "教学总监"})
    @RequestMapping("/addClazz")
    public ResultObject addClazz(TbClazz tbClazz, int perid) {
        return ResultObject.createSuccessWithData(clazzService.addClazz(tbClazz, perid));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员", "教学总监"})
    @RequestMapping("/getById")
    public ResultObject queryById(int id) {
        return ResultObject.createSuccessWithData(clazzService.queryById(id));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员", "教学总监"})
    @RequestMapping("/updateById")
    public ResultObject updateById(int id, int perid) {
        return ResultObject.createSuccessWithData(clazzService.updateById(id, perid));
    }

    @RequiresRoles(value = {"管理员"})
    @RequestMapping("/deleteById")
    public ResultObject deleteById(int id) {
        return ResultObject.createSuccessWithData(clazzService.deleteById(id));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员", "教学总监"})
    @RequestMapping("/queryAll")
    public ResultObject queryAllTeacher() {
        return ResultObject.createSuccessWithData(clazzService.queryTeachers());
    }

    @RequestMapping("/queryAllClazz")
    public ResultObject queryAllClazz(int perid) {
        return ResultObject.createSuccessWithData(clazzService.queryAllClazz(perid));
    }
}
