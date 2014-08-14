public class TesteRuntimeExceptions {

	public static void main(String[] args) {
		// Leitura do parametro digitado pelo usuario como parametro do main
     try{
		String parametro1 = args[0];
		int numero = Integer.parseInt(parametro1);
     }catch(ArrayIndexOutOfBoundsException e){
    	 System.out.println("Problema no array");
    	e.printStackTrace();
     }catch(NumberFormatException e){
    	 System.out.println("Parametro invalido");
    	 e.printStackTrace();
     }
		
	}
}
