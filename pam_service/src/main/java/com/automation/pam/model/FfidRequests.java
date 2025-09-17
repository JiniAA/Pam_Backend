package com.automation.pam.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ffid_requests")
public class FfidRequests {

    @Id
    @Column(name = "req_num")
    private String reqNum; // You will generate REQ01 manually in code

    @Column(name = "req_for")
    private String reqFor;

    @Column(name = "created_on")
    private LocalDate createdOn;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "manager")
    private String manager;

    @Column(name = "sap_sys")
    private String sapSys;

    @Column(name = "req_ffid")
    private String reqFfid;

    @Column(name = "startdate")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "reason_for_request")
    private String reasonForRequest;

    @Column(name = "requested_tcodes", columnDefinition = "text[]")
    private String[] requestedTcodes;

    @Column(name = "requested_programs")
    private String requestedPrograms;

    @Column(name = "activities")
    private String activities;

    @Column(name = "status")
    private String status;

    // Getters and Setters
    public String getReqNum() { return reqNum; }
    public void setReqNum(String reqNum) { this.reqNum = reqNum; }

    public String getReqFor() { return reqFor; }
    public void setReqFor(String reqFor) { this.reqFor = reqFor; }

    public LocalDate getCreatedOn() { return createdOn; }
    public void setCreatedOn(LocalDate createdOn) { this.createdOn = createdOn; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getManager() { return manager; }
    public void setManager(String manager) { this.manager = manager; }

    public String getSapSys() { return sapSys; }
    public void setSapSys(String sapSys) { this.sapSys = sapSys; }

    public String getReqFfid() { return reqFfid; }
    public void setReqFfid(String reqFfid) { this.reqFfid = reqFfid; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public String getReasonForRequest() { return reasonForRequest; }
    public void setReasonForRequest(String reasonForRequest) { this.reasonForRequest = reasonForRequest; }

    public String[] getRequestedTcodes() { return requestedTcodes; }
    public void setRequestedTcodes(String[] requestedTcodes) { this.requestedTcodes = requestedTcodes; }

    public String getRequestedPrograms() { return requestedPrograms; }
    public void setRequestedPrograms(String requestedPrograms) { this.requestedPrograms = requestedPrograms; }

    public String getActivities() { return activities; }
    public void setActivities(String activities) { this.activities = activities; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
