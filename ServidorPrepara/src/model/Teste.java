package model;

import java.util.List;

import conexao.Conexao;
import dao.TesteDAO;

public class Teste {
	




	public int id;
	public String nome;
	public String valor;

	
	
	public void setId(int i) {
		this.id = i;
		
	}
		
	
	public void setNome(String n) {
		this.nome = n;
		
	}



	public void setValor(String v) {
		this.valor = v;
		
	}

	
	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getValor() {
		return valor;
	}
}
