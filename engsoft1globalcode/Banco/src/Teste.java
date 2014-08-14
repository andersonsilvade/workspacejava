
public class Teste {

	public static void main(String[] args) {
		
		Cliente joao= new Cliente();//joao variavel
		joao.agencia = 123;
		joao.numeroConta = 32221;
		joao.saldo = 5000.0;
		
		Cliente anderson = new Cliente();
		anderson.agencia = 123;
		anderson.numeroConta = 32222;
		anderson.saldo = 1200.0;
		
		
		joao.sacar(800.0);//sacando
		anderson.sacar(1000.0);
		System.out.println("seu saldo atual � de R$ " + joao.saldo);
		System.out.println("Seu saldo atual � de R$ " + anderson.saldo);
		
	}

}
