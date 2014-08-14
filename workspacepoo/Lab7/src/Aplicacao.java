
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


@SuppressWarnings("serial")
public class Aplicacao implements Serializable{

	
	
	public static void salvar(BDEmpresa bD) throws Exception{    	
		FileOutputStream escritaDisco = new FileOutputStream("caixa2.ser");
		ObjectOutputStream escritaObjeto = new ObjectOutputStream(escritaDisco);
		escritaObjeto.writeObject(bD);
		System.out.println("salvando ...");
		escritaObjeto.close();
		
	}
	public static BDEmpresa recupera() throws IOException, ClassNotFoundException{
		FileInputStream ler = new FileInputStream("caixa2.ser");
		ObjectInputStream lerDisco = new ObjectInputStream(ler);
		BDEmpresa prod = (BDEmpresa) lerDisco.readObject();
		lerDisco.close();
		System.out.println("Agenda recuperada");
		return prod;
	}
	public static void main(String[] args) throws Exception {
		
		 Scanner scanner = new Scanner(System.in);
		 Adminstrador adm = new Adminstrador();
		 BDEmpresa bde = new BDEmpresa();
		 int sair = 0;
		 int opcao = 0;
		 int opcao2 = 0;
		 int opcao3 = 0;
		 boolean verifica = false;
		 boolean verificaUsuario = false;
		 //bde = recupera();
		 while(sair == 0){
			
			 switch(opcao){
			 case 0 :{
				 opcao = adm.menu();
				 break;
			 }
			 case 1 :{
				 verifica = adm.checarAdm();
			 	 while(verifica!= true){
			 		System.out.println("Administrador inválido");
			 		verifica = adm.checarAdm();
			 	 }
				 opcao = 3;
				  break;
			       }
			 case 2 :{
				 verificaUsuario = bde.login();
				while(verificaUsuario != true){
					System.out.println("Usuario inválido");
					verificaUsuario = bde.login();
					}
				System.out.println("logado");
				opcao = 4;
				break;
			 }
			 case 3:{
				 if(verifica){
					 switch(opcao2){
					 case 0 :{
						opcao2 = bde.menuAdm();
						break;
					 }
					 case 1:{
						 bde.addUsuario();
						 salvar(bde);
						 opcao2 = 0;
						 break;
					 }
					 case 2:{
						 opcao = 0;
						 opcao2 = 0;
						 verifica = false;
						 break;
						 }
					 case 3:{
						 sair = 1;
						 break;
					 }
				 }
			   }
				 break;
			 }
			 
			 case 4:{
				 
				 if(verificaUsuario){
				      switch(opcao3){
				 case 0:{
					opcao3 = bde.menuUsuario();
					break;
				 }
				 case 1:{
					 bde.entrada();
					 salvar(bde);
					 opcao3 = 0;
					 break;
				 }
				 case 2:{
					 bde.saida();
					 salvar(bde);
					 opcao3 = 0;
					 break;
				 }
				 case 3:{
					 bde.gerarRelatorio();
					  opcao3 = 0;
					 break;
				 }
				 case 4:{
					 bde.verificarSaldo();
					 opcao3 = 0;
					 break;
				 }
				 case 5:{
					 sair = 1;
					 opcao = 0;
					 break;
				 }
				      }
			 }
				 break;
			 }
			 
		 }
		
	}
	}
}

