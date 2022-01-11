package br.com.pelodan.calc.visao;
import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.pelodan.calc.modelo.Memoria;
import br.com.pelodan.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	
	private final JLabel label; 
	
	Display(){
		Memoria.getInstancia().adicionarObservador(this);
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		add(label);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		setBackground(new Color(49, 49, 49));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 15, 20));
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
