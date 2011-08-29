package folhaInformatica;

import folhaGenerica.Empresa;

public class EmpresaInformatica extends Empresa{
	
	private static final long serialVersionUID = -2939234686554261902L;
	
	public boolean insereProgramador(String nome,int codigo,Double valorHora,int numeroHoras){
		
		Programador programador = new Programador(nome,codigo,valorHora,numeroHoras);
		
		return true;
	}
	public boolean insereAnalista(String nome,int codigo,Double valorHora,int numeroHoras){
		
		Analista analista = new Analista(nome, codigo, valorHora, numeroHoras);
		
		return true;
	}
	public boolean insereGerente(String nome,int codigo,Double salario){
		
		Gerente gerente = new Gerente(nome, codigo, salario);
		
		return true;
	}
	public boolean insereDiretor(String nome,int codigo,Double salario){
		
		Diretor diretor = new Diretor(nome, codigo, salario);
		
		return true;
	}
}
