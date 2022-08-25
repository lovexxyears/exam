package com.lanou.controller;


import com.lanou.entity.ResultObject;
import com.lanou.entity.TbUser;
import com.lanou.entity.UserInfo;
import com.lanou.service.ClazzService;
import com.lanou.service.UserService;
import lombok.extern.log4j.Log4j;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log4j
@RequestMapping("/student")
@RestController
public class StudentController {
    @Autowired
    private UserService userService;

    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监"})
    @RequestMapping(value = "/insertStudents", method = RequestMethod.POST)
    public ResultObject insertStudents(UserInfo userInfo, int clazzid) {
        userService.insertStudents(userInfo, clazzid);
        return ResultObject.createSuccessWithData("");
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监", "讲师"})
    @RequestMapping(value = "/queryByPage", method = RequestMethod.POST)
    public ResultObject queryByPage(int page) {
        return ResultObject.createSuccessWithData(userService.selectAllStudents(page));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监"})
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public ResultObject addStudent(UserInfo info,int clazzid){
        log.debug("----info"+info);
        return ResultObject.createSuccessWithData(userService.insertStudents(info,clazzid));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监"})
    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public ResultObject getAllStudents(int id){
        return ResultObject.createSuccessWithData(userService.queryStudent(id));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监"})
    @RequestMapping(value = "/updateById",method = RequestMethod.POST)
    public ResultObject updataStudent(int id,int clazzId ,String major){
        return ResultObject.createSuccessWithData(userService.updataStudent(id,clazzId,major));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员"})
    @RequestMapping(value = "/deleteById",method = RequestMethod.POST)
    public ResultObject deleteStudent(int id){
        return ResultObject.createSuccessWithData(userService.deleteStudent(id));
    }


    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监", "讲师"})
    @RequestMapping(value = "/querySercher", method = {RequestMethod.GET, RequestMethod.POST})
    public ResultObject querySercher(String keyword, int page) {
        return ResultObject.createSuccessWithData(userService.selectByKeyWord(keyword, page));
    }
}
