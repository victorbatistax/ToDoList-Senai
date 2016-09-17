package br.senai.sp.evobooks.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.senai.sp.evobooks.model.Lista;

@Repository
public class ListaDao {
	@PersistenceContext
	private EntityManager manager;
	
	public void inserir(Lista lista){
		manager.persist(lista);
	}
}
