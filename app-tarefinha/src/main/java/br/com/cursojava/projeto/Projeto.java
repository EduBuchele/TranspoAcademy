package br.com.cursojava.projeto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.cursojava.tarefa.Tarefa;

@Entity
@Table(name = "projetos")
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private ProjetoStatus status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "\"dataHoraCriacao\"")
	private Date dataHoraCriacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "\"dataHoraAtualizacao\"")
	private Date dataHoraAtualizacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "\"dataHoraFim\"")
	private Date dataHoraFim;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="projeto")
	private List<Tarefa> tarefas;

	public Projeto() {
		super();
	}

	public Projeto(Integer id, String nome, String descricao, ProjetoStatus status, Date dataHoraCriacao,
			Date dataHoraAtualizacao, Date dataHoraFim) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
		this.dataHoraCriacao = dataHoraCriacao;
		this.dataHoraAtualizacao = dataHoraAtualizacao;
		this.dataHoraFim = dataHoraFim;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ProjetoStatus getStatus() {
		return status;
	}

	public void setStatus(ProjetoStatus status) {
		this.status = status;
	}

	public Date getDataHoraCriacao() {
		return dataHoraCriacao;
	}

	public void setDataHoraCriacao(Date dataHoraCriacao) {
		this.dataHoraCriacao = dataHoraCriacao;
	}

	public Date getDataHoraAtualizacao() {
		return dataHoraAtualizacao;
	}

	public void setDataHoraAtualizacao(Date dataHoraAtualizacao) {
		this.dataHoraAtualizacao = dataHoraAtualizacao;
	}

	public Date getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Projeto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", status=" + status
				+ ", dataHoraCriacao=" + dataHoraCriacao + ", dataHoraAtualizacao=" + dataHoraAtualizacao
				+ ", dataHoraFim=" + dataHoraFim + "]";
	}

}
