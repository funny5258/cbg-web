package com.funny.txstack.service.impl;

import java.util.List;

import com.funny.txstack.dao.cbg.BangRoleMapper;
import com.funny.txstack.entity.cbg.BangRoleEntity;
import com.funny.txstack.entity.cbg.BangSearch;
import com.funny.txstack.service.BangRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funny.txstack.dao.cbg.CbgDataMapper;
import com.funny.txstack.dao.cbg.CbgRoleMapper;
import com.funny.txstack.entity.cbg.CbgDataEntity;
import com.funny.txstack.entity.cbg.CbgSearch;
import com.funny.txstack.service.CbgRoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * Created by funny on 16/11/17.
 */
@Service
public class BangRoleServiceImpl implements BangRoleService {
    @Autowired
    private BangRoleMapper bangRoleMapper;

    @Override
    public PageInfo<BangRoleEntity> findByCondition(BangSearch cbgSearch) {
        PageHelper.startPage(cbgSearch.getPageNo(), cbgSearch.getPageSize());
        if(cbgSearch.getType()==1){
            PageHelper.orderBy(" xiuwei+equ_xiuwei desc ");
        }else if(cbgSearch.getType()==2){
            PageHelper.orderBy(" xiuwei desc ");
        }else if(cbgSearch.getType()==3){
            PageHelper.orderBy(" equ_xiuwei desc ");
        }
        List<BangRoleEntity> roleDataEntities = bangRoleMapper.findByCondition(cbgSearch);
        return new PageInfo<>(roleDataEntities);
    }
}
