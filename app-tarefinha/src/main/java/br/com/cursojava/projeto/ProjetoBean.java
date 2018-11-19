package br.com.cursojava.projeto;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ProjetoBean {

	private String oid;
	private List<Projeto> projetos;
	private boolean novo = true;
	private boolean podeEditar;
	private ProjetoFacade facade = new ProjetoFacade();
	private Projeto projetoAtual = facade.novoProjeto();

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
				projetoAtual = facade.carregarProjeto(id);
				novo = false;
			} catch (Exception e) {
				addMessage("ID Inválido!", FacesMessage.SEVERITY_ERROR);
			}
		}
	}

	public Integer getId() {
		return projetoAtual != null ? projetoAtual.getId() : null;
	}

	public void setId(Integer id) {
		if (projetoAtual != null) {
			projetoAtual.setId(id);
		}
	}

	public List<Projeto> getProjetos() {
		if (projetos == null || projetos.isEmpty()) {
			projetos = facade.carregarProjetos();
		}
		return projetos;
	}

	public String getNome() {
		return projetoAtual != null ? projetoAtual.getNome() : "";
	}

	public void setNome(String nome) {
		if (projetoAtual != null) {
			projetoAtual.setNome(nome);
		}
	}

	public String getDescricao() {
		return projetoAtual != null ? projetoAtual.getDescricao() : "";
	}

	public void setDescricao(String descricao) {
		if (projetoAtual != null) {
			projetoAtual.setDescricao(descricao);
		}
	}

	public ProjetoStatus getStatus() {
		return projetoAtual != null ? projetoAtual.getStatus() : null;
	}

	public void setStatus(ProjetoStatus status) {
		if (projetoAtual != null) {
			projetoAtual.setStatus(status);
		}
	}

	public Date getDataHoraCriacao() {
		return projetoAtual != null ? projetoAtual.getDataHoraCriacao() : null;
	}

	public void setDataHoraCriacao(Date dataHoraCriacao) {
		if (projetoAtual != null) {
			projetoAtual.setDataHoraCriacao(dataHoraCriacao);
		}
	}

	public Date getDataHoraAtualizacao() {
		return projetoAtual != null ? projetoAtual.getDataHoraAtualizacao() : null;
	}

	public void setDataHoraAtualizacao(Date dataHoraAtualizacao) {
		if (projetoAtual != null) {
			projetoAtual.setDataHoraAtualizacao(dataHoraAtualizacao);
		}
	}

	public Date getDataHoraFim() {
		return projetoAtual != null ? projetoAtual.getDataHoraFim() : null;
	}

	public void setDataHoraFim(Date dataHoraFim) {
		if (projetoAtual != null) {
			projetoAtual.setDataHoraFim(dataHoraFim);
		}
	}

	public ProjetoStatus[] getOpcoesStatus() {
		return ProjetoStatus.values();
	}

	public void novo() {
		this.projetoAtual = facade.novoProjeto();
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
		if (projetoAtual != null) {
			if (projetoAtual.getDataHoraCriacao() == null) {
				projetoAtual.setDataHoraCriacao(new Date());
			}
			projetoAtual.setDataHoraAtualizacao(new Date());
			ok = facade.salvar(projetoAtual);
		}
		if (ok) {
			addMessage("Projeto salvo com sucesso", FacesMessage.SEVERITY_INFO);
			novo = false;
			podeEditar = false;
		} else {
			addMessage("Não foi possível salvar o Projeto", FacesMessage.SEVERITY_ERROR);
		}
	}
	
	public void remover() {
		boolean ok = false;
		if (projetoAtual != null && !novo) {
			projetoAtual.setDataHoraAtualizacao(new Date());
			ok = facade.removerProjeto(projetoAtual);
			if (ok) {
				addMessage("Projeto removido com Sucesso!", FacesMessage.SEVERITY_INFO);
				novo();
			} else {
				addMessage("Não fo possível remover o Projeto!", FacesMessage.SEVERITY_ERROR);
			}
		}
	}
}
