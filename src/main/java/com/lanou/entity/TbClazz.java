package com.lanou.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class TbClazz implements Serializable {
    private int id;
    private String clazzName;
    private List<TbUser> students;
    private UserInfo per;

    //    @JSONField(format = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String start;
    private String major;
    private int status;
    private int count;
    private int perid;



}
