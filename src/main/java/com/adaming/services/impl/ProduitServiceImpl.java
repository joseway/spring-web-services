package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.models.Produit;
import com.adaming.repositories.ProduitRepository;
import com.adaming.services.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService{

	@Autowired
	private ProduitRepository produitReposiotry;
	
	@Override
	public List<Produit> findAll() {
		return produitReposiotry.findAll();
	}

	@Override
	public Produit save(Produit prod) {
		return produitReposiotry.save(prod);
	}

	@Override
	public Produit findById(Long id) {
		return produitReposiotry.findById(id).get();
	}

	@Override
	public void delete(Produit prod) {
		produitReposiotry.delete(prod);		
	}

}
