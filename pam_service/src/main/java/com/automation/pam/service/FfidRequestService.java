package com.automation.pam.service;

import com.automation.pam.dto.FfidRequestDTO;
import com.automation.pam.model.FfidRequests;
import com.automation.pam.model.FfidRequests;
import com.automation.pam.repository.FfidRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FfidRequestService {

    @Autowired
    private FfidRequestRepository repository;

    public List<FfidRequestDTO> getAllRequests() {
        List<FfidRequests> entities = repository.findAll();
        return entities.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    public FfidRequestDTO getRequestByReqNum(String reqNum) {
        return repository.findByReqNum(reqNum)
                .map(this::convertToDto)
                .orElse(null);
    }




    private FfidRequestDTO convertToDto(FfidRequests entity) {
        FfidRequestDTO dto = new FfidRequestDTO();
        dto.setReqNum(entity.getReqNum());
        dto.setReqFor(entity.getReqFor());
        dto.setCreatedOn(entity.getCreatedOn());
        dto.setUserName(entity.getUserName());
        dto.setManager(entity.getManager());
        dto.setSapSys(entity.getSapSys());
        dto.setReqFfid(entity.getReqFfid());
        dto.setStartDate(entity.getStartDate());
        dto.setEndDate(entity.getEndDate());
        dto.setReasonForRequest(entity.getReasonForRequest());
        dto.setRequestedTcodes(List.of(entity.getRequestedTcodes()));
        dto.setRequestedPrograms(entity.getRequestedPrograms());
        dto.setActivities(entity.getActivities());
        dto.setStatus(entity.getStatus());
        return dto;
    }
}
