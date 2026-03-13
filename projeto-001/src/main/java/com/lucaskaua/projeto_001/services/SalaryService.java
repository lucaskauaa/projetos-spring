package com.lucaskaua.projeto_001.services;

import com.lucaskaua.projeto_001.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    @Autowired
    private TaxService taxService;

    @Autowired
    private PensionService pensionService;

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public PensionService getPensionService() {
        return pensionService;
    }

    public void setPensionService(PensionService pensionService) {
        this.pensionService = pensionService;
    }

    public double netSalary (Employee employee) {
        double netSalary = employee.getGrossSalary();
        return netSalary - taxService.tax(netSalary) - pensionService.discount(netSalary);
    }
}
