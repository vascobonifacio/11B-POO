package poo11b;

import java.awt.*;
import javax.swing.*;

public class butoes extends JPanel {

	public butoes() {
		JButton claro = new JButton("Claro"); 
		this.add(claro);
		JButton escuro = new JButton("Escuro"); 
		this.add(escuro);
		JButton sair = new JButton("Sair"); 
		this.add(sair);
	} 
}