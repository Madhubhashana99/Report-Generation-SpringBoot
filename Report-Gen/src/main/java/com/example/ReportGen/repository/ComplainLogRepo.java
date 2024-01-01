package com.example.ReportGen.repository;

import com.example.ReportGen.model.ComplainLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplainLogRepo extends JpaRepository<ComplainLog, Long> {
}
