package com.example.shopifypi.Services;

import com.example.shopifypi.Entities.Produit;
import com.example.shopifypi.Repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    ProduitRepository produitRepository;

    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public void deleteProduit(Produit p) {
        produitRepository.delete(p);
    }

    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);
    }


}

