package com.example.shopifypi.Restcontrollers;

import com.example.shopifypi.Entities.Categorie;
import com.example.shopifypi.Entities.Produit;
import com.example.shopifypi.Repositories.CategorieRepository;
import com.example.shopifypi.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProduitRESTController {
    @Autowired
    CategorieRepository categorieRepository;
    @RequestMapping(method= RequestMethod.GET)
    public List<Categorie> getAllCategories()
    {
        return categorieRepository.findAll();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Categorie getCategorieById(@PathVariable("id") Long id) {
        return categorieRepository.findById(id).get();
    }

    @Autowired
    ProduitService produitService;
@PostMapping ("/Create")
@ResponseBody
    public Produit createProduit(@RequestBody Produit produit) {
        return produitService.saveProduit(produit);
    }
@PutMapping("/Update/{idProduit}")
@ResponseBody
    public Produit updateProduit(@RequestBody Produit produit) {
        return produitService.updateProduit(produit);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("id") Long id)
    {
        produitService.deleteProduitById(id);
    }}

