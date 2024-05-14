package com.agespisa.servlet.lancamentos;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.agespisa.servlet.model.Lancamento;
import com.agespisa.servlet.repository.Lancamentos;

@Named
@ViewScoped
public class ConsultaLancamentosBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Lancamentos lancamentosRepository;
	
	private List<Lancamento> lancamentos;

	public ConsultaLancamentosBean() {
	}

	public ConsultaLancamentosBean(Lancamentos lancamentosRepository, List<Lancamento> lancamentos) {
		this.lancamentosRepository = lancamentosRepository;
		this.lancamentos = lancamentos;
	}
	
	public void consultar() {
		this.lancamentos = lancamentosRepository.todos();
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
}