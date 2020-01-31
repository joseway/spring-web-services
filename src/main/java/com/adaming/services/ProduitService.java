package com.adaming.services;

import java.util.List;

import com.adaming.models.Produit;

public interface ProduitService {

	public List<Produit> findAll();
	
	public Produit save(Produit prod);
	
	public Produit findById(Long id);
	
	public void delete(Produit prod);
}
