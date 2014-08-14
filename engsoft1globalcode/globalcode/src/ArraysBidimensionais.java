
class ArraysBidimensionais {
 
  public static void main(String args[]) {
	int array[][] = { { 1, 6, 7 }, { 2, 5, 1, 0 }, { 2, 4, 1, 2, 1 } };
	for(int i =0; i <array.length;i++){
		System.out.println(" ");
		for(int z = 0;z<array[i].length;z++){
			System.out.print(array[i][z]+" ");
		}
	}
	System.out.println("");
	
	System.out.println("for it");
	for(int linha[] : array){
		System.out.println("");
		for(int coluna: linha){
			System.out.print(coluna+" ");
		}
	}
  }
}
