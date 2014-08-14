import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale = new Locale("pt","BR");
		
		GregorianCalendar calendar = new GregorianCalendar();
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'",locale);
		
		System.out.println(formatador.format(calendar.getTime()));


	}

}
