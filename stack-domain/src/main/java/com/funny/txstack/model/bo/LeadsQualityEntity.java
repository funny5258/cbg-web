package com.funny.txstack.model.bo;



import com.funny.txstack.base.BaseEntity;

import java.util.Date;

public class LeadsQualityEntity extends BaseEntity {
    private static final long serialVersionUID = 1537410103594L;

    /**
    * 
    */
    private String nameEncrypt;

    /**
    * 购车方式（分期、全款）
    */
    private Integer buyCarType;

    /**
    * 
    */
    private String phoneEncrypt;

    /**
    * 
    */
    private String phoneHash;

    /**
    * 
    */
    private Long phoneId;

    /**
    * leads_allot的主键id
    */
    private Long allotId;

    /**
    * 
    */
    private Long leadsId;

    /**
    * 
    */
    private Long saleLeadsId;

    /**
    * 
    */
    private Integer specId;

    /**
    * 
    */
    private String specName;

    /**
    * 
    */
    private Integer seriesId;

    /**
    * 
    */
    private String seriesName;

    /**
    * 
    */
    private Integer brandId;

    /**
    * 
    */
    private String brandName;

    /**
    * 提车城市
    */
    private Integer pickCityId;

    /**
    * 
    */
    private String pickCityName;

    /**
    * 
    */
    private Integer pickProvinceId;

    /**
    * 
    */
    private String pickProvinceName;

    /**
    * 购车意向
    */
    private String buyCarIntention;

    /**
    * 线索来源1 CRM回流优质线索 128、400 124、IM
    */
    private Integer orginType;

    /**
    * 1 CRM清洗 2 智能机器人清洗
    */
    private String cleanSource;

    /**
    * 0未分发 1 已分发
    */
    private Integer allotStatus;

    /**
    * 
    */
    private Integer lockStatus;

    /**
    * 
    */
    private Integer taskId;

    /**
    * 分发时间
    */
    private Date allotTime;

    /**
    * 分发商家id
    */
    private Integer allotSellerId;

    /**
    * 
    */
    private Long cdrId;

    /**
    * 
    */
    private String callId;

    /**
    * 
    */
    private String callHangupcause;

    /**
    * 
    */
    private String callBillSec;

    /**
    * 
    */
    private Integer callWheeltime;

    /**
    * 
    */
    private Integer callStarttime;

    /**
    * 
    */
    private Integer callEndtime;

    /**
    * 
    */
    private String callUnconnectcause;

    /**
    * 
    */
    private String callIntention;

    /**
    * 
    */
    private String callRecordFilename;

    /**
    * 
    */
    private String callDialog;

    public void setNameEncrypt(String nameEncrypt) {
        this.nameEncrypt = nameEncrypt == null ? null : nameEncrypt.trim();
    }

    public String getNameEncrypt() {
        return nameEncrypt;
    }

    public void setBuyCarType(Integer buyCarType) {
        this.buyCarType = buyCarType;
    }

    public Integer getBuyCarType() {
        return buyCarType;
    }

    public void setPhoneEncrypt(String phoneEncrypt) {
        this.phoneEncrypt = phoneEncrypt == null ? null : phoneEncrypt.trim();
    }

    public String getPhoneEncrypt() {
        return phoneEncrypt;
    }

    public void setPhoneHash(String phoneHash) {
        this.phoneHash = phoneHash == null ? null : phoneHash.trim();
    }

    public String getPhoneHash() {
        return phoneHash;
    }

    public void setPhoneId(Long phoneId) {
        this.phoneId = phoneId;
    }

    public Long getPhoneId() {
        return phoneId;
    }

    public void setAllotId(Long allotId) {
        this.allotId = allotId;
    }

    public Long getAllotId() {
        return allotId;
    }

    public void setLeadsId(Long leadsId) {
        this.leadsId = leadsId;
    }

    public Long getLeadsId() {
        return leadsId;
    }

    public void setSaleLeadsId(Long saleLeadsId) {
        this.saleLeadsId = saleLeadsId;
    }

