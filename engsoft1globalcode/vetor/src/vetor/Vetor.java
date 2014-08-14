package vetor;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("##############################");
		System.out.println("#                            #");
		System.out.println("#        CORRELAÇÃO          #");
		System.out.println("#                            #");
		System.out.println("##############################");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		 String relacaox;
		 String relacaoy;
		 int n ;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Digite as relações ,exemplo :");
		 System.out.println("Relação entre as NOTAS DE ESTATISTICA e as NOTAS DE CALCULO");
		 System.out.println("");
		 System.out.println("Digite a RELAÇÃO (X) : ");
		 relacaox = sc.nextLine();
		 System.out.println("Digite a RELAÇÃO (Y) : ");
		 relacaoy = sc.nextLine();
		 System.out.print("Digite a quantidade de amostra para X e Y: ");
		 n = sc.nextInt();
		 
		 float vetorx[] = new float[n]; 
		 float vetory[] = new float[n];
		 float vetorxy[] = new float[n];
		 float vetorx2[] = new float[n];
		 float vetory2[] = new float[n];
		 float Ex = 0;
		 float Ey = 0;
		 float Ex2 = 0;
		 float Ey2 = 0;
		 float Exy = 0;
		 float r;
		 float qx;
		 float qy;
		 float m;
		 float n1;
		 float n2;
		 float n3;
		 float raiz;
		 String correlacao = "Positiva";
		 
		  
		  
	      System.out.println("Preencha os valores para "+relacaox+" (X):");   
	      for (int i = 0 ; i < n ; i++){  
	         System.out.print("X["+(i+1)+"]: ");  
	         Scanner input = new Scanner(System.in);
	        
			 vetorx[i] = input.nextFloat();
	      }
	      
	      System.out.println("Preencha os valores para "+relacaoy+"(Y):");   
	      
	      for (int i = 0 ; i < n ; i++){  
	         System.out.print("Y["+(i+1)+"]: ");  
	         Scanner input = new Scanner(System.in);
	        
			 vetory[i] = input.nextFloat();
	      } 
	      
	      for (int i = 0 ; i < n ; i++){ 
	    	  Ex = Ex + vetorx[i];
	    	  Ey = Ey + vetory[i];
	          vetorxy[i] = (vetorx[i]*vetory[i]);
	          vetorx2[i] = (vetorx[i]*vetorx[i]);
	          vetory2[i] = (vetory[i]*vetory[i]);
	   }  
	      for(int i = 0;i < n;i++){
	    	  Exy = Exy + vetorxy[i];
	    	  Ex2 = Ex2 + vetorx2[i];
	    	  Ey2 = Ey2 + vetory2[i];
	      }
	      
	      
	      qx = (float) Math.pow(Ex, 2);
	      qy = (float)Math.pow(Ey, 2);
	      m = Ex*Ey;
	      n1 = n*Exy;
	      n2 = n*Ex2;
	      n3 = n*Ey2;
	      raiz = (n2 - qx)*(n3 - qy);
	      r = (float) ((n1 - m) / Math.sqrt(raiz));
	      
	      
	      
	      if(r < 0){
	    	  correlacao = "Negativa";
	    	  r = r *(-1);
	      }
	      if(r == 0){
	    	  correlacao = "nula";
	    	  System.out.println("Correlação entre "+relacaox+" e "+relacaoy+ " é "+correlacao);
	      }
		 
		 if((r <= 1)&&(r >=0.6)){
			 System.out.println("Correlação entre "+relacaox+" e "+relacaoy+ " é "+correlacao+" forte");
		 }
		 if((r < 0.6)&&(r >= 0.3)){
			 System.out.println("Correlação entre "+relacaox+" e "+relacaoy+ " é "+correlacao+" fraca");
		 }
		 if((r < 0.3)&&(r > 0)){
			 System.out.println("Correlação entre "+relacaox+" e "+relacaoy+ " é "+correlacao+" muito fraca");
		 }
		 

	}

}
