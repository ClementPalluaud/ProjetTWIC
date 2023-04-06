package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blo.VilleBLO;
import com.dto.Ville;

public class PostController {
	@RestController
	@RequestMapping("/villes")
	public class VilleController {

	    @Autowired
	    private VilleBLO villeService;

	    /*@PutMapping("/{id}")
	    public Ville updateVille(@PathVariable Long id, @RequestBody Ville ville) {
	        Ville existingVille = villeService.getVilleById(id);
	        existingVille.setNom(ville.getNom());
	        existingVille.setPays(ville.getPays());
	        existingVille.setPopulation(ville.getPopulation());
	        return villeService.updateVille(existingVille);
	    }*/
	}
}
