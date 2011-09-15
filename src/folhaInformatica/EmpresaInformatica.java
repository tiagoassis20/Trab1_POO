package folhaInformatica;

import excecoes.FuncionarioDuplicado;
import excecoes.ParametroIncorreto;
import folhaGenerica.Empresa;

public class EmpresaInformatica extends Empresa{
	
	private static final long serialVersionUID = -2939234686554261902L;
	
	public boolean insereProgramador(String nome,int codigo,Double valorHora,int numeroHoras)  throws  ParametroIncorreto, FuncionarioDuplicado{
		
		Programador programador = new Programador(nome,codigo,valorHora,numeroHoras);
		inserirFuncionario(programador);
		return true;
	}
	public boolean insereAnalista(String nome,int codigo,Double valorHora,int numeroHoras)  throws  ParametroIncorreto, FuncionarioDuplicado{
		
		Analista analista = new Analista(nome, codigo, valorHora, numeroHoras);
		inserirFuncionario(analista);
		return true;
	}
	public boolean insereGerente(String nome,int codigo,Double salario) throws  ParametroIncorreto, FuncionarioDuplicado{
		
		Gerente gerente = new Gerente(nome, codigo, salario);
		inserirFuncionario(gerente);
		return true;
	}
	public boolean insereDiretor(String nome,int codigo,Double salario) throws ParametroIncorreto, FuncionarioDuplicado {
		
		Diretor diretor = new Diretor(nome, codigo, salario);
		inserirFuncionario(diretor);
		return true;
	}
}
