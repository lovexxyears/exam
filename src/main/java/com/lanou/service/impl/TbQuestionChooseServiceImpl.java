package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.dao.TbQuestionChooseDao;
import com.lanou.entity.TbExamination;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbQuestionSubjective;
import com.lanou.service.TbQuestionChooseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbQuestionChooseServiceImpl implements TbQuestionChooseService {
    @Autowired
    private TbQuestionChooseDao tbQuestionChooseDao;

    @Override
    public PageInfo<TbQuestionChoose> selectAll(int page, int limit) {
        PageHelper.startPage(page,limit);
        PageInfo<TbQuestionChoose> pageInfo=new PageInfo<TbQuestionChoose>(tbQuestionChooseDao.selectAll());
        return pageInfo;
    }

    @Override
    public int insertQuestion(TbQuestionChoose tbQuestionChoose) {
        return tbQuestionChooseDao.insertQuestion(tbQuestionChoose);
    }

    @Override
    public TbQuestionChoose getQuestionById(int id) {
        return tbQuestionChooseDao.getQuestionById(id);
    }

    @Override
    public int updateQuestion(TbQuestionChoose tbQuestionChoose) {
        return tbQuestionChooseDao.updateQuestion(tbQuestionChoose);
    }

    @Override
    public int deleteById(int id) {
        return tbQuestionChooseDao.deleteById(id);
    }

    @Override
    public PageInfo<TbQuestionChoose> searchQuestion(TbQuestionChoose tbQuestionChoose, int page, int limit) {
        PageHelper.startPage(page,limit);
        PageInfo<TbQuestionChoose> pageInfo=new PageInfo<TbQuestionChoose>(tbQuestionChooseDao.searchQuestion(tbQuestionChoose));

        return pageInfo;
    }

    @Override
    public List<TbQuestionChoose> selectCloose(TbQuestionChoose tbQuestionChoose) {
        return tbQuestionChooseDao.searchQuestion(tbQuestionChoose);
    }

    @Override
    public List<TbQuestionChoose> selectByEId(int eid) {
        return tbQuestionChooseDao.selectByEId(eid);
    }

    @Override
    public List<TbQuestionChoose> selectByEIdAndUId(int eid, int sid) {
        return tbQuestionChooseDao.selectByEIdAndUId(eid,sid);
    }
}
