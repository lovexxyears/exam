package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.dao.TbQuestionCodeDao;
import com.lanou.dao.TbQuestionJudgeDao;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionCode;
import com.lanou.entity.TbQuestionJudge;
import com.lanou.entity.TbQuestionSubjective;
import com.lanou.service.TbQuestionCodeService;
import com.lanou.service.TbQuestionJudgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbQuestionJudgeServiceImpl implements TbQuestionJudgeService {
    @Autowired
    private TbQuestionJudgeDao tbQuestionJudgeDao;

    @Override
    public PageInfo<TbQuestionJudge> selectAll(int page, int limit) {
        PageHelper.startPage(page,limit);
        PageInfo<TbQuestionJudge> pageInfo=new PageInfo<TbQuestionJudge>(tbQuestionJudgeDao.selectAll());
        return pageInfo;
    }

    @Override
    public int insertQuestion(TbQuestionJudge tbQuestionJudge) {
        return tbQuestionJudgeDao.insertQuestion(tbQuestionJudge);
    }

    @Override
    public TbQuestionJudge getQuestionById(int id) {
        return tbQuestionJudgeDao.getQuestionById(id);
    }

    @Override
    public int updateQuestion(TbQuestionJudge tbQuestionJudge) {
        return tbQuestionJudgeDao.updateQuestion(tbQuestionJudge);
    }

    @Override
    public int deleteById(int id) {
        return tbQuestionJudgeDao.deleteById(id);
    }

    @Override
    public PageInfo<TbQuestionJudge> searchQuestion(TbQuestionJudge tbQuestionJudge, int page, int limit) {
        PageHelper.startPage(page,limit);
        PageInfo<TbQuestionJudge> pageInfo=new PageInfo<TbQuestionJudge>(tbQuestionJudgeDao.searchQuestion(tbQuestionJudge));
        return pageInfo;
    }

    @Override
    public List<TbQuestionJudge> selectCode(TbQuestionJudge tbQuestionJudge) {
        return tbQuestionJudgeDao.searchQuestion(tbQuestionJudge);
    }

    @Override
    public List<TbQuestionJudge> selectByEId(int eid) {
        return tbQuestionJudgeDao.selectByEId(eid);
    }

    @Override
    public List<TbQuestionJudge> selectByEIdAndUId(int eid, int sid) {
        return tbQuestionJudgeDao.selectByEIdAndUId(eid,sid);
    }
}
