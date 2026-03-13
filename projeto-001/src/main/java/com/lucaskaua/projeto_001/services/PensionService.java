package com.lucaskaua.projeto_001.services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {

    public double discount (double amount) {
        return amount * 0.1;
    }
}
