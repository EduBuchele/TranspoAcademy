package br.com.cursojava.tarefa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.cursojava.projeto.Projeto;
import br.com.cursojava.situacao.Situacao;
import br.com.cursojava.usuario.Usuario;

@ManagedBean
@ViewScoped
public class TarefaBean {

	private String oid;
	private List<Tarefa> tarefas;
	private List<Tarefa> tarefasCategoria = new ArrayList<>();
	private boolean novo = true;
	private boolean podeEditar;
	private TarefaFacade facade = new TarefaFacade();
	private Tarefa tarefaAtual = facade.novaTarefa();

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
		if ("novo".equals(oid)) {
			novo();
		} else {
			try {
				Integer id = Integer.parseInt(oid);
				tarefaAtual = facade.carregarTarefa(id);
				novo = false;
			} catch (Exception e) {
				addMessage("ID Inválido!", FacesMessage.SEVERITY_ERROR);
			}
		}
	}

	public Integer getId() {
		return tarefaAtual != null ? tarefaAtual.getId() : null;
	}

	public void setId(Integer id) {
		if (tarefaAtual != null) {
			tarefaAtual.setId(id);
		}
	}

	public List<Tarefa> getTarefas() {
		if (tarefas == null || tarefas.isEmpty()) {
			tarefas = facade.carregarTarefas();
		}
		return tarefas;
	}

	public String getNome() {
		return tarefaAtual != null ? tarefaAtual.getNome() : "";
	}

	public void setNome(String nome) {
		if (tarefaAtual != null) {
			tarefaAtual.setNome(nome);
		}
	}

	public String getDescricao() {
		return tarefaAtual != null ? tarefaAtual.getDescricao() : "";
	}

	public void setDescricao(String descricao) {
		if (tarefaAtual != null) {
			tarefaAtual.setDescricao(descricao);
		}
	}

	public Date getDataHoraCriacao() {
		return tarefaAtual != null ? tarefaAtual.getDataHoraCriacao() : null;
	}

	public void setDataHoraCriacao(Date dataHoraCriacao) {
		if (tarefaAtual != null) {
			tarefaAtual.setDataHoraCriacao(dataHoraCriacao);
		}
	}

	public Date getDataHoraAtualizacao() {
		return tarefaAtual != null ? tarefaAtual.getDataHoraAtualizacao() : null;
	}

	public void setDataHoraAtualizacao(Date dataHoraAtualizacao) {
		if (tarefaAtual != null) {
			tarefaAtual.setDataHoraAtualizacao(dataHoraAtualizacao);
		}
	}

	public Projeto getProjeto() {
		return tarefaAtual != null ? tarefaAtual.getProjeto() : null;
	}

	public void setProjeto(Projeto projeto) {
		if (tarefaAtual != null) {
			tarefaAtual.setProjeto(projeto);
		}
	}

	public Situacao getSituacao() {
		return tarefaAtual != null ? tarefaAtual.getSituacao() : null;
	}

	public void setSituacao(Situacao situacao) {
		if (tarefaAtual != null) {
			tarefaAtual.setSituacao(situacao);
		}
	}

	public Usuario getUsuario() {
		return tarefaAtual != null ? tarefaAtual.getUsuario() : null;
	}

	public void setUsuario(Usuario usuario) {
		if (tarefaAtual != null) {
			tarefaAtual.setUsuario(usuario);
		}
	}

	public void novo() {
		this.tarefaAtual = facade.novaTarefa();
		novo = true;
		editar();
	}

	public void editar() {
		this.setPodeEditar(true);
	}

	public String listar() {
		novo();
		return "./lista.jsf";
	}

	public boolean isPodeEditar() {
		return podeEditar;
	}

	public void setPodeEditar(boolean podeEditar) {
		this.podeEditar = podeEditar;
	}

	private void addMessage(String mensagem, Severity prioridade) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(mensagem);
		message.setSeverity(prioridade);
		context.addMessage(null, message);
	}

	public void salvar() {
		boolean ok = false;
		if (tarefaAtual != null) {
			if (tarefaAtual.getDataHoraCriacao() == null) {
				tarefaAtual.setDataHoraCriacao(new Date());
			}
			tarefaAtual.setDataHoraAtualizacao(new Date());
			ok = facade.salvar(tarefaAtual);
		}
		if (ok) {
			addMessage("Tarefa salva com sucesso", FacesMessage.SEVERITY_INFO);
			novo = false;
			podeEditar = false;
		} else {
			addMessage("Não foi possível salvar a Tarefa", FacesMessage.SEVERITY_ERROR);
		}
	}

	public void remover() {
		boolean ok = false;
		if (tarefaAtual != null && !novo) {
			tarefaAtual.setDataHoraAtualizacao(new Date());
			ok = facade.removerTarefa(tarefaAtual);
			if (ok) {
				addMessage("Tarefa removida com Sucesso!", FacesMessage.SEVERITY_INFO);
				novo();
			} else {
				addMessage("Não fo possível remover a Tarefa!", FacesMessage.SEVERITY_ERROR);
			}
		}
	}

	public long contador(String categoria) {
		return facade.contarPorCategoria(categoria);
	}

	public List<Tarefa> tarefasCategoria(String categoria) {

		tarefasCategoria = facade.carregarTarefas(categoria);

		return tarefasCategoria;
	}

	public List<Tarefa> getTarefasCategoria() {

		return tarefasCategoria;
	}

	public String editarView(String id) {

		return "./tarefas/formulario.jsf?faces-redirect=trueoid=" + id;
	}
	
	public void concluirTarefa(String id) {
		Integer idTarefa = Integer.parseInt(id);
		facade.concluirTarefa(idTarefa);
	}

}
