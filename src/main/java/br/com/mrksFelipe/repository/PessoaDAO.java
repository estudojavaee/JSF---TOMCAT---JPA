package br.com.mrksFelipe.repository;

import br.com.mrksFelipe.model.Pessoa;

public class PessoaDAO extends GenericDAO<Pessoa>{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PessoaDAO() {
		super(Pessoa.class);
	}
	
	public void salvar(Pessoa p){
		beginTransaction();
		save(p);
		commitAndCloseTransaction();
	}

	
	
	
	
}
