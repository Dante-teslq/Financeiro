package com.agespisa.servlet.pagina;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class CadastroBean {

	private String nome;

	public void cadastrar() {
		FacesContext context = FacesContext.getCurrentInstance();

		FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro efetuado.",
				"Cliente" + this.nome + "cadastrado com sucesso");
		context.addMessage(null, mensagem);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
