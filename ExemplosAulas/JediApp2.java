package poo11B;

//importação de classe de input
import java.util.Scanner;

public class JediApp2 {

	public static void main(String[] args) {
		
		//instancia um objeto
		JediKnight knight1 = new JediKnight();
		
		// cria objeto para leitura de texto 
		Scanner keyInput = new Scanner(System.in);
		
		//faz a pergunta
		System.out.println( "Qual o nome do Cavaleiro 1?" );
		//recolhe o input
		String jd1Name = keyInput.nextLine();

		System.out.println( "Qual a cor do Sabre" );
		//recolhe o input
		String jdColor = keyInput.nextLine();
		
		//atribui o valor ao nome do cavaleiro e converte para maiusculas
		knight1.name = jd1Name;
		knight1.lightSaberColor = jdColor;
		
		//knight1.name = "Luke Skywalker";
		
		knight1.isDarkSide = false;
		//knight1.lightSaberColor = "Blue";
		knight1.forceLevel = 70;
		
		knight1.main(args);
		
		
		JediKnight knight2 = new JediKnight();
		
		knight2.name = "Lord Sith";
		
		knight2.isDarkSide = true;
		knight2.lightSaberColor = "Purple";
		knight2.forceLevel = 80;
		
		knight2.main(args);
		
		knight2.duel(knight1);
		
		

	}

}
