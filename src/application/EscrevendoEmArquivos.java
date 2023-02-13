package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoEmArquivos {

	public static void main(String[] args) {

		String[] lines = new String[] { "Olá Juan tudo bem? ", "Tudo sim e você" };

		String path = "C:\\Users\\Carlos Araujo\\Desktop\\PastaParaTestes\\in.txt";

		//Com o true indica que eu não quero recriar ou destruir o arquivo ja existente, ou seja
		//adicionar em baixo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
