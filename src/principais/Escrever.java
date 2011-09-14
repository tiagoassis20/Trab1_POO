package principais;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
			System.out.println("Arquivo n‹o encontrado.");
			e.printStackTrace();
		}
		
		Empresa empresa = new Empresa();
		Diretor diretor = null;
		Gerente gerente = null;
		Analista analista = null;
		Programador programador = null;
		
			empresa.setNome(linhas.get(0).substring(linhas.get(0).indexOf(":")+1,linhas.get(0).indexOf(";")));
			
			for(int i = 0; i < linhas.size(); i++){
				
				String linha = linhas.get(i);
				
				if(linha.startsWith("Diretor")){
					diretor = new Diretor(
							linha.substring(linha.indexOf(",") +1,linha.lastIndexOf(",")), 
							Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(","))), 
							Double.parseDouble(linha.substring(linha.lastIndexOf(",")+1,linha.indexOf(";"))) 
					);
					
				}else if(linha.startsWith("Gerente")){
					gerente = new Gerente(
							linha.substring(linha.indexOf(",") +1,linha.lastIndexOf(",")), 
							Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(","))), 
							Double.parseDouble(linha.substring(linha.lastIndexOf(",")+1,linha.indexOf(";"))) 
					);
					
				}else if(linha.startsWith("Analista")){
					String aux = linha.substring(linha.indexOf(",") +1, linha.lastIndexOf(",")) ;
					analista = new Analista(
						aux.substring(aux.indexOf(""), aux.indexOf(",")),
						Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(","))), 
						Double.parseDouble(aux.substring(aux.indexOf(",")+1)),
						Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(",")))
					);
					
				}else if(linha.startsWith("Programador")){
					String aux = linha.substring(linha.indexOf(",") +1, linha.lastIndexOf(",")) ;
					programador = new Programador(
							aux.substring(aux.indexOf(""), aux.indexOf(",")),
							Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(","))), 
							Double.parseDouble(aux.substring(aux.indexOf(",")+1)),
							Integer.parseInt(linha.substring(linha.indexOf(":")+1,linha.indexOf(",")))
					);
				}
			}
			
			
			empresa.inserirFuncionario(diretor);
			empresa.inserirFuncionario(gerente);
			empresa.inserirFuncionario(analista);
			empresa.inserirFuncionario(programador);	
			
		try {
			
			ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream("src/empresa.obj"));
			arquivo.writeObject(empresa);
			arquivo.close();
			
		} catch (Exception e) {
			System.out.println("Problema na grava‹o");
			System.out.println(e);
		}
		
		System.out.println("Empresa "+empresa.getNome()+" Salva com Sucesso!" );
	}

}
