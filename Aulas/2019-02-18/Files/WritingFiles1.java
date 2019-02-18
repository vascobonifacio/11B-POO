import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WritingFiles1 {

	public static void main(String[] args) {

		String fileName = "output_file.txt";
		String contents = "Olá\nEste é um ficheiro simples com\n3 linhas!";

		System.out.println("Olá, vamos escrever no ficheiro: '" + fileName + "'\nA seguinte mensagem:\n" + contents);

		// try-with-resources (tentar com recursos)
		try {
			Files.write(Paths.get(fileName), contents.getBytes());

		} catch (IOException e) {
			System.out.println("Ocorreu um erro !");
			e.printStackTrace();
		}
	}
}
