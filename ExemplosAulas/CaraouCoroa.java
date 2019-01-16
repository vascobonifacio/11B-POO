package POO11B;


	//Classe de objetos randômicos
	import java.util.Random;
	 
	public class CaraouCoroa {
	    public static void main(String[] args)
	    {
	        //Instância de Random
	        Random gerador = new Random();
	 
	        //O método nextBoolean() devolve aleatoriamente os valores true e false.
	        boolean resultado = gerador.nextBoolean();
	        
	        //String contendo o lado da moeda
	        String lado;
	        
	        //Condição para Cara ou Coroa
	        if(resultado == true){
	            lado = "Cara";
	        }
	        else{
	            lado = "Coroa";
	        }
	 
	        //Exibição do resultado
	        System.out.println(lado);
	    }
	}

