package br.com.fatec.janela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Primeira {

	public static void main(String[] args) {
		
//		
//		JOptionPane.showMessageDialog(null,"testando interface");//menssagem
//		
//		String n1 = JOptionPane.showInputDialog("Digite um número");//messagem
//		int num = Integer.parseInt(n1);
//		JOptionPane.showMessageDialog(null,"valor: "+num);
//		
//		
//		
		//outra forma de gerar janela
//		JFrame janela = new JFrame("Teste de janela");
//		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		janela.setSize(400,200);
//		janela.setVisible(true);
//		
		//janela com botão
//		JFrame janelaBotao = new JFrame("Teste de janela");
//		JButton botao = new JButton("OK");
//		botao.setSize(50,50);
//		janelaBotao.getContentPane().add(botao);//botao em toda janela
//		janelaBotao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		janelaBotao.setSize(400,200);
//		janelaBotao.setVisible(true);
		
		JPanel painel = new Painel();
		JFrame janelaLinha = new JFrame("Teste de janela");
	
		janelaLinha.getContentPane().add(painel);
		
		janelaLinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janelaLinha.setSize(400,200);
		janelaLinha.setVisible(true);
		
		//Evento janelaLinha = new Evento();
		
		//janelaLinha.getContentPane().add(e);//botao em toda janela
//		
//		janelaLinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		janelaLinha.setSize(400,200);
//		janelaLinha.setVisible(true);
	}
}
	