    public Long getSaleLeadsId() {
        return saleLeadsId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }

    public String getSpecName() {
        return specName;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName == null ? null : seriesName.trim();
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setPickCityId(Integer pickCityId) {
        this.pickCityId = pickCityId;
    }

    public Integer getPickCityId() {
        return pickCityId;
    }

    public void setPickCityName(String pickCityName) {
        this.pickCityName = pickCityName == null ? null : pickCityName.trim();
    }

    public String getPickCityName() {
        return pickCityName;
    }

    public void setPickProvinceId(Integer pickProvinceId) {
        this.pickProvinceId = pickProvinceId;
    }

    public Integer getPickProvinceId() {
        return pickProvinceId;
    }

    public void setPickProvinceName(String pickProvinceName) {
        this.pickProvinceName = pickProvinceName == null ? null : pickProvinceName.trim();
    }

    public String getPickProvinceName() {
        return pickProvinceName;
    }

    public void setBuyCarIntention(String buyCarIntention) {
        this.buyCarIntention = buyCarIntention == null ? null : buyCarIntention.trim();
    }

    public String getBuyCarIntention() {
        return buyCarIntention;
    }

    public void setOrginType(Integer orginType) {
        this.orginType = orginType;
    }

    public Integer getOrginType() {
        return orginType;
    }

    public void setCleanSource(String cleanSource) {
        this.cleanSource = cleanSource == null ? null : cleanSource.trim();
    }

    public String getCleanSource() {
        return cleanSource;
    }

    public void setAllotStatus(Integer allotStatus) {
        this.allotStatus = allotStatus;
    }

    public Integer getAllotStatus() {
        return allotStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setAllotTime(Date allotTime) {
        this.allotTime = allotTime;
    }

    public Date getAllotTime() {
        return allotTime;
    }

    public void setAllotSellerId(Integer allotSellerId) {
        this.allotSellerId = allotSellerId;
    }

    public Integer getAllotSellerId() {
        return allotSellerId;
    }

    public void setCdrId(Long cdrId) {
        this.cdrId = cdrId;
    }

    public Long getCdrId() {
        return cdrId;
    }

    public void setCallId(String callId) {
        this.callId = callId == null ? null : callId.trim();
    }

    public String getCallId() {
        return callId;
    }

    public void setCallHangupcause(String callHangupcause) {
        this.callHangupcause = callHangupcause == null ? null : callHangupcause.trim();
    }

    public String getCallHangupcause() {
        return callHangupcause;
    }

    public void setCallBillSec(String callBillSec) {
        this.callBillSec = callBillSec == null ? null : callBillSec.trim();
    }

    public String getCallBillSec() {
        return callBillSec;
    }

    public void setCallWheeltime(Integer callWheeltime) {
        this.callWheeltime = callWheeltime;
    }

    public Integer getCallWheeltime() {
        return callWheeltime;
    }

    public void setCallStarttime(Integer callStarttime) {
        this.callStarttime = callStarttime;
    }

    public Integer getCallStarttime() {
        return callStarttime;
    }

    public void setCallEndtime(Integer callEndtime) {
        this.callEndtime = callEndtime;
    }

    public Integer getCallEndtime() {
        return callEndtime;
    }

    public void setCallUnconnectcause(String callUnconnectcause) {
        this.callUnconnectcause = callUnconnectcause == null ? null : callUnconnectcause.trim();
    }

    public String getCallUnconnectcause() {
        return callUnconnectcause;
    }

    public void setCallIntention(String callIntention) {
        this.callIntention = callIntention == null ? null : callIntention.trim();
    }

    public String getCallIntention() {
        return callIntention;
    }

    public void setCallRecordFilename(String callRecordFilename) {
        this.callRecordFilename = callRecordFilename == null ? null : callRecordFilename.trim();
    }

    public String getCallRecordFilename() {
        return callRecordFilename;
    }

    public void setCallDialog(String callDialog) {
        this.callDialog = callDialog == null ? null : callDialog.trim();
    }

    public String getCallDialog() {
        return callDialog;
    }
}