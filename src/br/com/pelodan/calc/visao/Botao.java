package br.com.pelodan.calc.visao;
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class Botao extends JButton {

	Botao(String valor, Color cor){
		setOpaque(true);
		setText(valor);
		setBackground(cor);
		setForeground(Color.WHITE);
		setFont(new Font("courier", Font.PLAIN, 30));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}
