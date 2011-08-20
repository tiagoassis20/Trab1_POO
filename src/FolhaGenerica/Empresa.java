package folhaGenerica;

import java.io.Serializable;
import java.util.List;

import folhaGenerica.Funcionario;

public class Empresa implements Serializable{

	private static final long serialVersionUID = 855357918192244243L;
	
	private String nome;
	private List<Funcionario> funcionarios;
	
	/**
	 * MŽtodo Construtor Default
	 */
	public Empresa() {
		
	}
	
	/**
	 * MŽtodo Construdor Recebendo Nome
	 * @param nome
	 */
	public Empresa(String nome) {
		this.nome = nome;
	}
	
	/**
	 * gera o contra cheque de todos funcion‡rios
	 */
	public void gerarFolha(){
		
		for(Funcionario f : funcionarios){
			f.gerarContaCheque();
		}
		
	}
	
	/**
	 * Mostra o funcion‡rio,o qual, o c—digo foi passado por parametro
	 * @param codigo
	 */
	public void exibirFuncionario(int codigo){
		
		for(int i =0; i <= funcionarios.size();i++){
			Funcionario f = new Funcionario();
			f = funcionarios.get(i);
			if(f.getCodigo() == codigo){
				
			}
		}
		
	}
	
	/**
	 * Adiciona um Funcion‡rio
	 * @param funcionario
	 * @return
	 */
	public boolean inserirFuncionario(Funcionario funcionario){
		
		for(int i =0; i <= funcionarios.size();i++){
			Funcionario f = new Funcionario();
			f = funcionarios.get(i);
			if(f.getCodigo() == funcionario.getCodigo()){
				System.out.println("O c—digo: "+funcionario.getCodigo()+" j‡ existe.");
				return false;
			}else{
				funcionarios.add(funcionario);
			}
		}
		return true;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
