package folhaGenerica;

public abstract class Mensalista extends Funcionario{

	private static final long serialVersionUID = -6927116103478726289L;
	
	private double salario;

	public Mensalista(String nome,int codigo,double salario) {
		super(nome,codigo);
		this.salario = salario;
	}
	
	protected abstract double comissao();
	
	protected double salario(){
		
		return salario + comissao();
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
