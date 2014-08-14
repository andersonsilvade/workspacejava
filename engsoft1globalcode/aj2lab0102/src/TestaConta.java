/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
    	Conta conta = new Conta();
    	
        // Inicializacao da conta
    	conta.inicializaConta(250.0, "1234", "Anderson",8489, 341);
        // Impressao dos dados da conta
    	conta.imprimeDados();
        // Saque da conta
    	conta.saque(300);
        // Impressao dos dados da conta
    	conta.imprimeDados();
        // Deposito em conta
    	conta.deposito(450);
        //Impressao dos dados da conta
    	conta.imprimeDados();
    }
}
