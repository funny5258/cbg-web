package com.funny.txstack.dao.cbg;

import com.funny.txstack.common.BaseMapper;
import com.funny.txstack.entity.cbg.CbgRoleEntity;

import java.util.List;

public interface CbgRoleMapper extends BaseMapper<CbgRoleEntity> {
    List<CbgRoleEntity> findByCondition();

    int deleteRole(Long id);
}