package com.lanou.controller;

import com.lanou.entity.ResultObject;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;

@Log4j
@RequestMapping("/run")
@RestController
public class RunTest {

    @RequestMapping("/test")
    public ResultObject result(String code){
        log.debug(code);



        return ResultObject.createSuccessWithData("");
    }
}
