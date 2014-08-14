
class Arrays {
  
  public static void main(String args[]) {
	String array[] = new String[5];
	for(int i = 0;i<array.length;i++){
		array [i]= "Cliente "+(i+1)+ " email:"+" cliente"+ (i+1) +"@cliente.com.br";
	}
	
	for(int z = 0;z <array.length;z++ ){//utilizando for
		System.out.println(array[z]);
	}
	System.out.println("<<<for it>>");
   
	for(String cliente:array){
    	System.out.println(cliente);
    }
  }
  
}
