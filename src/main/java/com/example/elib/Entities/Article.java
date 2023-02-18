package com.example.elib.Entities;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name = "TYPE",length = 4)


public abstract class Article extends AbstractEntity {

    @Column(name = "codearticle")
    private String codeArticle;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prixunitaireht")
    private BigDecimal prixUnitaireHt;

    @Column(name = "tauxtva")
    private BigDecimal tauxTva;

    @Column(name = "prixunitairettc")
    private BigDecimal prixUnitaireTtc;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    private  Author author;

    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Categorie category;
@OneToMany
    private List<Recommendation>recommendationList;


//    @OneToMany(mappedBy = "article")
//    private List<LigneVente> ligneVentes;
//
//    @OneToMany(mappedBy = "article")
//    private List<LigneCommandeClient> ligneCommandeClients;
//
//    @OneToMany(mappedBy = "article")
//    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
//
//    @OneToMany(mappedBy = "article")
//    private List<MvtStk> mvtStks;

}
