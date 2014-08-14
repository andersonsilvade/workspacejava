/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
    	Conta conta = new Conta();
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
    	conta.inicializaConta(500.0,"1234","Anderson",123,8489);
        // executar um deposito
    	conta.deposito(500);
        // Imprimir o saldo apos o deposito
    	conta.imprimeDados();
    	// executar um saque cujo valor seja menor que o saldo
    	conta.saque(200);
        // Imprimir o saldo apos o deposito
    	conta.imprimeDados();
        // executar uma retirada cujo valor seja maior que o saldo
    	conta.saque(150);
    	
        // Imprimir o saldo apos o deposito
    	conta.imprimeDados();
    }
}
