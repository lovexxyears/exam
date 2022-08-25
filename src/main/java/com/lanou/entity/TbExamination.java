package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TbExamination implements Serializable {
    private int id;
    private String major;
    private int level;
    private String seg;
    private int perid;
    private Date created;
    private UserInfo userInfo;
}
