import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezon=true&serverTimezone=UTC",
						"root", "root");

		java.sql.Statement stm = con.createStatement();
		boolean resultado = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		
		System.out.println(resultado);
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
			
		}
		
		System.out.println("fechando conexão");
		con.close();
		
	}
	
}
