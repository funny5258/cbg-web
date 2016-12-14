package com.funny.txstack.service;

import com.funny.txstack.entity.cbg.BangRoleEntity;
import com.funny.txstack.entity.cbg.BangSearch;
import com.github.pagehelper.PageInfo;

/**
 * Created by funny on 16/11/17.
 */
public interface BangRoleService {
    PageInfo<BangRoleEntity> findByCondition(BangSearch bangSearch);

}
