package br.com.revisao.whilefor;

import java.util.Scanner;

public class rwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      float num1;
      float num2;
      boolean executar = true;
      int opcao;
      
     
      while(executar){
    	  System.out.println("escolaha a op��o de opera��o:");
          System.out.println("1 - SOMA: ");
          System.out.println("2 - DIVIS�O: ");
          System.out.println("3 - MULTIPLICA��O: ");
          System.out.println("4 - SUBTRA��O: ");
          System.out.println("5 - SAIR ");
          
          Scanner op = new Scanner(System.in);
          opcao = op.nextInt();
    	  if(opcao == 1){
    		  System.out.println("digite o primeiro n�mero: ");
    		  num1 = op.nextFloat();
    		  System.out.println("digite o segundo n�mero: ");
    		  num2 = op.nextFloat();
    		  
    		  System.out.println(num1 + " + " + num2 +" = " +(num1+num2));
    	  }
    	  if(opcao == 2){
    		  System.out.println("digite o primeiro n�mero: ");
    		  num1 = op.nextFloat();
    		  System.out.println("digite o segundo n�mero: ");
    		  num2 = op.nextFloat();
    		  
    		  System.out.println(num1 + " / " + num2 +" = " +(num1/num2));
    		  
    	  }
    	  if(opcao == 3){
    		  System.out.println("digite o primeiro n�mero: ");
    		  num1 = op.nextFloat();
    		  System.out.println("digite o segundo n�mero: ");
    		  num2 = op.nextFloat();
    		  
    		  System.out.println(num1 + " x " + num2 +" = " +(num1*num2));
    	               }
    	  if(opcao == 4){
    		  System.out.println("digite o primeiro n�mero: ");
    		  num1 = op.nextFloat();
    		  System.out.println("digite o segundo n�mero: ");
    		  num2 = op.nextFloat();
    		  
    		  System.out.println(num1 + " - " + num2 +" = " +(num1-num2));
    	               }
    	  if(opcao == 5){
    		   
    		  System.out.println("sair!!!!!");
    		  executar = false;
    	               }
      
          }

}
}
