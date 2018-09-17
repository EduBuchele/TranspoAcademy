package br.com.projetoCurso.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.projetoCurso.dao.DAO;
import br.com.projetoCurso.model.Professor;

@ManagedBean
@ViewScoped
public class ProfessorBean {

	Professor professor = new Professor();
	DAO<Professor> dao = new DAO<Professor>(Professor.class);

	private Integer professorId;

	public Integer getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Integer professorId) {
		this.professorId = professorId;
	}

	public void carregarProfessorPelaId() {
		this.professor = new DAO<Professor>(Professor.class).buscaPorId(professorId);
		if (this.professor == null) {
			this.professor = new Professor();
		}
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Professor> getProfessores() {
		return new DAO<Professor>(Professor.class).listaTodosProfessor();
	}
	
	public void adicionar() {
		System.out.println("Adicionando Professor: " + this.professor.getNomeProfessor());
		
		if (this.professor.getId() == null) {
			dao.adiciona(this.professor);
			this.professor = new Professor();
		} else {
			dao.atualiza(this.professor);
		}
		professor = new Professor();
	}

	List<Professor> professores;


	public void remover(Professor professor) {
		dao.remove(professor);
		this.professores = dao.listaTodosProfessor();
		professor = new Professor();
	}

	public void editar(Professor professor) {
		this.professor = professor;
	}

}
