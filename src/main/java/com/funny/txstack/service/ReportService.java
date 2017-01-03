package com.funny.txstack.service;

import java.util.List;

import com.funny.txstack.entity.cbg.ReportEntity;

/**
 * Created by funny on 16/11/17.
 */
public interface ReportService {

    List<ReportEntity> getSchoolCount();

    List<ReportEntity> getXiuweiCount();

    List<ReportEntity> getEquCount();

    List<ReportEntity> getEquXiuweiCount();

    List<ReportEntity> getServerCount();

    List<ReportEntity> getFamilyCount();
}
