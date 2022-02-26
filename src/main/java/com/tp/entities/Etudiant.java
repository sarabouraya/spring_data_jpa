package com.tp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="ETUDIANTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="REF")
	private Long id;
	@Column(length = 20)
	private String nom;
	@Column(length = 20)
	private String prenom;
	private int age;
}
