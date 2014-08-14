
class ControleFluxoCondicional {
 
  public static void main(String[] args) {
	String nome = "Carolina Pereira";
	int idade = 20;
	String rg = "34.654.789-9";
	char sexo = 'F';
	double salario = 1500.0;
	int anoAtual = 2009;
	double aliquota = 0.20;
	int anoNascimento = anoAtual - idade;
	String sexoPorExtenso="Masculino" ;
	 
	double impostoDevido = salario * aliquota;
    
	String textNasc = ", nascido(a) no ano de " + anoNascimento;
	
	String textSexo = " do sexo " + sexoPorExtenso;
	 
	String textImposto = " e pagará R$ " + impostoDevido + " de imposto.";
	
	if(sexo=='F'|| sexo =='f'){
		sexoPorExtenso="Femenino";
	}
	if(sexo=='M'|| sexo =='m'){
		sexoPorExtenso="Femenino";
	}else{
		sexo='x';
	}
	String textRg= " portado(a) do rg de numero ";
	String textTrabalho = ", está registrado(a) com o salário de R$ ";
	String textNome="O(A)senhor (a) ";
	switch(sexo){
	case 'F':
		 textNome="A senhora ";
		 textRg= " portadoado rg de numero ";
		 textTrabalho = ", está registrada com o salário de R$ ";
		break;
	case 'M':
		textNome="O senhor ";
		 textRg= " portadordo rg de numero ";
		 textTrabalho = ", está registrado com o salário de R$ ";
		break;
	case'x':
		textNome="O(a) senhor(a) ";
		 textRg= " portador(a)do rg de numero ";
		 textTrabalho = ", está registrado(a) com o salário de R$ ";
		 break;
		 
		
	}
	System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho
		    + textImposto);

	
	
	
  }
}
