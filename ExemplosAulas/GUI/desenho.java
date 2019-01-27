package poo11b;

import java.awt.*;
import javax.swing.*;

public class desenho extends JPanel {

	protected int cx, cy, comp, larg; 
	protected Color cor;
//Construtor, inicializa as variáveis de instância
	public desenho(int cx, int cy, int comp, int larg, Color cor) { 
		this.cx = cx; 
		this.cy = cy; 
		this.comp = comp;
		this.larg = larg; 
		this.cor = cor;
}
//Cria o desenho. É chamado sempre que a janela fica visível
public void paintComponent (Graphics g) { 
	super.paintComponent(g);
	g.setColor(cor);
	g.fillRect(cx,cy,comp,larg);
	g.fillOval(cx+100, cy+100, comp, larg);
	} 
}