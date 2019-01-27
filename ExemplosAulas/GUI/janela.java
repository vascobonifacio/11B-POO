package poo11b;

import java.awt.*;
import javax.swing.*;

public class janela {
	private final static int dimH = 300;
	private final static int dimV = 300;
	
	public static void main(String[] arg) {
			JFrame f = new JFrame();
			f.setSize(dimH,dimV);
			f.setTitle("Janela com rectângulo");
			
			//Cria e adiciona a área de desenho no centro da janela
			desenho d = new desenho(100,50,100,80,Color.blue);
			Container c = f.getContentPane(); 
			c.add(d, "Center");
			
			//Cria e adiciona o contentor na parte de baixo da janela
			c.add (new butoes(), "South");
			f.setVisible(true);
	}
}