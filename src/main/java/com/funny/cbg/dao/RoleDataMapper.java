package com.funny.cbg.dao;

import com.funny.cbg.entity.RoleDataEntity;
import com.funny.cbg.entity.RoleSearch;

import java.util.List;

public interface RoleDataMapper {
    List<RoleDataEntity> findByCondition(RoleSearch roleSearch);
}