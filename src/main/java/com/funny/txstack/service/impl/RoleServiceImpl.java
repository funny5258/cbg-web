package com.funny.txstack.service.impl;

import com.funny.txstack.dao.cbg.RoleMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funny.txstack.dao.cbg.RoleDataMapper;
import com.funny.txstack.entity.cbg.RoleDataEntity;
import com.funny.txstack.entity.cbg.RoleSearch;
import com.funny.txstack.service.RoleService;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by funny on 16/11/17.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDataMapper roleDataMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public PageInfo<RoleDataEntity> findByCondition(RoleSearch roleSearch) {
        PageHelper.startPage(roleSearch.getPageNo(), roleSearch.getPageSize());
        if (roleSearch.getPrice_des() == null) {
            PageHelper.orderBy("r.id desc");
        } else {
            if (roleSearch.getPrice_des() == 1) {
                PageHelper.orderBy("r.price asc");
            } else if (roleSearch.getPrice_des() == 2) {
                PageHelper.orderBy("r.price desc");
            }
        }
        List<RoleDataEntity> roleDataEntities = roleDataMapper.findByCondition(roleSearch);
        return new PageInfo<>(roleDataEntities);
    }

    @Override
    public int deleteRole(Long id) {
        return roleMapper.deleteRole(id);
    }
}
