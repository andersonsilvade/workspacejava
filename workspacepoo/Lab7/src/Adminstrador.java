import java.util.Scanner;


public class Adminstrador {
	
	private String nomeAdm ;
	private String senhaAdim ;
	BDEmpresa empresa;
	Usuario add ;
	public Adminstrador(){
		this.nomeAdm = "Admin";
		this.senhaAdim = "admin";
		}
	
	public Adminstrador(String nomeAdm, String senhaAdim) {
		
		this.nomeAdm = nomeAdm;
		this.senhaAdim = senhaAdim;
	}


	public String getNomeAdm() {
		return nomeAdm;
	}


	public void setNomeAdm(String nomeAdm) {
		this.nomeAdm = nomeAdm;
	}


	public String getSenhaAdim() {
		return senhaAdim;
	}


	public void setSenhaAdim(String senhaAdim) {
		this.senhaAdim = senhaAdim;
	}
	
	public boolean  autenticarAdmin(String nomeAdmin,String senhaAdim){
		
		if((this.nomeAdm.equals(nomeAdmin)) && (this.senhaAdim.equals(senhaAdim)) )return true;
		return false;
	}
	
	
	
	
	public boolean checarAdm(){
		Scanner entrada = new Scanner(System.in);
		String nA;
		String sA;
		System.out.println("Digite nome Administrador: ");
		nA = entrada.next();
		System.out.println("Digite senha Administrador: ");
		sA = entrada.next();
		
		if(autenticarAdmin(nA, sA))return true;
		return false;
	}

	public static int menu(){
		int opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("1 - Logar Adiministrador");
		System.out.println("2 - Logar Usuário");
		opcao = entrada.nextInt();
		return opcao;
	}
	

}
