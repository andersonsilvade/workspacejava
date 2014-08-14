//Array
public class TesteArray {

	
	public static void main(String[] args) {
		
		float teste[] ={1f,2.5f,3f,4.12f,5.6f};
		System.out.println("... imprimindo os elementos...");
		
		for(int i = 0;i<teste.length;i++){
			System.out.println(teste[i]);
			
		System.out.println(">>> imprimindo for it<<<");
		
		for(float posicao:teste){
			System.out.println(posicao);
		}
		}
		System.out.println("---imprimindo 2D");
		int bidim[][]={{1,2},{3,4},{5,6}};//a primeira{}representa 1 dim a chave dentro da chave{{}} representa a dim 2 ,ou seja tenho array[3][2]
		for(int i = 0 ;i<bidim.length;i++){
			for(int j = 0;j<bidim[i].length;j++){

				System.out.println(bidim[i][j]);
			}
		}
		System.out.println("for it");
		for(int linha1[]:bidim){
			for(int coluna1:linha1){
				System.out.println(coluna1);
			}

		}
	}
	

}
