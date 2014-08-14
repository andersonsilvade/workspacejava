/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente {

    public static void main(String[] args) {
       Cliente cliente =new Cliente();
       
       cliente.inicializaCliente("Anderson Silva", "272354678");
       
       cliente.imprimeDados();
    }
}
