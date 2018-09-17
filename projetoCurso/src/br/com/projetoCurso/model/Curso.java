package br.com.projetoCurso.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;

	private String nomeCurso;

	@ManyToMany(fetch = FetchType.EAGER)
	private List<Professor> professores = new ArrayList<Professor>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public void adicionaProfessor (Professor professor) {
		this.professores.add(professor);
	}
	
	public void removeProfessor (Professor professor) {
		this.professores.remove(professor);
	}
	
	public Curso() {
		
	}

	
	
	
	

}
