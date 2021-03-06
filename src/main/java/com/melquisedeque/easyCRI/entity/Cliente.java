package com.melquisedeque.easyCRI.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.melquisedeque.easyCRI.entity.sexoCliente.SexoCliente;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Cliente implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String nacionalidade;

	@Column(nullable = false)
	private String estadoCivil;

	@Column(nullable = false)
	private String profissao;

	@Column(unique = true, nullable = false)
	private String identidade;

	@Column(nullable = false)
	private String orgaoEmissor;

	@Column(nullable = false)
	private String estadoEmissor;

	@CPF
	@Column(unique = true, nullable = false)
	private String cpf;

	@Column(nullable = false)
	private String nomePai;

	@Column(nullable = false)
	private String nomeMae;

	@Column(nullable = false)
	private Integer sexo;

	@Column(nullable = false)
	private String endereco;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String telefone;
	

	public Cliente () {}

	public Cliente(Integer id, String nome, String nacionalidade, String estadoCivil, String profissao,
			String identidade, String orgaoEmissor, String estadoEmissor, String cpf, String nomePai, String nomeMae, SexoCliente sexo, String endereco, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.estadoCivil = estadoCivil;
		this.profissao = profissao;
		this.identidade = identidade;
		this.orgaoEmissor = orgaoEmissor;
		this.estadoEmissor = estadoEmissor;
		this.cpf = cpf;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.sexo = sexo.getCod();
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}
	

	public String getEstadoEmissor() {
		return estadoEmissor;
	}

	public void setEstadoEmissor(String estadoEmissor) {
		this.estadoEmissor = estadoEmissor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public SexoCliente getSexo() {
		return SexoCliente.converteParaEnum(sexo);
	}

	public void setSexo(SexoCliente sexo) {
		this.sexo = sexo.getCod();
	}
	
	public String getendereco() {
		return endereco;
	}

	public void setendereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	

}
