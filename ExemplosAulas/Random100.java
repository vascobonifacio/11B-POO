package POO11B;

import java.util.Random;

public class Random100 {
	 public static void main(String[] args)
	    {
	        //Instância de Random
	        Random gerador = new Random();
	 
	        //O método nextBoolean() devolve aleatoriamente os valores true e false.
	        boolean resultado = gerador.nextBoolean();
	        
	        int resultadoInt = gerador.nextInt(100);
	        
	        System.out.println("Inteiro Aleatório: " + resultadoInt);
	       
	        String lado;
	        
	        if(resultadoInt < 50){
	            lado = "Ganha equipa A";
	        }
	        else if(resultadoInt==50){
	        	lado = "EMPATE";
	        }	        
	        else {
	        	lado = "Ganha equipa B";
	        }
	 
	        //Exibição do resultado
	        System.out.println(lado);
	    }
}
