        import java.util.Scanner;





public class testesql {
	public static void main(String[] args){
	
	     String apresentacao;
         String anderson ;
         Scanner sc = new Scanner(System.in);
          System.out.println("digite a condi��o: ");
        anderson = sc.next();


		if (anderson == "nervoso"){
			apresentacao =" ruim";
		}
		else{
			apresentacao = "boa";
		}
		System.out.println("Apresenta��o = "+apresentacao);
}
}

