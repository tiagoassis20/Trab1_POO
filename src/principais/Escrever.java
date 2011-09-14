package principais;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import folhaGenerica.Empresa;

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
			System.out.println("Arquivo n‹o encontrado.");
			e.printStackTrace();
		}
		
		Empresa empresa = new Empresa();
			empresa.setNome(linhas.get(0).substring(linhas.get(0).indexOf(":")+1,linhas.get(0).indexOf(";")));
			
			for(int i = 0; i < linhas.size(); i++){
				
				String linha = linhas.get(i);
				
				if(linha.startsWith("Diretor")){/*
					Diretor diretor = new Diretor(
										linha.substring(linha.indexOf(",") +1,linha.lastIndexOf(",")), 
										Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(","))), 
										Double.parseDouble(linha.substring(linha.lastIndexOf(",")+1,linha.indexOf(";"))) 
										);*/
					
				}else if(linha.startsWith("Gerente")){/*
					Gerente gerente = new Gerente(
										linha.substring(linha.indexOf(",") +1,linha.lastIndexOf(",")), 
										Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(","))), 
										Double.parseDouble(linha.substring(linha.lastIndexOf(",")+1,linha.indexOf(";"))) 
										);*/
				}else if(linha.startsWith("Analista")){/*
					Analista analista = new Analista(
										linha.substring(linha.indexOf(",") +1,linha.lastIndexOf(",")), 
										Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(","))), 
										Double.parseDouble(linha.substring(linha.lastIndexOf(",")+1,linha.indexOf(";"))),
										Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(",")))
										);*/
					
					System.out.println( linha.substring(linha.indexOf(",") +1, linha.lastIndexOf(",")) ); 
					String aux = linha.substring(linha.indexOf(",") +1, linha.lastIndexOf(",")) ;

					System.out.println(linha.substring(linha.indexOf(","+1), aux.indexOf(",")));
					System.out.println(linha.substring(aux.indexOf(","+1)));
					
					//System.out.println( Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(","))) ); 
					//System.out.println( Double.parseDouble(linha.substring(linha.indexOf(",")+1,linha.lastIndexOf(","))) );
					//System.out.println( Integer.parseInt(linha.substring(linha.lastIndexOf(",")+1,linha.indexOf(";"))) );
					
				}else if(linha.startsWith("Programador")){/*
					Programador programador = new Programador(
										linha.substring(linha.indexOf(",") +1,linha.lastIndexOf(",")), 
										Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(","))), 
										Double.parseDouble(linha.substring(linha.lastIndexOf(",")+1,linha.indexOf(";"))),
										Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(","))) 
										);*/
				}
			}
			/*
			
			//empresa.inserirFuncionario(diretor);
			//empresa.inserirFuncionario(gerente);
			//empresa.inserirFuncionario(analista);
			//empresa.inserirFuncionario(programador);	
			
			System.out.println(empresa.getNome());
		
			System.out.println("Diretor");
			System.out.println(diretor.getCodigo() + diretor.getNome());
			
			System.out.println("Gerente");
			System.out.println(gerente.getCodigo() + gerente.getNome());
			
			System.out.println("programador");
			System.out.println(programador.getCodigo() + programador.getNome());
			
			System.out.println("analista");
			System.out.println(analista.getCodigo() + analista	.getNome());
			
		/*
		try {
			
			ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream("src/empresa.obj"));
			arquivo.writeObject(empresa);
			arquivo.close();
			
		} catch (Exception e) {
			System.out.println("Problema na grava‹o");
			System.out.println(e);
		}
		*/
		//System.out.println("Empresa "+empresa.getNome()+" Salva com Sucesso!" );
	}

}
