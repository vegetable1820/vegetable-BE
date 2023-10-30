package com.example.vege.repository;

import com.example.vege.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report,Long>,ReportRepositoryCustom {
}
