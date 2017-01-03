package com.funny.txstack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funny.txstack.dao.cbg.ReportMapper;
import com.funny.txstack.entity.cbg.ReportEntity;
import com.funny.txstack.service.ReportService;

/**
 * Created by funny on 16/11/17.
 */
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportMapper reportMapper;

    @Override
    public List<ReportEntity> getSchoolCount() {
        return reportMapper.getSchoolCount();
    }

    @Override
    public List<ReportEntity> getXiuweiCount() {
        return reportMapper.getXiuweiCount();
    }

    @Override
    public List<ReportEntity> getEquCount() {
        return reportMapper.getEquCount();
    }

    @Override
    public List<ReportEntity> getEquXiuweiCount() {
        return reportMapper.getEquXiuweiCount();
    }

    @Override
    public List<ReportEntity> getServerCount() {
        return reportMapper.getServerCount();
    }

    @Override
    public List<ReportEntity> getFamilyCount() {
        return reportMapper.getFamilyCount();
    }
}
