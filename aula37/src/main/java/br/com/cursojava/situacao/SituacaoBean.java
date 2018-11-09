package br.com.cursojava.situacao;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class SituacaoBean {

	private String oid;
	private List<Situacao> situacoes;
	private boolean novo = true;
	private boolean podeEditar;
	private SituacaoFacade facade = new SituacaoFacade();
	private Situacao situacaoAtual = facade.novaSituacao();

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
				situacaoAtual = facade.carregarSituacao(id);
				novo = false;
			} catch (Exception e) {
				addMessage("ID Inválido!", FacesMessage.SEVERITY_ERROR);
			}
		}
	}

	public Integer getId() {
		return situacaoAtual != null ? situacaoAtual.getId() : null;
	}

	public void setId(Integer id) {
		if (situacaoAtual != null) {
			situacaoAtual.setId(id);
		}
	}

	public String getNome() {
		return situacaoAtual != null ? situacaoAtual.getNome() : "";
	}

	public void setNome(String nome) {
		if (situacaoAtual != null) {
			situacaoAtual.setNome(nome);
		}
	}

	public TipoSituacao getTipo() {
		return situacaoAtual != null ? situacaoAtual.getTipo() : null;
	}

	public void setTipo(TipoSituacao tipo) {
		if (situacaoAtual != null) {
			situacaoAtual.setTipo(tipo);
		}
	}

	public Date getDataHoraCriacao() {
		return situacaoAtual != null ? situacaoAtual.getDataHoraCriacao() : null;
	}

	public void setDataHoraCriacao(Date dataHoraCriacao) {
		if (situacaoAtual != null) {
			situacaoAtual.setDataHoraCriacao(dataHoraCriacao);
		}
	}

	public Date getDataHoraAtualizacao() {
		return situacaoAtual != null ? situacaoAtual.getDataHoraAtualizacao() : null;
	}

	public void setDataHoraAtualizacao(Date dataHoraAtualizacao) {
		if (situacaoAtual != null) {
			situacaoAtual.setDataHoraAtualizacao(dataHoraAtualizacao);
		}
	}

	public Date getDataHoraRemocao() {
		return situacaoAtual != null ? situacaoAtual.getDataHoraRemocao() : null;
	}

	public void setDataHoraRemocao(Date dataHoraRemocao) {
		if (situacaoAtual != null) {
			situacaoAtual.setDataHoraRemocao(dataHoraRemocao);
		}
	}

	public StatusSituacao getStatus() {
		return situacaoAtual != null ? situacaoAtual.getStatus() : null;
	}

	public void setStatus(StatusSituacao status) {
		if (situacaoAtual != null) {
			situacaoAtual.setStatus(status);
		}
	}

	public List<Situacao> getSituacoes() {
		if (situacoes == null || situacoes.isEmpty()) {
			situacoes = facade.carregarSituacoes();
		}
		return situacoes;
	}

	public TipoSituacao[] getOpcoesTipo() {
		return TipoSituacao.values();
	}

	public StatusSituacao[] getOpcoesStatus() {
		return StatusSituacao.values();
	}

	public void novo() {
		this.situacaoAtual = facade.novaSituacao();
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

	public void salvar() {
		boolean ok = false;
		if (situacaoAtual != null) {
			if(situacaoAtual.getDataHoraCriacao()==null) {
				situacaoAtual.setDataHoraCriacao(new Date());
			}
			situacaoAtual.setDataHoraAtualizacao(new Date());
			ok = facade.salvar(situacaoAtual);
		}
		if (ok) {
			addMessage("Situação salva com sucesso", FacesMessage.SEVERITY_INFO);
			novo = false;
			podeEditar = false;
		} else {
			addMessage("Não foi possível salvar o Situação", FacesMessage.SEVERITY_ERROR);
		}
	}

	public void remover() {
		boolean ok = false;
		if (situacaoAtual != null && !novo) {
			situacaoAtual.setDataHoraRemocao(new Date());
			ok = facade.removerContato(situacaoAtual);
			if (ok) {
				addMessage("Situação removida com Sucesso!", FacesMessage.SEVERITY_INFO);
				novo();
			} else {
				addMessage("Não fo possível remover a Situação!", FacesMessage.SEVERITY_ERROR);
			}
		}
	}

	private void addMessage(String mensagem, Severity prioridade) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(mensagem);
		message.setSeverity(prioridade);
		context.addMessage(null, message);
	}

}
