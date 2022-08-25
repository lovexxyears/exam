package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.dao.TbExaminationDao;
import com.lanou.entity.TbExamination;
import com.lanou.entity.TbQuestionChoose;
import com.lanou.entity.TbUser;
import com.lanou.service.TbExaminationService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Log4j
@Service
public class TbExaminationServiceImpl implements TbExaminationService {
    @Autowired
    private TbExaminationDao tbExaminationDao;

    @Override
    public PageInfo<TbExamination> selectAll(int page, int limit) {
        PageHelper.startPage(page, limit);
        PageInfo<TbExamination> pageInfo = new PageInfo<TbExamination>(tbExaminationDao.selectAll());
        return pageInfo;
    }

    @Override
    public int insertExam(TbExamination tbExamination) {
        tbExamination.setCreated(new Date());
        return tbExaminationDao.insertExam(tbExamination);
    }

    /**
     * @param chooseScore 分值
     * @param cid         单选题id
     * @param eid         考试id
     * @return
     */
    @Override
    public int insertChoose(int chooseScore, int cid, int eid) {
        TbExamination tbExamination = tbExaminationDao.selectById(eid);
        int perid = tbExamination.getPerid();
        System.out.println(perid + "----");
        List<TbUser> list = tbExaminationDao.selectUId(perid);
        log.debug("cid" + cid);
        log.error("cid" + cid);
        log.debug(eid);
        log.debug(chooseScore);
        System.out.println("cid" + cid);
        System.out.println("size----" + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("---------" + list.get(i));
            int uid = list.get(i).getId();
            tbExaminationDao.insertChoose(chooseScore, cid, eid, uid);
        }
        return 0;
    }

    /**
     * @param codeScore 分值
     * @param cid       单选题id
     * @param eid       考试id
     * @return
     */
    @Override
    public int insertCode(int codeScore, int cid, int eid) {
        System.out.println(cid);
        TbExamination tbExamination = tbExaminationDao.selectById(eid);
        int perid = tbExamination.getPerid();
        System.out.println(perid + "--");
        List<TbUser> list = tbExaminationDao.selectUId(perid);

        for (int i = 0; i < list.size(); i++) {
            int uid = list.get(i).getId();
            System.out.println(uid + "--------");
            tbExaminationDao.insertCode(codeScore, cid, eid, uid);
        }
        return 0;
    }

    @Override
    public int insertJudge(int judgeScore, int cid, int eid) {
        TbExamination tbExamination = tbExaminationDao.selectById(eid);
        int perid = tbExamination.getPerid();
        List<TbUser> list = tbExaminationDao.selectUId(perid);
        for (int i = 0; i < list.size(); i++) {
            int uid = list.get(i).getId();
            System.out.println(uid + "--------");
            tbExaminationDao.insertJudge(judgeScore, cid, eid, uid);
        }
        return 0;
    }

    @Override
    public int insertSubjective(int subjectiveScore, int cid, int eid) {
        TbExamination tbExamination = tbExaminationDao.selectById(eid);
        int perid = tbExamination.getPerid();
        List<TbUser> list = tbExaminationDao.selectUId(perid);
        for (int i = 0; i < list.size(); i++) {
            int uid = list.get(i).getId();
            System.out.println(uid + "--------");
            tbExaminationDao.insertSubjective(subjectiveScore, cid, eid, uid);
        }
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return tbExaminationDao.deleteById(id);
    }

    @Override
    public PageInfo<TbExamination> searchExamination(TbExamination tbExamination, int page, int limit) {
        PageHelper.startPage(page, limit);
        PageInfo<TbExamination> pageInfo = new PageInfo<TbExamination>(tbExaminationDao.searchExamination(tbExamination));

        return pageInfo;
    }

    @Override
    public int deleteCHRByEId(int eid) {
        return tbExaminationDao.deleteCHRByEId(eid);
    }

    @Override
    public int deleteCORByEId(int eid) {
        return tbExaminationDao.deleteCORByEId(eid);
    }

    @Override
    public int deleteJRByEId(int eid) {
        return tbExaminationDao.deleteJRByEId(eid);
    }

    @Override
    public int deleteSRByEId(int eid) {
        return tbExaminationDao.deleteSRByEId(eid);
    }


}
