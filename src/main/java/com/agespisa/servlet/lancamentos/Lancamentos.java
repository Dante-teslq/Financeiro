package com.agespisa.servlet.lancamentos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.agespisa.servlet.model.Lancamento;

public class Lancamentos implements Serializable {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;
	
	public void adicionar(Lancamento lancamento) {
		EntityTransaction trx = this.manager.getTransaction();
		trx.begin();
		this.manager.persist(lancamento);
		trx.commit();
	}

	@Inject
	public Lancamentos(EntityManager manager) {
		this.manager = manager;
	}

	public List<Lancamento> todos() {
		TypedQuery<Lancamento> query = manager.createQuery("from Lancamento", Lancamento.class);
		return query.getResultList();
	}
}