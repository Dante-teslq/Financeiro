package com.agespisa.servlet.pagina;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;
import javax.faces.bean.ApplicationScoped;

@ManagedBean
@ApplicationScoped
public class NomesBean {

	private String nome;
	private List<String> nomes = new ArrayList<>();
	private HtmlInputText inputNome;
	private HtmlCommandButton botaoAdicionar;

	public void adicionar() {
		this.nomes.add(nome);

		if (this.nomes.size() > 3) {
			this.inputNome.setDisabled(true);
			this.botaoAdicionar.setDisabled(true);
			this.botaoAdicionar.setValue("Muitos nomes adicionados...");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public HtmlInputText getInputNome() {
		return inputNome;
	}

	public void setInputNome(HtmlInputText inputNome) {
		this.inputNome = inputNome;
	}

	public HtmlCommandButton getBotaoAdicionar() {
		return botaoAdicionar;
	}

	public void setBotaoAdicionar(HtmlCommandButton botaoAdicionar) {
		this.botaoAdicionar = botaoAdicionar;
	}

}