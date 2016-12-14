package com.funny.txstack.service.impl;

import com.funny.txstack.dao.cbg.CbgRoleMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funny.txstack.dao.cbg.CbgDataMapper;
import com.funny.txstack.entity.cbg.CbgDataEntity;
import com.funny.txstack.entity.cbg.CbgSearch;
import com.funny.txstack.service.CbgRoleService;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by funny on 16/11/17.
 */
@Service
public class CbgRoleServiceImpl implements CbgRoleService {
    @Autowired
    private CbgDataMapper cbgDataMapper;
    @Autowired
    private CbgRoleMapper cbgRoleMapper;

    @Override
    public PageInfo<CbgDataEntity> findByCondition(CbgSearch cbgSearch) {
        PageHelper.startPage(cbgSearch.getPageNo(), cbgSearch.getPageSize());
        if (cbgSearch.getPrice_des() == null) {
            PageHelper.orderBy("r.id desc");
        } else {
            if (cbgSearch.getPrice_des() == 1) {
                PageHelper.orderBy("r.price asc");
            } else if (cbgSearch.getPrice_des() == 2) {
                PageHelper.orderBy("r.price desc");
            }
        }
        List<CbgDataEntity> roleDataEntities = cbgDataMapper.findByCondition(cbgSearch);
        return new PageInfo<>(roleDataEntities);
    }

    @Override
    public int deleteRole(Long id) {
        return cbgRoleMapper.deleteRole(id);
    }
}
