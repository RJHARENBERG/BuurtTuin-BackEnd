package com.example.buurttuin.Fields;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private Long id;

    private String date;


    @ManyToOne
    @JoinColumn(name = "lender_id")
    private Lender lender;

    @ManyToOne
    @JoinColumn(name = "borrower_id")
    private Borrower borrower;

    @OneToMany(mappedBy = "reservation")
    private Set<Tool> tools = new HashSet<>();

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Set<Tool> getTools() {
        return tools;
    }

    public void setTools(Set<Tool> tools) {
        this.tools = tools;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public Lender getLender() {
        return lender;
    }

    public void setLender(Lender lender) {
        this.lender = lender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
