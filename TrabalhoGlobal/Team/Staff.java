package Team;

public class Staff extends Pessoa {

	public String cargo;

	public Staff(String nome, String apelido, String posicao) {
		super(nome, apelido);
		// TODO Auto-generated constructor stub
		this.cargo=posicao;
	}

}
