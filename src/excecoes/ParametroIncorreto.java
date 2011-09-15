package excecoes;

public class ParametroIncorreto extends Exception{
	public ParametroIncorreto(){}
	public void exibir(){
		System.out.println("valor de parametro invalido");
	}
}
