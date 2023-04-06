package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blo.VilleBLO;

public class PutController {
	@RestController
	@RequestMapping("/villes")
	public class VilleController {

	    @Autowired
	    private VilleBLO villeService;

	    /*@DeleteMapping("/{id}")
	    public void deleteVille(@PathVariable Long id) {
	        villeService.deleteVille(id);
	    }*/
	}
}
