import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BDEmpresa implements Serializable {
	
	private List<Usuario> usuario; 
	private List<Caixa> caixa;
	Caixa cx;
	transient Scanner entrada;
		
	public BDEmpresa(){
		usuario = new ArrayList<Usuario>();
		caixa = new ArrayList<Caixa>();
		entrada = new Scanner(System.in);
		cx = new Caixa(0.0,0.0);
		}
	public void addCaixa(){
		caixa.add(cx);
	}
	public void addUsuario(){
		if(entrada == null){
			entrada = new Scanner(System.in);
		}
		String n ;
		String s ;
		System.out.println("Digite o nome: ");
		n = entrada.next();
		System.out.println("Digite a Senha: ");
		s = entrada.next();
		Usuario user = new Usuario(n,s);
		usuario.add(user);
		System.out.println("Usuario cadastrado com sucesso!!!");
		}
	
		
	public boolean logar(String n,String s){
			
		for(Object i : usuario){
				Usuario usrLoc = (Usuario) i;
				if(usrLoc.getUsuario().toString().equals(n)&& usrLoc.getSenha().toString().equals(s))return true;
				}
		return false;
	
	}
	
	public void imprimir(){
		
		for(Object i : usuario){
			Usuario usrLoc = (Usuario) i;
			if(usrLoc != null){
				System.out.println("Usuario "+usrLoc.getUsuario());
			}else{
				System.out.println("Lista vazia");
			}
	}
}
	
	
	public  int menuAdm(){
		int opcao = 0;
		System.out.println("1 - Cadastrar Usuário: ");
		System.out.println("2 - Voltar ao menur anterior");
		System.out.println("3 - Sair");
		opcao = entrada.nextInt();
		return opcao;
				}
	public int menuUsuario(){
		int opcao;
		if(entrada == null){
			entrada = new Scanner(System.in);
		}
		System.out.println("1 - Entrada no caixa: ");
		System.out.println("2 - Saida do caixa");
		System.out.println("3 - Gerar relatório");
		System.out.println("4 - Verificar saldo");
		System.out.println("5 - Sair");
		opcao = entrada.nextInt();
		return opcao;
	}
	public void entrada(){
		if(entrada == null){
			entrada = new Scanner(System.in);
		}
		double valor;
		System.out.println("digite o valor a ser creditado");
		valor = entrada.nextDouble();
		for(Object i : caixa){
			Caixa ent = (Caixa) i;
		if(ent != null){
		ent.setEntrada(valor);
		System.out.println("Saldo provisório: "+cx.getSaldo()+"R$");
		}
		}
		
	}
	public void saida(){
		if(entrada == null){
			entrada = new Scanner(System.in);
		}
		double valor;
		System.out.println("digite o valor a ser debitado");
		valor = entrada.nextDouble();
		cx.setSaida(valor);
		System.out.println("Saldo provisório: "+cx.getSaldo()+"R$");
	}
	public void gerarRelatorio(){
		System.out.println("Relátorio");
		System.out.println(cx.getHistorico());
	}
	
	public boolean login(){
 	       boolean teste;
		   Scanner entrada = new Scanner(System.in);
		   String n ;
			String s;
			System.out.println("Digite nome : ");
			n = entrada.next();
			System.out.println("Digite senha: ");
			s = entrada.next();
			if(logar(n,s)){
				teste = true;
			}else{
			teste = false;
			}
			return teste;
			
			 }
	public void verificarSaldo(){
		System.out.println("Saldo "+cx.getSaldo()+"R$");
	}
}