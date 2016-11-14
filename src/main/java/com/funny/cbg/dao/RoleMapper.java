package com.funny.cbg.dao;


import com.funny.cbg.entity.RoleEntity;

import java.util.List;

public interface RoleMapper {
    List<RoleEntity> findByCondition();
}