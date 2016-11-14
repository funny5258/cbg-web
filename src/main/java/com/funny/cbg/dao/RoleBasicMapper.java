package com.funny.cbg.dao;


import com.funny.cbg.entity.RoleBasicEntity;

import java.util.List;

public interface RoleBasicMapper {
    List<RoleBasicEntity> findByCondition();
}