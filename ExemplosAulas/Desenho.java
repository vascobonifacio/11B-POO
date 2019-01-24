import java.awt.*;
import javax.swing.*;
public class Desenho extends JPanel {
protected int cx, cy, comp, larg; protected Color cor;
//Construtor, inicializa as variáveis de instância
public Desenho(int cx, int cy, int comp, int larg, Color cor) { this.cx = cx; this.cy = cy; this.comp = comp;
this.larg = larg; this.cor = cor;
}
//Cria o desenho. É chamado sempre que a janela fica visível
public void paintComponent (Graphics g) { super.paintComponent(g);
} }


++++

import java.awt.*;
import javax.swing.*;
public class Botoes extends JPanel {
public Botoes() {
JButton claro = new JButton("Claro"); this.add(claro);
JButton escuro = new JButton("Escuro"); this.add(escuro);
JButton sair = new JButton("Sair"); this.add(sair);
} }


***?

import java.awt.*;
import javax.swing.*;
public class Janela {
	private final static int dimH = 300;
	private final static int dimV = 300;
	public static void main(String[] arg) {
			JFrame f = new JFrame();
			f.setSize(dimH,dimV);
			f.setTitle("Janela com rectângulo");
			//Cria e adiciona a área de desenho no centro da janela
			Desenho d = new Desenho(100,50,100,80,Color.blue);
			Container c = f.getContentPane(); 
			c.add(d, "Center");
			//Cria e adiciona o contentor na parte de baixo da janela
			c.add (new Botoes(), "South");
			f.setVisible(true);
	}
}
