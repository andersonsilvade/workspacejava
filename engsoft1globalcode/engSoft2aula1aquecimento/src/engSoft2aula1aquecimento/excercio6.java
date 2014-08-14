package engSoft2aula1aquecimento;

import java.util.Scanner;

public class excercio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		float nota = 0;
		float media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("quantidade de notas a ser digitada: ");
			
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			
			System.out.println("Digite a nota " +(i+1)+" :");
			
			nota = nota + sc.nextFloat();
			}
		media = nota/n;
		
		System.out.println("sua média é: "+media);
		
		if (media < 6){
			System.out.println("Reprovado");
		}else{
			System.out.println("Aprovado");
		}
		

	}

}
