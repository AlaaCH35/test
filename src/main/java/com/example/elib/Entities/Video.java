package com.example.elib.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@DiscriminatorValue("Video")
public class Video extends Article {


    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private String url;
}
