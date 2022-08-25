package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.entity.TbClazz;

import java.util.List;

public interface ClazzService {
    PageInfo<TbClazz> selectAll(int page);

    PageInfo<TbClazz> selectByKeyWord(String keyword,int page);

    int addClazz(TbClazz tbClazz,int perid);


    TbClazz queryById(int id);

    int  updateById(int id, int perid);

     int deleteById(int id);

     List<TbClazz> queryTeachers();

     List<TbClazz> queryAllClazz(int perid);
}
