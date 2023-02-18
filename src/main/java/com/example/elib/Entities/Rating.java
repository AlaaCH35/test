package com.example.elib.Entities;

import jakarta.persistence.*;

public class Rating extends AbstractEntity {



    private Double value;


    @ManyToOne(fetch = FetchType.LAZY)
    private User user;


    @ManyToOne(fetch = FetchType.LAZY)
    private Article article;

}
