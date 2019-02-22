public class FichaTrabalho{

     public double valorMedio(int array[]) {
         //Exercicio 1 - Preencher funcionalidade aqui
         return 0.0;
     }
     
     
     public void imprimeComprida(String s1, String s2) {
         //Exercicio 2 - Preencher funcionalidade aqui
         System.out.println("Apagar isto e programar funcionalidade!");
     }

     public static void main(String []args){
         
        FichaTrabalho ficha1 = new FichaTrabalho();
        
        int arrayTeste[] = {1,2,3,4,5};
        
        String nome1 = "Francisco";
        String nome2 = "Joao";
        
        //Exercicio 1 - Teste
        double media = ficha1.valorMedio(arrayTeste);
        System.out.println("Valor médio: " + media);
        
        //Exercicio 2 - Teste
        ficha1.imprimeComprida(nome1, nome2);
        
     }
}