
public class Compra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Fatura comprar = new Fatura(3, 4,50);
		Fatura comprar1 = new Fatura(10 , 10 , 200);
		
		 comprar.getTotalFatura();
		 comprar.imprimir();
		 System.out.println("#########################");
		 comprar1.getTotalFatura();
		 comprar1.imprimir();
		
	}

}
