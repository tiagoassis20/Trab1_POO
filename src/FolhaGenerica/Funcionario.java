package folhaGenerica;

import java.io.Serializable;

public class Funcionario implements Serializable{
	
	private static final long serialVersionUID = 8043190151723169974L;
	
	private String nome;
	private int codigo;
	
	/**
	 * Construtor Default
	 */
	public Funcionario() {
		
	}
	
	/**
	 * Construtor passando nome e c—digo
	 * @param nome
	 * @param codigo
	 */
	public Funcionario(String nome,int codigo){
		this.nome = nome;
		this.codigo = codigo;
	}
	
	/**
	 * Apresenta c—digo , nome, cargo e sal‡rio do funcion‡rio 
	 */
	void gerarContaCheque(){
		
		System.out.println("Codigo: " + codigo);
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo());
		System.out.println("Salario: " + salario());
		
	}
	
	
	protected double salario(){
		
		return 0.0;
	}
	
	protected String cargo(){
		
		return null;
	}
	
	/*
	 * Apresentae c—digo e nome do funcion‡rio
	 */
	public void exibir(){
		
		System.out.println("Codigo: " + codigo);
		System.out.println("Nome: " + nome);
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
