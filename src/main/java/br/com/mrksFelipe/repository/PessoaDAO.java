package br.com.mrksFelipe.repository;

import javax.persistence.EntityManager;

import br.com.mrksFelipe.filter.JPA;
import br.com.mrksFelipe.model.Pessoa;

public class PessoaDAO {

	
	
	EntityManager em = JPA.em();
	
	
	public void salvar(Pessoa p){
		
		 em.persist(p);
		
	}
	
	
	
	
}
