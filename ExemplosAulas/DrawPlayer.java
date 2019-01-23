package POO11B;

import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class DrawPlayer extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.black);
		g.drawString("Sou um Jogador de Futebol", 50, 50);
		
		
		//cabeça
		
		//x, y, alt, comp
		g.fillOval(400, 100, 50, 50);
		
		//corpo
		g.fillRect(375, 150, 100, 100);
		
		//Perna esquerda
		g.fillRect(50, 120, 20, 200);
		
		//perna direita
		g.fillRect(200, 120, 20, 200);
		
		//braço esquerdo
		
		//braço direito
		
		
		//bola de futebol
		
		//linhas de guia
		g.drawLine(400, 0, 400, 1000);
		g.drawLine(0, 1000, 0, 1000);
		
		
	}
	
	public static void main(String[] args)
	{
		JFrame win = new JFrame("Jogador de Futebol");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new DrawPlayer());
		win.setVisible(true);
	}

}
