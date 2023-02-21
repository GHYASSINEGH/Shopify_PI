package com.example.shopifypi.Repositories;

import com.example.shopifypi.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long> {

}