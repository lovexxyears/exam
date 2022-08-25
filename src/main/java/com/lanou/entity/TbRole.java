package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class TbRole implements Serializable {
    private int id;
    private String roleName;
}
