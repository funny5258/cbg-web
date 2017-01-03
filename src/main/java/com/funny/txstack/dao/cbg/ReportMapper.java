package com.funny.txstack.dao.cbg;

import com.funny.txstack.entity.cbg.ReportEntity;

import java.util.List;

/**
 * Created by funny on 2016/12/22.
 */
public interface ReportMapper {

    List<ReportEntity> getSchoolCount();

    List<ReportEntity> getXiuweiCount();

    List<ReportEntity> getEquCount();

    List<ReportEntity> getEquXiuweiCount();

    List<ReportEntity> getServerCount();

    List<ReportEntity> getFamilyCount();

}
