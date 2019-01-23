/**
 * 
 */
package Team;

/**
 * @author filipe.a.rodrigues
 *
 */
public class GuardaRedes extends Jogador {

	// Atributos
	public int reflexos;

	/**
	 * 
	 */
	public GuardaRedes(String nome, String apelido) {
		super(nome, apelido);
		// TODO Auto-generated constructor stub
		DefineCapacidades(50, 50, 50, 50, 50, 50);
	}

	public void DefineCapacidades(int fisico, int defesa) {
		this.fisico = fisico;
		this.defesa = defesa;
	}

}
