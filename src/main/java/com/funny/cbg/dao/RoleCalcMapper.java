package com.funny.cbg.dao;

import com.funny.cbg.entity.RoleCalcEntity;

import java.util.List;

public interface RoleCalcMapper {
    List<RoleCalcEntity> findByCondition();
}