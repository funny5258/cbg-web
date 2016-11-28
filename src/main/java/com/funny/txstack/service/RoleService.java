package com.funny.txstack.service;

import com.funny.txstack.entity.cbg.RoleDataEntity;
import com.funny.txstack.entity.cbg.RoleSearch;
import com.github.pagehelper.PageInfo;

/**
 * Created by funny on 16/11/17.
 */
public interface RoleService {
    PageInfo<RoleDataEntity> findByCondition(RoleSearch roleSearch);
}
