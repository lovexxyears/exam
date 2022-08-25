package com.lanou.controller;

import com.lanou.entity.ResultObject;
import com.lanou.entity.TbUser;
import com.lanou.service.UserService;
import com.lanou.service.impl.SystemLogoutFilter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * 用户以及登录管理
 */
@Log4j
//@RestController
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监", "讲师"})
//    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监", "讲师","学生"})
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultObject login(TbUser tbUser) {
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(tbUser.getAccount(), tbUser.getPassword());
        try {
            subject.login(token);
            return ResultObject.createSuccessWithData("");
        } catch (AuthenticationException e) {
            return ResultObject.createErrorWithData("登陆失败");
        }

//        TbUser result = userService.selectByAccount(tbUser);
//        if (result != null) {
//            session.setAttribute("loginUser", result);
//            return ResultObject.createSuccessWithData(null);
//        } else {
//            return ResultObject.createErrorWithData("登陆失败");
//        }
    }

    @ResponseBody
    @RequestMapping(value = "/queryMy", method = RequestMethod.POST)
    public ResultObject queryAct() {
        Subject subject = SecurityUtils.getSubject();
        List<String> list = new ArrayList<String>();
        list.add("管理员");
        list.add("教学总监");
        list.add("讲师");
        list.add("学生");
        boolean[] roles = subject.hasRoles(list);
        Map<String, Object> map = new HashMap<>();

        map.put("user", subject.getPrincipal());
        map.put("roles", roles);
//        log.debug(Arrays.toString(roles));
//        System.out.println(SecurityUtils.getSubject());
//        System.out.println(SecurityUtils.getSubject().getPrincipal()+"--------------------------------ddddddddddddddddddd");
//        return ResultObject.createSuccessWithData(SecurityUtils.getSubject().getPrincipal());
        return ResultObject.createSuccessWithData(map);
    }

    @ResponseBody
    @RequestMapping(value = "/queryLogin", method = RequestMethod.POST)
    public ResultObject queryLogin() {
        return ResultObject.createSuccessWithData(SecurityUtils.getSubject().getPrincipal());
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        SecurityUtils.getSubject().logout();
        return "redirect:/static/login.html";
//        return "login";
    }

}
