package com.lanou.controller;

import lombok.SneakyThrows;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
@RequestMapping("/file")
public class FileController {
    @SneakyThrows
    @RequiresRoles(logical = Logical.OR, value = {"管理员","教学总监", "讲师"})
    @ResponseBody
    @RequestMapping("/upload.do")
    public String upload(MultipartFile li){
        System.out.println(li.getName());
        li.transferTo(new File("E:/upload/"+li.getOriginalFilename()));
        return "fafaesf";
    }
}

