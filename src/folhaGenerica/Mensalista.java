package folhaGenerica;

import excecoes.ParametroIncorreto;

public abstract class Mensalista extends Funcionario{

	private static final long serialVersionUID = -6927116103478726289L;
	
	private double salario;

	public Mensalista(String nome,int codigo,double salario) throws ParametroIncorreto{
		super(nome,codigo);
		if(salario<0){
			throw new ParametroIncorreto();
		}
		this.salario = salario;
	}
	
	protected abstract double comissao();
	
	protected double salario(){
		
		return salario + comissao();
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
