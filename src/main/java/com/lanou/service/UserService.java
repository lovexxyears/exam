package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.entity.TbClazz;
import com.lanou.entity.TbUser;
import com.lanou.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    TbUser selectByAccount(TbUser tbUser);

    List<UserInfo> queryTeachers();

    // begin  student-list
    int insertStudents(UserInfo userInfo, int clazzid);

    PageInfo<UserInfo> selectAllStudents(int page);

    UserInfo queryStudent(int id);

    int updataStudent(int id, int clazzId, String major);

    int deleteStudent(int id);

    PageInfo<UserInfo> selectByKeyWord(String keyword,int page);
    // end  student-list

    // begin  teacher-list
    PageInfo<UserInfo> selectAllTeachers(int page);

    int insertTeacher(UserInfo userInfo,TbUser tbUser, int clazzid);

    UserInfo queryTeacher(int id);

    int updataTeacher(int id, int clazzId, String major);

    int deleteTeacher(int id);

    PageInfo<UserInfo> selectTeacherByKeyWord(String keyword,int page);
    // end  student-list


    PageInfo<UserInfo> selectAllStudentsByEId(int page, int limit,int eid);


    PageInfo<UserInfo> selectAllStudentsRestultByEId(int page, int limit,int eid);

}
