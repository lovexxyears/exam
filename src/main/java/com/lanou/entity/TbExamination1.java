package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TbExamination1 implements Serializable {
    private int id;
    private int clazzId;
    private int perid;
    private int status;
    private Date created;
    private int submitStatus;
    private UserInfo userInfo;
    private TbClazz tbClazz;
}
