package com.LibraryManagementSystem.library.model;

//package com.example.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "issue_records")
public class IssueRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String isbn;
    private Long memberId;
    private LocalDate issueDate;
    private LocalDate returnDate; // null while the book is still out

    protected IssueRecord() {
        // required by JPA
    }

    public IssueRecord(String isbn, Long memberId, LocalDate issueDate) {
        this.isbn = isbn;
        this.memberId = memberId;
        this.issueDate = issueDate;
    }

    public Long getId() { return id; }
    public String getIsbn() { return isbn; }
    public Long getMemberId() { return memberId; }
    public LocalDate getIssueDate() { return issueDate; }
    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }
}
