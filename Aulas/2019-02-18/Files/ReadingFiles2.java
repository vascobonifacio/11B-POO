import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFiles2 {

	public static void main(String[] args) {

		String fileName = args[0];

		System.out.println("Olá, vamos ler o ficheiro: '" + fileName + "'");

		// a vantagem do scanner é poder ler inteiros, strings, numeros, etc directamente
		// tem um buffer muito pequeno (1k) e não é sincrono
		
		// try-with-resources (tentar com recursos)
		try (Scanner scanner = new Scanner(new File(fileName))) {

			System.out.println("Abrimos o ficheiro, agora vamos ler linha a linha:");

			int lineNumber = 0;
			while (scanner.hasNext()){
				System.out.println(lineNumber + ": " + scanner.nextLine());
				lineNumber ++;
			}

		} catch (IOException e) {
			
			System.out.println("Ocorreu um erro !");
			e.printStackTrace();
		}
	}
}
