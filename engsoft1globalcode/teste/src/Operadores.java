
public class Operadores {
 
  public static void main(String[] args) {
	String nome = "Carolina Pereira";
	int idade = 20;
	String rg = "34.654.789-9";
	char sexo = 'F';
	double salario = 1500.0;
	int anoAtual = 2013;
	double aliquota = 0.20;
	int anoNascimento = anoAtual-idade;
	String sexoPorExtenso = sexo=='F'?"Feminino":"Masculino";
	double impostoDevido = salario*aliquota;
	System.out.print("O(a) Senhor(a) " + nome + ", nascido(a) no ano de ");
	System.out.println(anoNascimento + ", portador(a) do RG de n�mero " + rg);
	System.out.print(", do sexo " + sexoPorExtenso);
	System.out.print(", est� registrado(a) com o sal�rio de R$ " + salario);
	System.out.println(" e pagar� R$ " + impostoDevido + " de imposto.");
  }
}
