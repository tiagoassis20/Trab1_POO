package folhaGenerica;

import java.io.Serializable;
import java.util.List;

import folhaGenerica.Funcionario;

public class Empresa implements Serializable{

	private static final long serialVersionUID = 855357918192244243L;
	
	private String nome;
	private List<Funcionario> funcionarios;
	
	public Empresa() {
		
	}
	
	public Empresa(String nome) {
		this.nome = nome;

	}
	
	public void gerarFolha(){
		
		for(Funcionario f : funcionarios){
			f.gerarContaCheque();
		}
		
	}

	public void exibirFuncionario(int codigo){
	
		boolean achou = false;
		
		for(Funcionario f : funcionarios){
			if(f.getCodigo() == codigo){
				f.exibir();
				achou = true;
			}
		}
		
		if(achou == false){
			System.out.println("Funcion�rio nao encontrado");
		}
	}
	
	public void exibirFuncionarios(){
		
	
		for(Funcionario f : funcionarios){
				f.exibir();
			
		}
		

	}
	
	public boolean inserirFuncionario(Funcionario funcionario){
		if(!funcionarios.isEmpty()) {
			for(Funcionario f : funcionarios){
				if(f.getCodigo() == funcionario.getCodigo()){
					System.out.println("Esse funcion�rio j� existe!");
					return false;
				}
			}
		}
		funcionarios.add(funcionario);
		
		return true;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
