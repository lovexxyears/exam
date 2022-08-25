package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.dao.TbQuestionJudgeDao;
import com.lanou.dao.TbQuestionSubjectiveDao;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionCode;
import com.lanou.entity.TbQuestionJudge;
import com.lanou.entity.TbQuestionSubjective;
import com.lanou.service.TbQuestionJudgeService;

import com.lanou.service.TbQuestionSubjectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbQuestionSubjectiveServiceImpl implements TbQuestionSubjectiveService {
    @Autowired
    private TbQuestionSubjectiveDao tbQuestionSubjectiveDao;

    @Override
    public PageInfo<TbQuestionSubjective> selectAll(int page, int limit) {
        PageHelper.startPage(page,limit);
        PageInfo<TbQuestionSubjective> pageInfo=new PageInfo<TbQuestionSubjective>(tbQuestionSubjectiveDao.selectAll());
        return pageInfo;
    }

    @Override
    public int insertQuestion(TbQuestionSubjective tbQuestionSubjective) {
        return tbQuestionSubjectiveDao.insertQuestion(tbQuestionSubjective);
    }

    @Override
    public TbQuestionSubjective getQuestionById(int id) {
        return tbQuestionSubjectiveDao.getQuestionById(id);
    }

    @Override
    public int updateQuestion(TbQuestionSubjective tbQuestionSubjective) {
        return tbQuestionSubjectiveDao.updateQuestion(tbQuestionSubjective);
    }

    @Override
    public int deleteById(int id) {
        return tbQuestionSubjectiveDao.deleteById(id);
    }

    @Override
    public PageInfo<TbQuestionSubjective> searchQuestion(TbQuestionSubjective tbQuestionSubjective, int page, int limit) {
        PageHelper.startPage(page,limit);
        PageInfo<TbQuestionSubjective> pageInfo=new PageInfo<TbQuestionSubjective>(tbQuestionSubjectiveDao.searchQuestion(tbQuestionSubjective));
        return pageInfo;
    }

    @Override
    public List<TbQuestionSubjective> selectCode(TbQuestionSubjective tbQuestionSubjective) {
        return tbQuestionSubjectiveDao.searchQuestion(tbQuestionSubjective);
    }

    @Override
    public List<TbQuestionSubjective> selectByEId(int eid) {
        return tbQuestionSubjectiveDao.selectByEId(eid);
    }
    @Override
    public List<TbQuestionSubjective> selectByEIdAndUId(int eid,int sid) {
        return tbQuestionSubjectiveDao.selectByEIdAndUId(eid,sid);
    }

}
