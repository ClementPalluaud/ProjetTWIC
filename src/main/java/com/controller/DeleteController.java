package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blo.VilleBLO;
import com.dto.Ville;

public class DeleteController {
	@RestController
	@RequestMapping("/villes")
	public class VilleController {

	    @Autowired
	    private VilleBLO villeService;

	    /*@PostMapping
	    public Ville createVille(@RequestBody Ville ville) {
	        return villeService.createVille(ville);
	    }*/
	}
}
