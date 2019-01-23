package Team;

public class Jogador extends Pessoa {

	//Atributos
	public int fisico;
	public int passe;
	public int defesa;
	public int remate;
	public int drible;
	public int velocidade;
	
	
	public Jogador(String nome, String apelido) {
		super(nome, apelido);
		// TODO Auto-generated constructor stub
	}
	
	public void DefineCapacidades(int fisico, int passe, int defesa, int remate, int drible, int velocidade) {
		this.fisico=fisico;
		this.passe=passe;
		this.defesa=defesa;
		this.remate=remate;
		this.drible=drible;
		this.velocidade=velocidade;
	}
	

}
