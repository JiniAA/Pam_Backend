package com.automation.pam.controller;

import com.automation.pam.dto.FfidRequestDTO;
import com.automation.pam.dto.LoginRequest;
import com.automation.pam.dto.LoginResponse;
import com.automation.pam.service.FfidRequestService;
import com.automation.pam.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    private final LoginService loginService;
    private FfidRequestService ffidRequestService;

    @Autowired
    public LoginController(LoginService loginService, FfidRequestService ffidRequestService) {
        this.loginService = loginService;
        this.ffidRequestService = ffidRequestService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        boolean isAuthenticated = loginService.authenticate(
                loginRequest.getUserId(),
                loginRequest.getPassword()
        );

        if (isAuthenticated) {
            return ResponseEntity.ok(new LoginResponse(true, "Login successful"));
        } else {
            return ResponseEntity.ok(new LoginResponse(false, "Invalid credentials"));
        }

    }

    @GetMapping("/ffid-requests")
    public ResponseEntity<List<FfidRequestDTO>> getAllFfidRequests() {
        List<FfidRequestDTO> requests = ffidRequestService.getAllRequests();  // fetch from service
        return ResponseEntity.ok(requests);

    }

    @GetMapping("/{reqNum}")
    public ResponseEntity<FfidRequestDTO> getRequestByReqNum(@PathVariable String reqNum) {
        FfidRequestDTO dto = ffidRequestService.getRequestByReqNum(reqNum);
        if (dto != null) {
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
