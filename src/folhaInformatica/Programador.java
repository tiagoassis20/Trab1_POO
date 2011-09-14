package folhaInformatica;

import folhaGenerica.Horista;

public class Programador extends Horista{
	
	private static final long serialVersionUID = -1274362649882409427L;

	public Programador(String nome, int codigo, double valorHora,
			int numeroHoras) {
		super(nome, codigo, valorHora, numeroHoras);
	}

	@Override
	protected String cargo() {
		return "Programador";
	}


}
