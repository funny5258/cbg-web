package com.funny.cbg.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funny.cbg.dao.RoleDataMapper;
import com.funny.cbg.entity.RoleDataEntity;
import com.funny.cbg.entity.RoleSearch;
import com.funny.cbg.service.RoleService;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by funny on 16/11/17.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDataMapper roleDataMapper;

    @Override
    public PageInfo<RoleDataEntity> findByCondition(RoleSearch roleSearch) {
        PageHelper.startPage(roleSearch.getPageNo(), roleSearch.getPageSize());
        PageHelper.orderBy("r.id desc");
        List<RoleDataEntity> roleDataEntities = roleDataMapper.findByCondition(roleSearch);
        return new PageInfo<>(roleDataEntities);
    }
}
