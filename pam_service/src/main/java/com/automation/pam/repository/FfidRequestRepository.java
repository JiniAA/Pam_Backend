package com.automation.pam.repository;

import com.automation.pam.model.FfidRequests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FfidRequestRepository extends JpaRepository<FfidRequests, String> {
    Optional<FfidRequests> findByReqNum(String reqNum);
}