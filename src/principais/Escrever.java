package principais;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import folhaGenerica.Empresa;
import folhaInformatica.Analista;
import folhaInformatica.Diretor;
import folhaInformatica.Gerente;
import folhaInformatica.Programador;

public class Escrever {
	
	public static void main(String[] args) {

		List<String> linhas = new ArrayList<String>();
		
		try {
			Scanner leitor = new Scanner(new File("src/empresa.txt"));
			
			while(leitor.hasNext()){
				linhas.add(leitor.next());
			}
			
			leitor.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado.");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Arquivo n�o encontrado.");
			e.printStackTrace();
		}
		
		Empresa empresa = new Empresa();
		Pattern p = Pattern.compile("[:,;]");
		for(int i = 0; i < linhas.size(); i++){
			String[] dados = p.split(linhas.get(i));
			for (int j = 0; j < dados.length; j++) {
				System.out.println("dados["+j+ "]= "+dados[j]);
				
			}
		}
		//	empresa.setNome(linhas.get(0).substring(linhas.get(0).indexOf(":")+1,linhas.get(0).indexOf(";")));
			
			for(int i = 0; i < linhas.size(); i++){
				
				String[] dados = p.split(linhas.get(i));
				
				if(dados[0].equalsIgnoreCase("Diretor")){
					Diretor diretor = new Diretor(
										dados[2], 
										Integer.parseInt(dados[1]), 
										Double.parseDouble(dados[3]) 
										);
					empresa.inserirFuncionario(diretor);
					System.out.println("Diretor");
					System.out.println(diretor.getCodigo() + diretor.getNome());
					
				}else if(dados[0].equalsIgnoreCase("Gerente")){
					Gerente gerente = new Gerente(
										dados[2], 
										Integer.parseInt(dados[1]), 
										Double.parseDouble(dados[3]) 
										);
					empresa.inserirFuncionario(gerente);
					System.out.println("Gerente");
					System.out.println(gerente.getCodigo() + gerente.getNome());
					
					
				}else if(dados[0].equalsIgnoreCase("Analista")){
					Analista analista = new Analista(
							dados[2], 
							Integer.parseInt(dados[1]), 
							Double.parseDouble(dados[3]),
							Integer.parseInt(dados[4])
							);
					empresa.inserirFuncionario(analista);
					
					
					
					System.out.println("analista");
					System.out.println(analista.getCodigo() + analista	.getNome());
					
				
					//System.out.println( Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(","))) ); 
					//System.out.println( Double.parseDouble(linha.substring(linha.indexOf(",")+1,linha.lastIndexOf(","))) );
					//System.out.println( Integer.parseInt(linha.substring(linha.lastIndexOf(",")+1,linha.indexOf(";"))) );
					
				}else if(dados[0].equalsIgnoreCase("Programador")){
					Programador programador = new Programador(
							dados[2], 
							Integer.parseInt(dados[1]), 
							Double.parseDouble(dados[3]),
							Integer.parseInt(dados[4])
							);
					empresa.inserirFuncionario(programador);
					
					System.out.println("programador");
					System.out.println(programador.getCodigo() + programador.getNome());
				}
			}
			
			
			//empresa.inserirFuncionario(diretor);
			//empresa.inserirFuncionario(gerente);
			//empresa.inserirFuncionario(analista);
			//empresa.inserirFuncionario(programador);	
			
			System.out.println(empresa.getNome());
		
			
			
			
			
		
		try {
			
			ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream("src/empresa.obj"));
			arquivo.writeObject(empresa);
			arquivo.close();
			
		} catch (Exception e) {
			System.out.println("Problema na grava��o");
			System.out.println(e);
		}
		
		//System.out.println("Empresa "+empresa.getNome()+" Salva com Sucesso!" );
	}

}
