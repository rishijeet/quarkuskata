package com.example.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Claim {
    private String id;
    private BigDecimal amount;
    private String description;
    private LocalDateTime submissionDate;
    private Boolean approved;
    private String rejectionReason;
    private int transactionsLastMonth;

    public Claim() {
    }

    public Claim(String id, BigDecimal amount, String description, int transactionsLastMonth) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.submissionDate = LocalDateTime.now();
        this.transactionsLastMonth = transactionsLastMonth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDateTime submissionDate) {
        this.submissionDate = submissionDate;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public int getTransactionsLastMonth() {
        return transactionsLastMonth;
    }

    public void setTransactionsLastMonth(int transactionsLastMonth) {
        this.transactionsLastMonth = transactionsLastMonth;
    }
} 