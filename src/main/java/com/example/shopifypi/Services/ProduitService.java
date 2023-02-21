package com.example.shopifypi.Services;

import com.example.shopifypi.Entities.Produit;

public interface ProduitService {

    Produit saveProduit(Produit p);

    Produit updateProduit(Produit p);

    void deleteProduit(Produit p);

    void deleteProduitById(Long id);
}
