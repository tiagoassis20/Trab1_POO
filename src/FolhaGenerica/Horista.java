package folhaGenerica;


public class Horista extends Funcionario{
	
	private static final long serialVersionUID = -3577179737553893225L;
	
	private double valorHora;
	private int numeroHoras;
	
	/**
	 * Construtor
	 * @param nome
	 * @param codigo
	 * @param valorHora
	 * @param numeroHoras
	 */
	public Horista(String nome, int codigo, double valorHora,int numeroHoras) {
		super(nome,codigo);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	/**
	 *  Calcula salario valor da hora X numero de horas
	 * @see folhaGenerica.Funcionario#salario()
	 */
	protected double salario(){
		
		return valorHora * numeroHoras;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
}
