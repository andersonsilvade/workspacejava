import java.math.BigDecimal;
import java.math.RoundingMode;


public class TesteBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a  = 1.009;
		
		 a = a * 10;
		 double resultado = 0;
		BigDecimal decimal = new BigDecimal(a).setScale(2, RoundingMode.CEILING);
		 resultado = decimal.doubleValue();
		
		
		System.out.println(resultado);

	}

}
