package com.example.springaopintro.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void registerUser(String username) {
        System.out.println("👤 Registrando usuário: " + username);
        simulateDelay();
    }

    private void simulateDelay() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {}
    }
}
