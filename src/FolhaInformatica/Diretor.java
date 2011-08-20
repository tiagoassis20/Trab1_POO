package folhaInformatica;

import folhaGenerica.Mensalista;

public class Diretor extends Mensalista{
	
	private static final long serialVersionUID = -6435146326211146310L;
	
	public Diretor(String nome, int codigo, double salario) {
		super(nome, codigo, salario);
	}
	
	protected String cargo(){
		return "";
	}
	public double comissao(){
		return 0.0;
	}
}
