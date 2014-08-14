import java.sql.DriverManager;


public class TesteConexao {

	public static void main(String[] args){
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost","root",)
	}
}
