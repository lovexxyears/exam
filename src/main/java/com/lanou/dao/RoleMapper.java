package com.lanou.dao;

import com.lanou.entity.TbRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {

    List<String> queryByUserId(@Param("id") int id);
}
