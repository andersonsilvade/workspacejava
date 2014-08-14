import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Teste {

	
	public static void main(String[] args) {
		//criando padrao de busca
		Pattern padrao = Pattern.compile("bonito|feio");
		//buscando letra por letra
		//Pattern padrao = Pattern.compile("[\\wé]");
		//criando texto		
		Matcher matches = padrao.matcher("o curintia é feio e o sao paulo é bonito. ");
		//trocando palavra padrao por legal
		//quebrando texto
		String[] lista="o curintia é feio e o sao paulo é bonito".split(" ");
		//String result = matches.replaceAll("legal"); //metodo de troca
		//while  o matches encontrar uma palavra dentro do padrao ele da print
		for (String p :lista){
			System.out.println(p);
		}
		while(matches.find()){
			System.out.println("palavra: \t"+matches.group()+"\nna posição:\t"+ matches.start());
			
		}
		//System.out.println(result);
		

	}

}
