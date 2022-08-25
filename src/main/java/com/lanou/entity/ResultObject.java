package com.lanou.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class ResultObject implements Serializable {
    private int status;
    private String info;
    private Object data;

    public static ResultObject creatResult(int status,String info,Object data){
        ResultObject obj=new ResultObject();
        obj.setStatus(status);
        obj.setData(data);
        obj.setInfo(info);
        return obj;
    }
    public static ResultObject createSuccessWithData(Object data){
       return creatResult(0,"请求成功",data);
    }

        public static ResultObject createErrorWithData(String info){
        return creatResult(1,info,null);
    }
}
