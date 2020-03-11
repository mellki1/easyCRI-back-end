package com.melquisedeque.easyCRI.entity.enums;

public enum TipoAto {
	
	ABERTURA_DE_MATRICULA (1, "Abertura de matrícula", "Averbação", ""),
	ADITIVO (2, "Aditivo", "Averbação", ""),
	ALTERACAO_CPF (3, "Alteração de CPF", "Averbação", ""),
	ALTERACAO_NOME (4, "Alteração de nome", "Averbação", ""),
	ALTERACAO_RG (5, "Alteração de RG", "Averbação", "");
	
	private int cod;
	private String nome;
	private String tipoRequerimento;
	private String texto;
	
	private TipoAto(int cod, String tipoRequerimento, String nome, String texto) {
		this.cod = cod;
		this.tipoRequerimento = tipoRequerimento;
		this.nome = nome;
		this.texto = texto;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getTipoRequerimento() {
		return tipoRequerimento;
	}

	public void setTipoRequerimento(String tipoRequerimento) {
		this.tipoRequerimento = tipoRequerimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public static TipoAto toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (TipoAto x : TipoAto.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id iválido: " + cod);
	}
}