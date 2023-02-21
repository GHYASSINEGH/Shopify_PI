package com.example.shopifypi.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Produit {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idProduit;
    private String nomProduit;
    private Float prixProduit;
    private Date dateCreation;

    @ManyToOne
    private Categorie categorie;


}
