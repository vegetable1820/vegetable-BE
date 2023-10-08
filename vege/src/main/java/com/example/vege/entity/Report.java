package com.example.vege.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;
    private String title;
    private String content;
    private LocalDateTime createdAt;

    @Builder
    public Report(Long reportId, String title, String content) {
        this.reportId = reportId;
        this.title = title;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }
}
