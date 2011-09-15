package excecoes;

import folhaGenerica.Funcionario;

public class FuncionarioDuplicado extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Funcionario funcionario;
	
	public FuncionarioDuplicado(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public FuncionarioDuplicado(){}
	
	public void exibir(){
		System.out.println("Funcionario com código " + funcionario.getCodigo()+ " já existe.");
		
	}

}
