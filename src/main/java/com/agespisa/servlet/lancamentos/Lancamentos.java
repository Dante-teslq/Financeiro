package com.agespisa.servlet.lancamentos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.agespisa.servlet.model.Lancamento;

public class Lancamentos implements Serializable {

	public void adicionar(Lancamento lancamento) {
		this.manager.persist(lancamento);
	}

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public Lancamentos(EntityManager manager) {
		this.manager = manager;
	}

	public List<Lancamento> todos() {
		TypedQuery<Lancamento> query = manager.createQuery("from Lancamento", Lancamento.class);
		return query.getResultList();
	}
}