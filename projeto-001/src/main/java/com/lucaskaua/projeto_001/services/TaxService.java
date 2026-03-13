package com.lucaskaua.projeto_001.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

    public double tax (double amount) {
        return amount * 0.2;
    }
}
