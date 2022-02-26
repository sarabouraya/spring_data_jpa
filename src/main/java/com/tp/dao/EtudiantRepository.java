package com.tp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp.entities.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{
	public List<Etudiant> findAll();
}
