package br.com.globalcode.threads;

import javax.swing.JOptionPane;

public class TesteWaitNotify {

	public static void main(String args[]) throws Exception {

		// inicializando repositorio de dados
		ListaConvidados lista = new ListaConvidados();
       for(int i = 1 ;i < 15 ; i++){
		Thread t1 = new Thread(new EntregadorDeConvite(lista),"entregador1 "+i);
		
		// disparando entregadores de convites
		// s�o as threads consumidoras do reposit�rio de dados
		t1.start();
       }
		
        String email = "Pizza";
		for(int i = 0;i <100 ; i++){
			lista.adicionar(email + i);
		}
		lista.fecharLista();
		System.out.println("---------------LISTA FECHADA----------------");
		// loop de entrada de dados
		// esta thread (main) � a produtora de dados
		/*while (true) {
			// otem um novo email para adicionar na lista
			String email = JOptionPane.showInputDialog(
					"Digite o email do proximo convidado ", "");
			if (email != null) {
				lista.adicionar(email);
			} else {
				lista.fecharLista();
				break; // para sair do loop
			}
		}*/
	}
}
