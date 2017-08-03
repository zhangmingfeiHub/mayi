package com.mfzhang.mayi.datasource.domain;

import java.io.Serializable;
import java.util.Date;

public class MdmCommonBooth implements Serializable {
    private String mdGuid;

    private String mdmId;

    private String boothCode;

    private String cadCode;

    private String spaceType;

    private String mallCode;

    private String mallEntityCode;

    private String bulidingCode;

    private String floorCode;

    private Date startTime;

    private Date endTime;

    private Integer isLock;

    private String categoryOneCode;

    private String categoryTwoId;

    private Double budgetaryPrice;

    private String boothLevel;

    private String boothDesc;

    private String boothStatus;

    private String delete;

    private Date createtime;

    private String createby;

    private Date modifytime;

    private String modifyby;

    private String operatorEmail;

    private static final long serialVersionUID = 1L;

    public String getMdGuid() {
        return mdGuid;
    }

    public void setMdGuid(String mdGuid) {
        this.mdGuid = mdGuid == null ? null : mdGuid.trim();
    }

    public String getMdmId() {
        return mdmId;
    }

    public void setMdmId(String mdmId) {
        this.mdmId = mdmId == null ? null : mdmId.trim();
    }

    public String getBoothCode() {
        return boothCode;
    }

    public void setBoothCode(String boothCode) {
        this.boothCode = boothCode == null ? null : boothCode.trim();
    }

    public String getCadCode() {
        return cadCode;
    }

    public void setCadCode(String cadCode) {
        this.cadCode = cadCode == null ? null : cadCode.trim();
    }

    public String getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType == null ? null : spaceType.trim();
    }

    public String getMallCode() {
        return mallCode;
    }

    public void setMallCode(String mallCode) {
        this.mallCode = mallCode == null ? null : mallCode.trim();
    }

    public String getMallEntityCode() {
        return mallEntityCode;
    }

    public void setMallEntityCode(String mallEntityCode) {
        this.mallEntityCode = mallEntityCode == null ? null : mallEntityCode.trim();
    }

    public String getBulidingCode() {
        return bulidingCode;
    }

    public void setBulidingCode(String bulidingCode) {
        this.bulidingCode = bulidingCode == null ? null : bulidingCode.trim();
    }

    public String getFloorCode() {
        return floorCode;
    }

    public void setFloorCode(String floorCode) {
        this.floorCode = floorCode == null ? null : floorCode.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public String getCategoryOneCode() {
        return categoryOneCode;
    }

    public void setCategoryOneCode(String categoryOneCode) {
        this.categoryOneCode = categoryOneCode == null ? null : categoryOneCode.trim();
    }

    public String getCategoryTwoId() {
        return categoryTwoId;
    }

    public void setCategoryTwoId(String categoryTwoId) {
        this.categoryTwoId = categoryTwoId == null ? null : categoryTwoId.trim();
    }

    public Double getBudgetaryPrice() {
        return budgetaryPrice;
    }

    public void setBudgetaryPrice(Double budgetaryPrice) {
        this.budgetaryPrice = budgetaryPrice;
    }

    public String getBoothLevel() {
        return boothLevel;
    }

    public void setBoothLevel(String boothLevel) {
        this.boothLevel = boothLevel == null ? null : boothLevel.trim();
    }

    public String getBoothDesc() {
        return boothDesc;
    }

    public void setBoothDesc(String boothDesc) {
        this.boothDesc = boothDesc == null ? null : boothDesc.trim();
    }

    public String getBoothStatus() {
        return boothStatus;
    }

    public void setBoothStatus(String boothStatus) {
        this.boothStatus = boothStatus == null ? null : boothStatus.trim();
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete == null ? null : delete.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getModifyby() {
        return modifyby;
    }

    public void setModifyby(String modifyby) {
        this.modifyby = modifyby == null ? null : modifyby.trim();
    }

    public String getOperatorEmail() {
        return operatorEmail;
    }

    public void setOperatorEmail(String operatorEmail) {
        this.operatorEmail = operatorEmail == null ? null : operatorEmail.trim();
    }
}