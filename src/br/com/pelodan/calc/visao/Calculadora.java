package br.com.pelodan.calc.visao;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	Calculadora(){
		organizarLayout();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(232, 322);
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		Teclado teclado = new Teclado();
		add(display, BorderLayout.NORTH);
		add(teclado, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		
		new Calculadora();
	}
}
