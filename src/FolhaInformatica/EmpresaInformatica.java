package folhaInformatica;

import folhaGenerica.Empresa;

public class EmpresaInformatica extends Empresa{
	
	private static final long serialVersionUID = -2939234686554261902L;
	
	public boolean insereProgramador(String nome,int codigo,Double valorHora,int numeroHoras){
		
		try{
			Programador programador = new Programador(nome,codigo,valorHora,numeroHoras);
		}catch (Exception e) {
			System.out.println("Erro ao inserir Programador!");
			e.printStackTrace();
		}
		
		return true;
	}
	public boolean insereAnalista(String nome,int codigo,Double valorHora,int numeroHoras){
		
		try{
			Analista analista = new Analista(nome, codigo, valorHora, numeroHoras);
		}catch (Exception e) {
			System.out.println("Erro ao inserir Analista!");
			e.printStackTrace();
		}
		
		return true;
	}
	public boolean insereGerente(String nome,int codigo,Double salario){
		
		try{
			Gerente gerente = new Gerente(nome, codigo, salario);
		}catch (Exception e) {
			System.out.println("Erro ao inserir Gerente!");
			e.printStackTrace();
		}
		
		return true;
	}
	public boolean insereDiretor(String nome,int codigo,Double salario){
		
		try{
			Diretor diretor = new Diretor(nome, codigo, salario);
		}catch (Exception e) {
			System.out.println("Erro ao inserir Diretor");
			e.printStackTrace();
		}
		
		return true;
	}
}
