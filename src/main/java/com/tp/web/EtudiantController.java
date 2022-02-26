package com.tp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.dao.EtudiantRepository;
import com.tp.entities.Etudiant;

@RestController
public class EtudiantController{
	@Autowired
	private EtudiantRepository etudiantRepository;
	@GetMapping("/etudiants")
	public List<Etudiant> etudiants(){
		return etudiantRepository.findAll();
	}
}
