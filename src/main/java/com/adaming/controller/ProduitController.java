package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.models.Produit;
import com.adaming.services.ProduitService;

@RestController
@RequestMapping("/produits")
public class ProduitController {

	@Autowired
	private ProduitService produitService;
	
	@GetMapping
	public List<Produit> findAll(){
		return produitService.findAll();
	}
	@GetMapping("/{id}")
	public Produit findById(@PathVariable("id") Long id) {
		return produitService.findById(id);
	}
	@PostMapping
	public Produit save(@RequestBody Produit prod) {
		return produitService.save(prod);
	}
}
