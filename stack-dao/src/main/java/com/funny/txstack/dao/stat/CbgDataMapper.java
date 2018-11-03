package com.funny.txstack.dao.stat;


import com.funny.txstack.base.BaseMapper;
import com.funny.txstack.model.entity.CbgDataEntity;
import com.funny.txstack.model.entity.CbgSearch;

import java.util.List;

/**
 * @author fangli
 */
public interface CbgDataMapper extends BaseMapper<CbgDataEntity> {

    List<CbgDataEntity> findListByCondition(CbgSearch cbgSearch);

    int findCountByCondition(CbgSearch cbgSearch);


    String findLatestUpdate();
}