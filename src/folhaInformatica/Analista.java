package folhaInformatica;

import folhaGenerica.Horista;

public class Analista extends Horista{
	
	private static final long serialVersionUID = -3101970580022472269L;

	public Analista(String nome, int codigo, double valorHora, int numeroHoras) {
		super(nome, codigo, valorHora, numeroHoras);
	}

	@Override
	protected String cargo() {
		return "Analista";
	}

}
