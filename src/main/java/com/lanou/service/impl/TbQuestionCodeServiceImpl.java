package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.dao.TbQuestionChooseDao;
import com.lanou.dao.TbQuestionCodeDao;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionCode;
import com.lanou.entity.TbQuestionSubjective;
import com.lanou.service.TbQuestionChooseService;
import com.lanou.service.TbQuestionCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbQuestionCodeServiceImpl implements TbQuestionCodeService {
    @Autowired
    private TbQuestionCodeDao tbQuestionCodeDao;

    @Override
    public PageInfo<TbQuestionCode> selectAll(int page, int limit) {
        PageHelper.startPage(page,limit);
        PageInfo<TbQuestionCode> pageInfo=new PageInfo<TbQuestionCode>(tbQuestionCodeDao.selectAll());
        return pageInfo;
    }

    @Override
    public int insertQuestion(TbQuestionCode tbQuestionCode) {
        return tbQuestionCodeDao.insertQuestion(tbQuestionCode);
    }

    @Override
    public TbQuestionCode getQuestionById(int id) {
        return tbQuestionCodeDao.getQuestionById(id);
    }

    @Override
    public int updateQuestion(TbQuestionCode tbQuestionCode) {
        return tbQuestionCodeDao.updateQuestion(tbQuestionCode);
    }

    @Override
    public int deleteById(int id) {
        return tbQuestionCodeDao.deleteById(id);
    }

    @Override
    public PageInfo<TbQuestionCode> searchQuestion(TbQuestionCode tbQuestionCode, int page, int limit) {
        PageHelper.startPage(page,limit);
        PageInfo<TbQuestionCode> pageInfo=new PageInfo<TbQuestionCode>(tbQuestionCodeDao.searchQuestion(tbQuestionCode));
        return pageInfo;
    }

    @Override
    public List<TbQuestionCode> selectCode(TbQuestionCode tbQuestionCode) {
        return tbQuestionCodeDao.searchQuestion(tbQuestionCode);
    }
    @Override
    public List<TbQuestionCode> selectByEId(int eid) {
        return tbQuestionCodeDao.selectByEId(eid);
    }

    @Override
    public List<TbQuestionCode> selectByEIdAndUId(int eid, int sid) {
        return tbQuestionCodeDao.selectByEIdAndUId(eid,sid);
    }
}
