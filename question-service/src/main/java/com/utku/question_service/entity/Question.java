package com.utku.question_service.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="Questions")
public class Question {

    @Column(name = "question_id")
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Difficulty diffLevel;

    @OneToMany
    private List<Option> options;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column
    private UUID organizationId;


    public Question(String content, Difficulty diffLevel, List<Option> options, LocalDateTime createdAt) {
        this.content = content;
        this.diffLevel = diffLevel;
        this.options = options;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Difficulty getDiffLevel() {
        return diffLevel;
    }

    public void setDiffLevel(Difficulty diffLevel) {
        this.diffLevel = diffLevel;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
