package com.funny.cbg.dao;

import com.funny.cbg.entity.RoleDataEntity;

import java.util.List;

public interface RoleDataMapper {
    List<RoleDataEntity> findByCondition();
}