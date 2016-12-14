package com.funny.txstack.service;

import com.funny.txstack.entity.cbg.CbgSearch;
import com.funny.txstack.entity.cbg.CbgDataEntity;
import com.github.pagehelper.PageInfo;

/**
 * Created by funny on 16/11/17.
 */
public interface CbgRoleService {
    PageInfo<CbgDataEntity> findByCondition(CbgSearch cbgSearch);

    int deleteRole(Long id);
}
