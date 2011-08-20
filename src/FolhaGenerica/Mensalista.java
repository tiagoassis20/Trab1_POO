package folhaGenerica;


public class Mensalista extends Funcionario{

	private static final long serialVersionUID = -6927116103478726289L;
	
	private double salario;
	
	/**
	 * Construtor
	 * @param nome
	 * @param codigo
	 * @param salario
	 */
	public Mensalista(String nome,int codigo,double salario) {
		super(nome,codigo);
		this.salario = salario;
	}
	
	/**
	 * Calcula Comissao, salario + comissao
	 */
	protected double salario(){
		
		return salario + comissao();
	}
	
	protected double comissao(){
		
		return 0.0;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
