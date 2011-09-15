package folhaGenerica;

import java.io.Serializable;
import java.util.List;

import excecoes.ParametroIncorreto;

public abstract class Funcionario implements Serializable{
	
	private static final long serialVersionUID = 8043190151723169974L;
	
	private String nome;
	private int codigo;
	private List<Empresa> empresas;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome,int codigo) throws ParametroIncorreto {

		if(codigo < 0 || nome == null){
			throw new ParametroIncorreto();
		}
		
		this.nome = nome;
		this.codigo = codigo;

	}
	
	protected  abstract double salario();
	
	protected abstract String cargo();
	
	
	void gerarContaCheque(){
		
		System.out.println("Codigo: " + codigo);
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo());
		System.out.println("Salario: " + salario());
		
	}
	
	public void exibir(){
		
		System.out.println("Codigo: " + codigo);
		System.out.println("Nome: " + nome);
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public List<Empresa> getEmpresas() {
		return empresas;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
