import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;


public class Teste {

	

	public static void main(String[] args) {
		int locOP;
		String setor;
		
		
		Locale locale = new Locale("pt","BR");
		
		GregorianCalendar calendar = new GregorianCalendar();
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'",locale);
		
		OP op = new OP(1000,"Camiseta regata x",3400,20,new Corte("TNT","verde",2.5,new Costura(" linha Corrente Verde",20,new Estamparia("Sol Nascendo","Amarelo",new Embalagem("Papelão",1)))));
		
		List ops = new ArrayList<>();
		
		ops.add(op);
		
		
		setor = "Corte";
		
		locOP = 1000;
	   
		
		for( Object i : ops){
			OP x = (OP) i;
			if(x.comparar(locOP)== true){
			        if (setor == "Corte"){
			        	System.out.println(formatador.format(calendar.getTime()));
			        	System.out.println("-----------------------------------");
				        x.imprimeCorte();
				        System.out.println("-----------------------------------");
			          }
			        if(setor == "Costura"){
			        	System.out.println(formatador.format(calendar.getTime()));
			        	System.out.println("-----------------------------------");
				        x.imprimeCostura();
				        System.out.println("-----------------------------------");
			          }
			         if(setor == "Estaparia"){
			        	System.out.println(formatador.format(calendar.getTime()));
			        	System.out.println("-----------------------------------");
				        x.imprimeEstamparia();
				        System.out.println("-----------------------------------");
			           }
			         if (setor == "Embalagem"){
			        	System.out.println(formatador.format(calendar.getTime()));
			        	System.out.println("-----------------------------------");
				        x.imprimeEmbalagem();
				        System.out.println("-----------------------------------");
			         }
			
			}else{
				System.out.println("O.P não encontrada!!");
			}
		}
	}

}
