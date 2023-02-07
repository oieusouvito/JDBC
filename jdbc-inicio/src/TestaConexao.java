import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezon=true&serverTimezone=UTC", "root", "root");
		
		System.out.println("fechando conexão");
		con.close();
	}
	
}
