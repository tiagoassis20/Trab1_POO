package folhaInformatica;

import folhaGenerica.Mensalista;

public class Gerente extends Mensalista{	

	private static final long serialVersionUID = 7792063402987519870L;
	
	public Gerente(String nome, int codigo, double salario) {
		super(nome, codigo, salario);
	}
	
	protected String cargo(){
		return "";
	}
	public double comissao(){
		return 0.0;
	}
}
