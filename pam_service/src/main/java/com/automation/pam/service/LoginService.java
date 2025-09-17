package com.automation.pam.service;

import com.automation.pam.model.UserDetails;
import com.automation.pam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    private final UserRepository userRepository;

    @Autowired
    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(String userId, String password) {
        Optional<UserDetails> userOptional = userRepository.findByUserId(userId);

        if (userOptional.isPresent()) {
            // In a real application, you should use password encoding
            // This is a simple example and should not be used in production
            return userOptional.get().getPassword().equals(password);
        }

        return false;
    }
}
