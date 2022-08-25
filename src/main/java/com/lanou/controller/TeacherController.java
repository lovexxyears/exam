package com.lanou.controller;


import com.lanou.entity.ResultObject;
import com.lanou.entity.TbUser;
import com.lanou.entity.UserInfo;
import com.lanou.service.UserService;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private UserService userService;

    /**
     * 班级列表，添加班级是查询教师姓名
     * @return
     */
    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监"})
    @RequestMapping("/queryAll")
    public ResultObject queryAllTeacher() {
        return ResultObject.createSuccessWithData(userService.queryTeachers());
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监", "讲师"})
    @RequestMapping(value = "/queryByPage", method = RequestMethod.POST)
    public ResultObject queryByPage(int page) {
        return ResultObject.createSuccessWithData(userService.selectAllTeachers(page));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监"})
    @RequestMapping(value = "/addTeacher",method = RequestMethod.POST)
    public ResultObject addTeacher(UserInfo info, TbUser tbUser, int clazzid){
        return ResultObject.createSuccessWithData(userService.insertTeacher(info,tbUser,clazzid));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监"})
    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public ResultObject getTeacher(int id){
        return ResultObject.createSuccessWithData(userService.queryTeacher(id));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监"})
    @RequestMapping(value = "/updateById",method = RequestMethod.POST)
    public ResultObject updataStudent(int id,int clazzId ,String major){
        return ResultObject.createSuccessWithData(userService.updataTeacher(id,clazzId,major));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员"})
    @RequestMapping(value = "/deleteById",method = RequestMethod.POST)
    public ResultObject deleteTeacher(int id){
        return ResultObject.createSuccessWithData(userService.deleteTeacher(id));
    }

    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监", "讲师"})
    @RequestMapping(value = "/querySercher", method = {RequestMethod.GET, RequestMethod.POST})
    public ResultObject querySercher(String keyword, int page) {
        return ResultObject.createSuccessWithData(userService.selectTeacherByKeyWord(keyword, page));
    }
}
