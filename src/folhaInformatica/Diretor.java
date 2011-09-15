package folhaInformatica;

import folhaGenerica.Mensalista;

public class Diretor extends Mensalista{
	
	private static final long serialVersionUID = -6435146326211146310L;
	
	public Diretor(String nome, int codigo, double salario) {
		super(nome, codigo, salario);
	}

	@Override
	protected double comissao() {
		return salario() + 300;
	}

	@Override
	protected String cargo() {
		return "Diretor";
	}
	
}
