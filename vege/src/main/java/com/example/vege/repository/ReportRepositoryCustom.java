package com.example.vege.repository;

import com.example.vege.entity.Report;

import java.util.List;

public interface ReportRepositoryCustom {
    List<Report> findList(Long page);
}
