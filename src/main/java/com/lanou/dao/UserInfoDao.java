package com.lanou.dao;

import com.lanou.entity.TbClazz;
import com.lanou.entity.TbUser;
import com.lanou.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoDao {
    List<UserInfo> queryTeachersInfo();

    int insertUserInfo(@Param("info") UserInfo info);

    List<UserInfo> selectAllStudents(@Param("keyword") String keyword);

    UserInfo selectById(@Param("id") int id);

    int updateByUid(@Param("uid") int uid,@Param("major") String major);

    int deleteById(@Param("uid") int uid);

    //begin  teacher_list
    List<UserInfo> selectAllTeachers(@Param("keyword") String keyword);

    UserInfo selectTeacherById(@Param("id") int id);
    //end  teacher_list

    List<UserInfo> selectAllStudentsByEId(@Param("eid") int eid);


    List<UserInfo> selectAllStudentsRestultByEId(@Param("eid") int eid);

}
