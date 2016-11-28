package com.funny.txstack.dao.cbg;

import com.funny.txstack.common.BaseMapper;
import com.funny.txstack.entity.cbg.RoleDataEntity;
import com.funny.txstack.entity.cbg.RoleSearch;

import java.util.List;

public interface RoleDataMapper extends BaseMapper<RoleDataEntity> {
    List<RoleDataEntity> findByCondition(RoleSearch roleSearch);
}