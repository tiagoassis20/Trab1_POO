package principais;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import folhaGenerica.Empresa;


public class Leitor {

	public static void main(String[] args) {

		Empresa empresa = null;
		
		try{
			
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("src/empresa.obj"));
			empresa = (Empresa) input.readObject();
			empresa.gerarFolha();
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo empresa.obj n�o encontrado.");
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println("Classe Empresa n�o encontrada.");
			e.printStackTrace();
		}catch (NullPointerException e) {
			System.out.println("Arquivo n�o encontrado.");
			e.printStackTrace();
		}
		
		
		
	}

}
