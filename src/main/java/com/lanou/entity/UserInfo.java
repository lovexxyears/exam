package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {
    private int id;
    private String realName;
    private String phone;
    private String major;
    private TbUser tbUser;
    private int uid;
    private TbClazz tbClazz;
    private Answer answer;
}
