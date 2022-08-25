package com.lanou.dao;

import com.lanou.entity.TbClazz;
import com.lanou.entity.TbUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClazzDao {
    List<TbClazz> selectAll(@Param("keyword")String keyword);

    int addClazz(@Param("clazz") TbClazz tbClazz, @Param("perid")int perid);


    int  updateById(@Param("id")int id, @Param("perid")int perid);

    TbClazz queryById(@Param("id")int id);

    int deleteById(@Param("id") int id);

    int deleteRelation(@Param("id")int id);

    List<TbClazz> queryAll();

    List<TbClazz> queryAllClazz(@Param("perid") int perid);
}
