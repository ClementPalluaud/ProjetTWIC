package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blo.VilleBLO;
import com.dto.Ville;

public class GetController {
	@RestController
	@RequestMapping("/villes")
	public class VilleController {

	    @Autowired
	    private VilleBLO villeService;

	    /*@GetMapping("/{id}")
	    public Ville getVille(@PathVariable Long id) {
	        return villeService.getVilleById(id);
	    }*/
	}
}
