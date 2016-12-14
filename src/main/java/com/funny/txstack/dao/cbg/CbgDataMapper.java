package com.funny.txstack.dao.cbg;

import com.funny.txstack.common.BaseMapper;
import com.funny.txstack.entity.cbg.CbgDataEntity;
import com.funny.txstack.entity.cbg.CbgSearch;

import java.util.List;

public interface CbgDataMapper extends BaseMapper<CbgDataEntity> {
    List<CbgDataEntity> findByCondition(CbgSearch cbgSearch);
}