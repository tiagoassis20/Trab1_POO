package folhaInformatica;

import folhaGenerica.Mensalista;

public class Gerente extends Mensalista{	

	private static final long serialVersionUID = 7792063402987519870L;
	
	public Gerente(String nome, int codigo, double salario) {
		super(nome, codigo, salario);
	}

	@Override
	protected double comissao() {
		return 400;
	}
	
	@Override
	protected String cargo() {
		return "Gerente";
	}
	
}
