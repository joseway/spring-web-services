package com.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.models.Categorie;
import com.adaming.services.CategorieService;

@RestController
@RequestMapping("/categories")
public class CategorieController {
	
	@Autowired
	private CategorieService categorieService;

	@PostMapping
	public Categorie save(@RequestBody Categorie categorie) {
		return categorieService.save(categorie);
	}
	@GetMapping
	public List<Categorie> findAll(){
		
		return categorieService.findAll();
	}
	@GetMapping("/{id}")
	public Categorie findById(@PathVariable("id")Long id) {
		return categorieService.findById(id);
	}
}





