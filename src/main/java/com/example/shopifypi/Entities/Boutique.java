package com.example.shopifypi.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Boutique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idbou;
    private String nombou;
    private String descriptionbou;
    @JsonIgnore
    @OneToMany(mappedBy = "boutique")
    private List<Categorie> categories;
}
