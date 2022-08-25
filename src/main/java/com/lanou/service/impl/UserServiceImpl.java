package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.dao.ClazzDao;
import com.lanou.dao.UserDao;
import com.lanou.dao.UserInfoDao;
import com.lanou.entity.TbClazz;
import com.lanou.entity.TbRole;
import com.lanou.entity.TbUser;
import com.lanou.entity.UserInfo;
import com.lanou.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private ClazzDao clazzDao;

    @Override
    public TbUser selectByAccount(TbUser tbUser) {
        return userDao.selectByAccount(tbUser);
    }

    @Override
    public List<UserInfo> queryTeachers() {
        return userInfoDao.queryTeachersInfo();
    }

    @Override
    public int insertStudents(UserInfo info, int clazzid) {
        //启动事物

        //1.创建一个user对象 保存在数据库中  痛死获得User对象的id
        TbUser tbUser = new TbUser();
        tbUser.setAccount(info.getPhone());
        tbUser.setPassword("1234");

        TbRole role = new TbRole();
        role.setId(4);
        tbUser.setRole(role);
        userDao.insertUser(tbUser);
        System.out.println(tbUser.getId() + "-----------------------------------------");
        System.out.println(clazzid+"----------------------------");
        //2.将user对象的id和clazzid保存在r——student_clazz表中
        userDao.insertRelation(tbUser.getId(), clazzid);

        //保存userinfo
        info.setTbUser(tbUser);
        return userInfoDao.insertUserInfo(info);
        //关闭事物
    }

    @Override
    public PageInfo<UserInfo> selectAllStudents(int page) {
        PageHelper.startPage(page,10);
        PageInfo<UserInfo> info = new PageInfo<UserInfo>(userInfoDao.selectAllStudents(null));
        return info;
    }

    @Override
    public UserInfo queryStudent(int id) {
        return userInfoDao.selectById(id);
    }

    @Override
    public int updataStudent(int id, int clazzId, String major) {
        userInfoDao.updateByUid(id,major);
        userDao.updateRelation(id, clazzId);
        return 0;
    }

    @Override
    public int deleteStudent(int id) {
        userInfoDao.deleteById(id);
        userDao.deleteById(id);
        userDao.deleteRelation(id);

        return 0;
    }

    @Override
    public PageInfo<UserInfo> selectByKeyWord(String keyword, int page) {
        PageHelper.startPage(page, 10);
        return new PageInfo<UserInfo>(userInfoDao.selectAllStudents(keyword));
    }


    // begin  teacher-list
    @Override
    public PageInfo<UserInfo> selectAllTeachers(int page) {
        PageHelper.startPage(page,10);
        PageInfo<UserInfo> info = new PageInfo<UserInfo>(userInfoDao.selectAllTeachers(null));
        return info;
    }

    @Override
    public int insertTeacher(UserInfo info,TbUser tbUser, int clazzid) {
        //启动事物

        //1.创建一个user对象 保存在数据库中  痛死获得User对象的id
        tbUser.setPassword("1234");

        TbRole role = new TbRole();
        role.setId(3);
        tbUser.setRole(role);
        userDao.insertUser(tbUser);
        System.out.println(tbUser.getId() + "-----------------------------------------");
        System.out.println(clazzid+"----------------------------");
        //2.将user对象的id和clazzid保存在r——student_clazz表中
        userDao.insertTCRelation(tbUser.getId(), clazzid);

        //保存userinfo
        info.setTbUser(tbUser);
        return userInfoDao.insertUserInfo(info);
        //关闭事物
    }

    @Override
    public UserInfo queryTeacher(int id) {
        return userInfoDao.selectTeacherById(id);
    }

    @Override
    public int updataTeacher(int id, int clazzId, String major) {
        clazzDao.updateById(clazzId,id);
        userInfoDao.updateByUid(id,major);
        userDao.updateTCRelation(id, clazzId);
        return 0;
    }

    @Override
    public int deleteTeacher(int id) {
        userInfoDao.deleteById(id);
        userDao.deleteById(id);
        userDao.deleteTCRelation(id);
        return 0;
    }

    @Override
    public PageInfo<UserInfo> selectTeacherByKeyWord(String keyword, int page) {
        PageHelper.startPage(page, 10);
        return new PageInfo<UserInfo>(userInfoDao.selectAllTeachers(keyword));
    }

    @Override
    public PageInfo<UserInfo> selectAllStudentsByEId(int page, int limit, int eid) {
        PageHelper.startPage(page,limit);
        PageInfo<UserInfo> info = new PageInfo<UserInfo>(userInfoDao.selectAllStudentsByEId(eid));
        return info;
    }
    @Override
    public PageInfo<UserInfo> selectAllStudentsRestultByEId(int page, int limit, int eid) {
        PageHelper.startPage(page,limit);
        PageInfo<UserInfo> info = new PageInfo<UserInfo>(userInfoDao.selectAllStudentsRestultByEId(eid));
        return info;
    }

    // end  teacher-list
}
