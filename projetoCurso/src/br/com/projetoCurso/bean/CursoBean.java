package br.com.projetoCurso.bean;

import javax.faces.bean.ManagedBean;

import br.com.projetoCurso.model.Curso;

@ManagedBean
public class CursoBean {
	
	Curso curso = new Curso();

	public Curso getCurso() {
		return curso;
	}

	public void adicionar() {
		System.out.println("Curso criado: " + this.curso.getNomeCurso() + this.curso.getProfessorCurso());
		curso = new Curso();
}

	
	

}
