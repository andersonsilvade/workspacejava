package br.com.exe6;

import java.text.DecimalFormat;
import java.util.Scanner;

import br.com.aplicativo1.Pessoa;

public class Cliente {
	DecimalFormat formatado = new DecimalFormat("0.00");
	
	Scanner entrada = new Scanner(System.in);
	
	private CadastroCliente [] clientes = new CadastroCliente[10];
	private String [] meses = {"Jan","Fev","Mar","Abr","Mai","Jun","jul","Ago","Set","Nov","Dez"};
	private double [] gastoMes = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
	
	
	
public void cadastrarCliente(){
		
		for (int i = 0; i < clientes.length;i++){
			if(clientes[i] == null){
				System.out.println("Insira um nome: ");
				String nome = entrada.next();
				System.out.println("Insira um telefone: ");
				String telefone = entrada.next();
				System.out.println("Insira um email: ");
				String email = entrada.next();
				System.out.println("Insira o endereço: ");
				String endereco = entrada.next();
				CadastroCliente nova = new CadastroCliente(nome, telefone, email, endereco);
				clientes[i] = nova;
				System.out.println("Novo contato adicionado!!!");
				break;
			}
		}
}
	
	
	public CadastroCliente[] getClientes() {
		return clientes;
	}
	public void setClientes(CadastroCliente[] clientes) {
		this.clientes = clientes;
	}
	public void realizarCompra(String m , double v,String nome){
		int cont = 0;
		for(int x = 0;x < clientes.length; x++){
			if(clientes[x]!= null){
				if(clientes[x].getNome().equals(nome)){
		            for(int i = 0;i < meses.length; i++){
			            if((meses[i].equals(m))){
				           gastoMes[i] = gastoMes[i] + v; 
				           cont++;
				           System.out.println("Compra realizada com sucesso");
				           System.out.println("");
			                                    }
		                                                }
	                                         }
                                        }
		                    }
		if(cont == 0){
			System.out.println("Cliente não encontrado");
			System.out.println("");
		}
	}
	
	public void imprimirGastoMes(String nome){
		int cont = 0;
		 for(int i = 0;i<clientes.length;i++){
			 if(clientes[i]!= null){
				 if(clientes[i].getNome().equals(nome)){
			 for (int x =0;x < gastoMes.length;x++)
			 if(gastoMes[x]!= 0 ){
				 cont++;
				 System.out.println("Cliente: "+clientes[i].getNome()+ " Mes: "+meses[x]+" Gasto: "+formatado.format(gastoMes[x])+"R$");
				 System.out.println("");
			 }
			}
		 }
		 }
		 if(cont == 0){
			 System.out.println("Cliente não encontrado");
		 }
	}
	public void ListarClientes(){
		int cont = 0;
		System.out.println("Clientes cadastrados");
		for(int i = 0; i < clientes.length;i++){
			if(clientes[i]!= null){
			System.out.println(clientes[i].getNome());
			System.out.println("");
			cont++;
			}
		}
		if(cont == 0){
			System.out.println("Nenhum cadastro encontrado");
		}
		cont = 0;
	}
	public void imprimirGastoTotal(String nome){
		double n = 0;
		for(int x = 0;x < clientes.length; x++){
			if(clientes[x]!= null){
				if(clientes[x].getNome().equals(nome)){
		for(int i = 0;i < gastoMes.length;i++){
			n = n + gastoMes[i];
			}
		
		System.out.println("O cliente "+clientes[x].getNome()+ "Gastou total um total "+formatado.format(n)+"R$ durante o ano" );
		System.out.println("");
	}
			}
		}
	}
	
	public void excluirCliente(String nome){
		int cont = 0;
		for(int i = 0; i < clientes.length;i++){
			if(clientes[i] != null){
				if(clientes[i].getNome().equalsIgnoreCase(nome)){
				clientes[i] = null;
				cont++;
				System.out.println("Cliente excluido com sucesso");
				break;
			}
		}
		if(cont == 0){
			System.out.println("Cliente não cadastrado");
		}
		cont = 0;
		
		System.out.println("");
			
	}
	}
	public void maiorComprador(){
		String  nome = "";
		
		double maior = 0 ;
		for(int i = 0; i < clientes.length;i++){
			double total = 0;
			if(clientes[i] != null){
				for(int x = 0;x < gastoMes.length;x++){
					total = total +gastoMes[x];
				    if(total > maior){
					maior = total;
					nome = clientes[i].getNome();
				}
			
			}
				
			}
		}
		System.out.println("Nome: "+nome+" Gasto "+maior);
		System.out.println("");
		
	}
	
	
	
	
	public void menuOpcao(){
		System.out.println("");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Realizar compra");
		System.out.println("3 - Listar compras do mês");
		System.out.println("4 - Lista compra acumulada");
		System.out.println("5 - Listar clientes");
		System.out.println("6 - Listar cliente que mais comprou");
		System.out.println("7 - Excluir cliente");
		System.out.println("8 - Sair");
	}
			
			
}
