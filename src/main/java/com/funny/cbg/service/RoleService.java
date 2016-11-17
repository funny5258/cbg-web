package com.funny.cbg.service;

import com.funny.cbg.entity.RoleDataEntity;
import com.funny.cbg.entity.RoleSearch;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by funny on 16/11/17.
 */
public interface RoleService {
    PageInfo<RoleDataEntity> findByCondition(RoleSearch roleSearch);
}
