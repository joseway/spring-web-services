package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adaming.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
