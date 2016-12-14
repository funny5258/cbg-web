package com.funny.txstack.dao.cbg;

import java.util.List;

import com.funny.txstack.common.BaseMapper;
import com.funny.txstack.entity.cbg.BangRoleEntity;
import com.funny.txstack.entity.cbg.BangSearch;

public interface BangRoleMapper extends BaseMapper<BangRoleEntity> {
    List<BangRoleEntity> findByCondition(BangSearch bangSearch);
}