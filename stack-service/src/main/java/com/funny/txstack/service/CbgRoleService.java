package com.funny.txstack.service;

import com.funny.txstack.model.entity.CbgDataEntity;
import com.funny.txstack.model.entity.CbgSearch;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by funny on 16/11/17.
 */
public interface CbgRoleService {
    PageInfo<CbgDataEntity> findByCondition(CbgSearch cbgSearch);

    int deleteRole(Long id);

    String findLatestUpdate();

    void updateStatus(Long id);
}
