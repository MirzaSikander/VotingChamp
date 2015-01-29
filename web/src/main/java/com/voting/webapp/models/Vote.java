package com.voting.webapp.models;

/**
 * Model Object for Vote Entity in System
 */


import javax.persistence.*;


@Entity
@Table(name = "votes")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String candidateId;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }
}
