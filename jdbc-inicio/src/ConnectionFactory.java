import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection recuperarConexao() throws SQLException {
		
		return DriverManager
				.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezon=true&serverTimezone=UTC", "root", "root");
		
	}
}
