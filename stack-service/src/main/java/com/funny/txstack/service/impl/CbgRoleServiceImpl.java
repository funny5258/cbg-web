package com.funny.txstack.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.funny.txstack.dao.cbg.CbgRoleMapper;
import com.funny.txstack.entity.cbg.CbgRoleEntity;
import com.funny.txstack.utils.HttpClientUtil;
import com.github.pagehelper.PageHelper;
import com.google.common.base.Strings;
import org.apache.commons.lang.StringUtils;
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
            if (cbgSearch.getPrice_des() == 2) {
                PageHelper.orderBy("r.price desc");
            }else{
                PageHelper.orderBy("r.id desc");
            }
        }
        List<CbgDataEntity> roleDataEntities = cbgDataMapper.findByCondition(cbgSearch);
        return new PageInfo<>(roleDataEntities);
    }

    @Override
    public int deleteRole(Long id) {
        return cbgRoleMapper.deleteRole(id);
    }

    @Override
    public String findLatestUpdate() {
        return cbgDataMapper.findLatestUpdate();
    }

    @Override
    public void updateStatus(Long id) {
        CbgRoleEntity cbgRoleEntity = cbgRoleMapper.findById(id);
        if (cbgRoleEntity != null && !Strings.isNullOrEmpty(cbgRoleEntity.getDataUrl())) {
            String httpResult = HttpClientUtil.get(cbgRoleEntity.getDataUrl());
            if(StringUtils.isEmpty(httpResult)){
                return;
            }
            JSONObject jsonObject = JSON.parseObject(httpResult);
            String json_status = jsonObject.getString("status");
            if (json_status == null || !json_status.equals("1")) {
                return;
            }
            JSONObject equip = jsonObject.getJSONObject("equip");
            if (equip == null) {
                return;
            }
            String equip_status = equip.getString("status");
            if (!"2".equals(equip_status)) {
                CbgRoleEntity updateRole = new CbgRoleEntity();
                updateRole.setYn(0);
                updateRole.setId(cbgRoleEntity.getId());
                cbgRoleMapper.updateByIdSelected(updateRole);
            }
        }
    }
}
