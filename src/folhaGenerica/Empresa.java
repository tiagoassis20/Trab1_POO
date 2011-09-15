package folhaGenerica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import excecoes.FuncionarioDuplicado;
import excecoes.ParametroIncorreto;
import folhaGenerica.Funcionario;

public class Empresa implements Serializable{

	private static final long serialVersionUID = 855357918192244243L;
	
	private String nome;
	private List<Funcionario> funcionarios;
	
	public Empresa() {
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public Empresa(String nome) throws ParametroIncorreto {
		if(nome == null){
			throw new ParametroIncorreto();
		}
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
	
	public boolean inserirFuncionario(Funcionario funcionario) throws FuncionarioDuplicado{
		if(funcionarios != null) {
			for(Funcionario f : funcionarios){
				if(f.getCodigo() == funcionario.getCodigo()){
					throw new FuncionarioDuplicado(funcionario);
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
