import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles1 {

	public static void main(String[] args) throws IOException {

		String fileName = "file_to_be_read.txt";

		System.out.println("Olá, vamos ler o ficheiro: '" + fileName + "'");

		FileReader reader = new FileReader(fileName);
		BufferedReader is = new BufferedReader(reader);

		System.out.println("Abrimos o ficheiro, agora vamos ler linha a linha:");

		int lineNumber = 0;
		String line = is.readLine();
		while(line != null) {
			System.out.println(lineNumber + ": " + line);
			line = is.readLine();
			lineNumber++;
		}
		/**
		for(int lineNumber = 0; line != null; lineNumber++) {
			System.out.println(lineNumber + ": " + line);
			line = is.readLine();
		}
		**/
		is.close();
		reader.close();
	}
}
