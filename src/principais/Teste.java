package principais;

import folhaGenerica.Empresa;
import folhaInformatica.Analista;
import folhaInformatica.Diretor;
import folhaInformatica.EmpresaInformatica;
import folhaInformatica.Gerente;
import folhaInformatica.Programador;

public class Teste {

	public static void main(String[] args) {

		EmpresaInformatica loja = new EmpresaInformatica();
			loja.insereAnalista("Jose", 1,30.00, 55);
			loja.insereDiretor("Daniel", 1, 4000.00);
			loja.insereGerente("Rafael",1, 7000.00);
			loja.insereProgramador("Joao", 1, 30.00, 40);
		
		Analista analista = new Analista("Jose", 1,30.00, 55);
		Diretor diretor = new Diretor("Daniel", 2, 4000.00);
		Gerente gerente = new Gerente("Rafael",3, 7000.00);
		Programador programador = new Programador("Joao", 4, 30.00, 40);
		
		Empresa compustar = new Empresa();
			compustar.inserirFuncionario(analista);
			compustar.inserirFuncionario(diretor);
			compustar.inserirFuncionario(gerente);
			compustar.inserirFuncionario(programador);
			
		compustar.gerarFolha();
	}

}
