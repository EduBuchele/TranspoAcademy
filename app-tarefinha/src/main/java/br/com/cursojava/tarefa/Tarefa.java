package br.com.cursojava.tarefa;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.cursojava.projeto.Projeto;
import br.com.cursojava.situacao.Situacao;
import br.com.cursojava.usuario.Usuario;

@Entity
@Table(name = "tarefas")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String descricao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "\"dataHoraCriacao\"")
	private Date dataHoraCriacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "\"dataHoraAtualizacao\"")
	private Date dataHoraAtualizacao;

	@ManyToOne
	@JoinColumn(name = "\"projetoId\"")
	private Projeto projeto;

	@ManyToOne
	@JoinColumn(name = "\"situacaoId\"")
	private Situacao situacao;

	@ManyToOne
	@JoinColumn(name = "\"usuarioId\"")
	private Usuario usuario;

	public Tarefa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tarefa(Integer id, String nome, String descricao, Date dataHoraCriacao, Date dataHoraAtualizacao,
			Projeto projeto, Situacao situacao, Usuario usuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.dataHoraCriacao = dataHoraCriacao;
		this.dataHoraAtualizacao = dataHoraAtualizacao;
		this.projeto = projeto;
		this.situacao = situacao;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
		Tarefa other = (Tarefa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", dataHoraCriacao="
				+ dataHoraCriacao + ", dataHoraAtualizacao=" + dataHoraAtualizacao + ", projeto=" + projeto
				+ ", situacao=" + situacao + ", usuario=" + usuario + "]";
	}

}
