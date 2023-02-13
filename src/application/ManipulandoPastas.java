package application;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Caminho da pasta:");
		String strPath = "C:\\Users\\Carlos Araujo\\Desktop\\PastaParaTestes";

		File path = new File(strPath);

		// Pegando uma listagem de todas as pastas dentro da pasta

		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("Pastas: ");
		System.out.println("---------------------------------------");
		for (File folder : folders) {
	
			System.out.println(folder);
			
		}
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");

		// Pegando uma lista de todos os arquivos dentro da pasta(diretorio)
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		System.out.println("---------------------------------------");
		for (File file : files) {
	
			System.out.println(file);
		
		}
		System.out.println("---------------------------------------");

		System.out.println("---------------------------------------");
		boolean sucess = new File(strPath + "\\subPasta").mkdir();
		System.out.println("A subpasta foi criada? : " + sucess);
		System.out.println("---------------------------------------");

		
		
		//Pegando nome ou caminho de arquivos; 
		System.out.println("--------------------------------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("Nome da pasta");
		System.out.println(path.getName());
		System.out.println("---------------------------------------");
		System.out.println("Cmainho do diretorio");
		System.out.println(path.getParent());
		System.out.println("--------------------------------------------------------------");
		
		
		sc.close();

	}

}
