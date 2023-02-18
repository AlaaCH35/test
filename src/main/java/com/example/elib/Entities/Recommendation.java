package com.example.elib.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Recommendation extends  AbstractEntity{


    @NotNull
    private String title;

    @NotNull
    private String description;



    @ManyToOne
    private Article article;



}
