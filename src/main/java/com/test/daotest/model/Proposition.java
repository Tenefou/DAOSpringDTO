package com.test.daotest.model;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Proposition {
    private int correct;
    private String libelle;
    private Long id;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    private Question questions;

    public Proposition(){}

    public Proposition (int correct, String libelle, Long id)
    {   
        super();
        this.correct = correct;
        this.libelle = libelle;
        this.id = id;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question getQuestions() {
        return questions;
    }

    public void setQuestions(Question questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Proposition [correct=" + correct + ", libelle=" + libelle + ", id=" + id + ", questions=" + questions
                + "]";
    }
    
}
