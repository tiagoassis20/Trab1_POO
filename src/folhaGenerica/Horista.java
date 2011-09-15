package folhaGenerica;

import excecoes.ParametroIncorreto;


public abstract class Horista extends Funcionario{
	
	private static final long serialVersionUID = -3577179737553893225L;
	
	private double valorHora;
	private int numeroHoras;
	
	public Horista(String nome, int codigo, double valorHora,int numeroHoras) throws ParametroIncorreto {
		super(nome,codigo);
		if(valorHora < 0 || numeroHoras < 0){
			throw new ParametroIncorreto();
		}
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	protected double salario(){
		
		return valorHora * numeroHoras;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
}
