import java.util.ArrayList;

public class FichaTrabalho {

	// Exerc�cio 1
	public double valorMedio(int array[]) { // Vasco Lopes (que disse ser Jos� Rufino) 
		double soma = 0;
		for(int e : array) {
			soma = soma + e;
		}
		return soma / array.length;
	}

	// Exerc�cio 2
	public void imprimeComprida(String s1, String s2) { // Miguel Cruz
		// System.out.println("Apagar isto e programar funcionalidade!");
		System.out.println("Nome 1 => " + s1 + "  -- nome 2 => " + s2);
	}

	// Exerc�cio 3
	public void imprimeNomes(String[] nomes) { // Joaquim Queiroz
		// a resolver pelo aluno !
		for(String e : nomes) {
			System.out.println("Nome: " + e);
		}
	}

	// Exerc�cio 5 -- a implementar pelo aluno


	@SuppressWarnings("serial")
	public static void main(String []args){

		FichaTrabalho ficha1 = new FichaTrabalho();

		int arrayTeste[] = {1,2,3,4,5};

		String nome1 = "Francisco";
		String nome2 = "Joao";

		// Parte 1 ----------------------------------------------------------------------------------------

		// Exerc�cio 1 - Teste
		double media = ficha1.valorMedio(arrayTeste);
		System.out.println("Valor m�dio: " + media);

		// Exerc�cio 2 - Teste
		ficha1.imprimeComprida(nome1, nome2);

		// Parte 2 ----------------------------------------------------------------------------------------

		// Temos a seguinte lista com o nome dos alunos e as suas alturas
		String[] nomesAlunos = { 	
				"Carolina Manso",
				"Duarte Rodrigues",
				"Joaquim Queiroz",
				"Jos� Rufino",
				"Lu�s Matoso",
				"Miguel Cruz",
				"Miguel Freitas",
				"Miguel Mendes",
				"Nuno Pestana",
				"Rodrigo Ferreira",
				"Tiago Dur�o",
				"Tom�s Pedro",
				"Tom�s Regado",
				"Vasco Lopes"
		};
		
		int[] alturasAlunos = { 171, 169, 170, 168, 168, 172, 179, 190, 171, 175, 178, 140, 169, 165 };

		// Exerc�cio 3 - Imprimir os nomes de todos os alunos usando um ciclo (while/for)

		// Exerc�cio 4 - Imprimir as m�dias das alturas

		// Exerc�cio 5 - Imprimir as notas dos alunos (junto aos seus nomes)

	}
}