package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbUser implements Serializable {
    private int id;
    private String account;
    private String password;
    private TbRole role;
}
