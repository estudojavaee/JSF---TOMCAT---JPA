package br.com.mrksFelipe.managed;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.mrksFelipe.model.Endereco;
import br.com.mrksFelipe.model.Pessoa;
import br.com.mrksFelipe.repository.PessoaDAO;

@ManagedBean
@RequestScoped
public class CadastroPessoaMB {

	private Pessoa pessoa;
	private Endereco endereco;
	
	
	private PessoaDAO dao;
		
	
	public CadastroPessoaMB() {
		pessoa = new Pessoa();
		endereco = new Endereco();
	}
	
	public void limparCampo(){
		pessoa = new Pessoa();
		endereco = new Endereco();
	}
	
	
	public String cadastrar(){
		System.out.println(pessoa);
		System.out.println(endereco);
		
		pessoa.setEndereco(endereco);
		
		dao = new PessoaDAO();
		dao.salvar(pessoa);
		
		limparCampo();
		
		return null;
	}


	
	

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
