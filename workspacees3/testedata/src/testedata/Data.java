package testedata;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int dian = 24;
       int mesn = 8;
       int anon = 1978;
       int diaa = 25;
       int mesa = 9;
       int anoa = 2014;
       
       if (mesn > mesa){
    	   System.out.println("Você tem: "+((anoa-1)-anon)+" anos");
       }
       if (mesa >= mesn){
    	   if(diaa < dian){
    		   System.out.println("Você tem: "+((anoa-1)-anon)+"anos ");
    	   }
    	   if (diaa > dian){
    		   System.out.println("Você tem: "+(anoa - anon) + " anos");
    	   }
       }
        if ((mesa == mesn)&&(diaa == dian)){
        	System.out.println("parabéns hoje é seu aniversario você esta completando: "+(anoa - anon)+" anos");
           }
       }
       
       }


