package com.automation.pam.dto;

import java.time.LocalDate;
import java.util.List;

public class FfidRequestDTO {
    private String reqNum;
    private String reqFor;
    private LocalDate createdOn;
    private String userName;
    private String manager;
    private String sapSys;
    private String reqFfid;
    private LocalDate startDate;
    private LocalDate endDate;
    private String reasonForRequest;
    private String[] requestedTcodes;
    private String requestedPrograms;
    private String activities;
    private String status;

    public String getReqNum() {
        return reqNum;
    }

    public void setReqNum(String reqNum) {
        this.reqNum = reqNum;
    }

    // ✅ Add other getters and setters as well
    public String getReasonForRequest() {
        return reasonForRequest;
    }

    public void setReasonForRequest(String reasonForRequest) {
        this.reasonForRequest = reasonForRequest;
    }

    public List<String> getRequestedTcodes() {
        return List.of(requestedTcodes);
    }

    public void setRequestedTcodes(List<String> requestedTcodes) {
        this.requestedTcodes = requestedTcodes.toArray(new String[0]);
    }

    public String getRequestedPrograms() {
        return requestedPrograms;
    }

    public void setRequestedPrograms(String requestedPrograms) {
        this.requestedPrograms = requestedPrograms;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReqFor() {
        return reqFor;
    }

    public void setReqFor(String reqFor) {
        this.reqFor = reqFor;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getSapSys() {
        return sapSys;
    }

    public void setSapSys(String sapSys) {
        this.sapSys = sapSys;
    }

    public String getReqFfid() {
        return reqFfid;
    }

    public void setReqFfid(String reqFfid) {
        this.reqFfid = reqFfid;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
