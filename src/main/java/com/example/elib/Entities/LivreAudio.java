package com.example.elib.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@DiscriminatorValue("LivreAudio")
public class LivreAudio extends Article{


    @NotNull
    private String titre;

    @NotNull
    private String auteur;

    @NotNull
    private String description;

    @NotNull
    private String url;

    @NotNull
    private Long duree;



}
