package com.funny.txstack.dao.stat;


import com.funny.txstack.base.BaseMapper;
import com.funny.txstack.model.entity.CbgRoleEntity;

import java.util.List;

public interface CbgRoleMapper extends BaseMapper<CbgRoleEntity> {
    List<CbgRoleEntity> findByCondition();

    int deleteRole(Long id);
}