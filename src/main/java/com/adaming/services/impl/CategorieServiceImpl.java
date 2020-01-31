package com.adaming.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.models.Categorie;
import com.adaming.repositories.CategorieRepository;
import com.adaming.services.CategorieService;

@Service
public class CategorieServiceImpl implements CategorieService{

	@Autowired
	private CategorieRepository categorieRepository;
	
	@Override
	public Categorie save(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	@Override
	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}

	@Override
	public void delete(Categorie categorie) {
		categorieRepository.delete(categorie);
	}

	@Override
	public Categorie findById(Long id) {
		
		return categorieRepository.findById(id).get();
	}

}
