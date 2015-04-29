package br.com.mrksFelipe.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tbl_pessoa")
public class Pessoa implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date idade;
	
	@OneToOne(cascade= CascadeType.PERSIST)
	@JoinColumn(name="fk_endereco")
	private Endereco endereco;
	
	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getIdade() {
		return idade;
	}

	public void setIdade(Date idade) {
		this.idade = idade;
	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}

	
	
	
	
}
