package poo11B;


public class JediKnight {
	String 	name;
	int 	forceLevel;
	boolean isDarkSide;
	String 	lightSaberColor;
	
	public static void mindTrick() {
		// faz truque da Força
		System.out.println("MindTrick!");
		 }
	public void duel(JediKnight enemy){
		// lutar com sabre
		System.out.println("Duel!");
		
		int atForce = this.forceLevel;
		System.out.println(this.forceLevel);
		int defForce = enemy.forceLevel;
		System.out.println(enemy.forceLevel);
		if (atForce >= defForce) {
			System.out.println("O vencedor é: " + this.name);
		} else System.out.println("O vencedor é: " + enemy.name);
		 }
	public static void jump(){
		// saltar
		System.out.println("Jump!");
		 }	
	
	
	
	public void main(String[] args) {
		// Método Principal		
		System.out.println("***************************!");
		System.out.println("May the Force be with you!");
		System.out.println("I am " + this.name + "!");
		System.out.println("I have a " + this.lightSaberColor + " light saber!");
		
		if (this.isDarkSide == true) {
			System.out.println("I am bound to the Dark side!");
			System.out.println("***************************!");
		} else {
			System.out.println("I am bound to the Light side!");
			System.out.println("***************************!");
		}
	}

}
