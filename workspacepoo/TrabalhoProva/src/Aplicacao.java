import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;




public class Aplicacao {
	
	public static void salvarEscola(BDEscola bde) throws Exception{    	
		FileOutputStream escritaDisco = new FileOutputStream("escola.ser");
		ObjectOutputStream escritaObjeto = new ObjectOutputStream(escritaDisco);
		escritaObjeto.writeObject(bde);
		System.out.println("salvando ...");
		escritaObjeto.close();
		
	}
	public static BDEscola recuperarEscola() throws IOException, ClassNotFoundException{
		FileInputStream ler = new FileInputStream("escola.ser");
		ObjectInputStream lerDisco = new ObjectInputStream(ler);
		BDEscola cad = (BDEscola) lerDisco.readObject();
		lerDisco.close();
		
		return cad;
	}
	public static void main(String[] args) throws Exception, IOException{
		
		Scanner scanner = new Scanner(System.in);
		 BDEscola escola = new BDEscola();
		 int sair = 0;
		 int opcao = 0;
		 while(sair == 0){
			 switch(opcao){
			 case 0 :{
				 escola.menu();
				 opcao = scanner.nextInt();
				 break;
			 }
			 case 1:{
				 escola.cadastrarAluno();
				 salvarEscola(escola);
				 opcao = 0;
				 break;
			 }
			 case 2:{
				 escola.cadastraProfessor();
				 salvarEscola(escola);
				 opcao = 0;
				 break;
				 
			 }
			 case 3:{
				 escola.cadastrarDisciplina();;
				 salvarEscola(escola);
				 opcao = 0;
				 break;
				 }
			 case 4:{
				 
				 escola.imprimirAluno();
				 opcao = 0;
				 break;
			 }
			 case 5 :{
				
				 escola.imprimirProfessor();
				 opcao = 0;
				 break;
			 }
			 case 6 :{
				 escola.verificarDisciplinasMatriculada();
				 opcao = 0;
				 break;
			 }
			 case 7:{
				 escola.sizeProfessor();
				 opcao = 0;
				 break;
			 }
				 
			 case 8 :{
				 escola.sizeAluno();				 
				 opcao = 0;
				 break;
			 }
			 case 9 :{
				 escola.sizeDiciplina();;				 
				 opcao = 0;
				 break;
			 }
			 case 10 :{
				 escola.verificarQuantidadeMatriculada();;				 
				 opcao = 0;
				 break;
			 }
			 case 11:{
				 escola.verificarMateria();
				 opcao = 0;
				 break;
			 }
			 case 12:{
				 escola.matriculaPorDisciplina();
				 opcao = 0;
				 break;
			 }
			 case 13:{
				 escola = recuperarEscola();
				 opcao  = 0;
				 break;				 
			 }
			 case 14:{
				 escola.matricularAluno();
				 opcao  = 0;
				 break;				 
			 }
			 case 15:{
				 escola.atribuirDisciplina();
				 opcao  = 0;
				 break;				 
			 }
			 
			 
			 case 16:{
				 escola.encerrar();
				 System.out.println("\nfinalinado");
				 sair = 1;
				 break;
			 }

			 default :{
				 escola.menu();
				 opcao = scanner.nextInt();
				 break;
				 
			 }
			 }


	}

	}
	
}
