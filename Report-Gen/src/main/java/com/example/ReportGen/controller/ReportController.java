package com.example.ReportGen.controller;


import com.example.ReportGen.repository.ReportRepo;
import com.example.ReportGen.service.ReportService;
import jakarta.persistence.Entity;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;


@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @Autowired
    private ReportRepo reportRepo;

    @GetMapping("/dailyReport")
    public String generateDailyReport() throws JRException, FileNotFoundException {
        return reportService.exportDailyReport();
    }

    @GetMapping("/monthlyReport")
    public String generateMonthlyReport() throws JRException, FileNotFoundException {
        return reportService.exportMonthlyReport();
    }
}
