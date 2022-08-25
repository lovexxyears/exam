package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.dao.ClazzDao;
import com.lanou.entity.TbClazz;
import com.lanou.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    private ClazzDao clazzDao;

    @Override
    public PageInfo<TbClazz> selectAll(int page) {
        PageHelper.startPage(page, 10);
        PageInfo<TbClazz> pageInfo = new PageInfo<TbClazz>(clazzDao.selectAll(null));
        return pageInfo;
    }

    @Override
    public PageInfo<TbClazz> selectByKeyWord(String keyword, int page) {
        PageHelper.startPage(page, 10);
        return new PageInfo<TbClazz>(clazzDao.selectAll(keyword));
    }

    @Override
    public int addClazz(TbClazz tbClazz, int perid) {
        return clazzDao.addClazz(tbClazz, perid);
    }


    @Override
    public TbClazz queryById(int id) {
        return clazzDao.queryById(id);
    }

    @Override
    public int updateById(int id, int perid) {
        return clazzDao.updateById(id, perid);
    }

    @Override
    public int deleteById(int id) {
        return clazzDao.deleteById(id);
    }

    @Override
    public List<TbClazz> queryTeachers() {
        return clazzDao.queryAll();
    }

    @Override
    public List<TbClazz> queryAllClazz(int perid) {
        return clazzDao.queryAllClazz(perid);
    }
}
