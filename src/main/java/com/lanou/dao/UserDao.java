package com.lanou.dao;

import com.lanou.entity.TbUser;
import com.lanou.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    TbUser select4Shire(@Param("username") String username);

    TbUser selectByAccount(@Param("user") TbUser tbUser);

    List<TbUser> queryTeachers();

    int insertUser(@Param("user") TbUser tbUser);

    int insertRelation(@Param("uid") int uid,@Param("cid")int cid);

    int insertTCRelation(@Param("uid") int uid,@Param("cid")int cid);

    int updateRelation(@Param("uid") int uid,@Param("cid")int cid);

    int updateTCRelation(@Param("uid") int uid,@Param("cid")int cid);

    int deleteById( @Param("id") int id);

    int deleteRelation(@Param("uid") int uid);

    int deleteTCRelation(@Param("uid") int uid);
}
