package br.com.projetoCurso.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.projetoCurso.dao.DAO;
import br.com.projetoCurso.model.Curso;
import br.com.projetoCurso.model.Professor;

@ManagedBean
@ViewScoped
public class CursoBean {

	Curso curso = new Curso();
	private Integer professorId;
	private Integer cursoId;
	private List<Curso> cursos;
	
	DAO<Curso> dao = new DAO<Curso>(Curso.class);
	

	public Integer getCursoId() {
		return cursoId;
	}

	public void setCursoId(Integer cursoId) {
		this.cursoId = cursoId;
	}

	
	public void carregarPelaId() {
		this.curso = new DAO<Curso>(Curso.class).buscaPorId(this.cursoId);
	}

	public void setProfessorId(Integer professorId) {
		this.professorId = professorId;
	}
	
	public Integer getProfessorId() {
		return professorId;
	}


	public Curso getCurso() {
		return curso;
	}


	public List<Curso> getCursos() {
		DAO<Curso> dao = new DAO<Curso>(Curso.class);
		if (this.cursos == null) {
			this.cursos = dao.listaTodosCurso();
		}
		return cursos;
	}
	public List<Professor> getProfessores() {
		return new DAO<Professor>(Professor.class).listaTodosProfessor();
		}
	
	
	public List<Professor> getProfessoresDoCurso() {
	return this.curso.getProfessores();
	}
	
	public void addProfessorCurso() {
		Professor professor = new DAO<Professor>(Professor.class).buscaPorId(this.professorId);
		this.curso.adicionaProfessor(professor);
		System.out.println(this.curso.getProfessores());
	}

	public void adicionar() {
		System.out.println("Adicionando Curso: " + this.curso.getNomeCurso() + this.curso.getProfessores());
		if (this.curso.getId() == null) {
			System.out.println(this.curso.getProfessores());
			dao.adiciona(this.curso);
			this.cursos = dao.listaTodosCurso();
		} else {
			dao.atualiza(this.curso);
		}
		curso = new Curso();
	}

	public void remover(Curso curso) {
		dao.remove(curso);
		this.cursos = dao.listaTodosCurso();
	}
	
	public void removerProfessorDoCurso (Professor professor) {
		this.curso.removeProfessor(professor);
	}
	

}
