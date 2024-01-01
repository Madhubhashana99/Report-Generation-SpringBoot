package com.example.ReportGen.service;

import com.example.ReportGen.repository.ComplainLogRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplainLogService {
    private final ComplainLogRepo complainLogRepo;

    public ComplainLogService(ComplainLogRepo complainLogRepo) {
        this.complainLogRepo = complainLogRepo;
    }

    public List<ComplainLog> getAllComplains() {
        return complainLogRepo.findAll();
    }
}
