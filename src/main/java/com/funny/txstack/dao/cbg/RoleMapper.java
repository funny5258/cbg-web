package com.funny.txstack.dao.cbg;

import com.funny.txstack.common.BaseMapper;
import com.funny.txstack.entity.cbg.RoleEntity;

import java.util.List;

public interface RoleMapper extends BaseMapper<RoleEntity> {
    List<RoleEntity> findByCondition();

    int deleteRole(Long id);
}