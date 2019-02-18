import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingFiles3 {

	public static void main(String[] args) {

		String fileName = "file_to_be_read.txt";

		System.out.println("Olá, vamos ler o ficheiro: '" + fileName + "'");

		// try-with-resources (tentar com recursos)
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("Ocorreu um erro !");
			e.printStackTrace();
		}
	}
}
