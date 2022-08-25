//package com.lanou.controller;
//
//import com.lanou.entity.Question;
//import org.apache.shiro.authz.annotation.Logical;
//import org.apache.shiro.authz.annotation.RequiresRoles;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//@RequestMapping("/question")
//public class QuestionController {
//
//    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监", "讲师"})
//    @RequestMapping("/queryAll")
//    public ModelAndView queryAll() {
//        ModelAndView mav = new ModelAndView();
//        List<Question> list=new ArrayList<Question>();
//        list.add(new Question(1,"第一题","答案1"));
//        list.add(new Question(2,"第二题","答案2"));
//        list.add(new Question(2,"第三题","答案3"));
//        list.add(new Question(2,"第四题","答案4"));
//        mav.addObject("list",list);
//        mav.setViewName("question_list");
//        return mav;
//    }
//}
