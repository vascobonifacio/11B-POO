package Team;

public class Pessoa {

	// Atributos
	/**
	 * Primeiro nome da pessoa
	 */
	public String primeiro_nome;
	public String apelido;
	private int salario;
	public int idade;
	/**
	 * altura em metros
	 */
	public float altura;
	

	// Construtor
	public Pessoa(String nome, String apelido) {
		this.primeiro_nome = nome;
		this.apelido = apelido;
	}

	// Métodos
	
	/**
	 * Este metodo define o salario de uma pessoa
	 * @param valor - salario anual
	 */
	public void DefinirSalario(int valor) {
		this.salario = valor;
	}

	public int GetSalario() {
		return this.salario;
	}

}
