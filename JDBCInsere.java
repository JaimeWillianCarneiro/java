import java.sql.*;
import java.util.Calendar;


public class JDBCInsere {
    public static void main(String[] args) throws SQLException {
    // conectando

    Connection con = null;
    try{
        con = ConnectionFactory.getConnection();
                
    // cria um preparedStatement
    String sql = "insert into contatos" +
    " (nome,email,endereco,dataNascimento)" +
    " values (?,?,?,?)";
    PreparedStatement stmt = con.prepareStatement(sql);
    // preenche os valores
    stmt.setString(1, "Jaime");
    stmt.setString(2, "contato@caelum.com.br");
    stmt.setString(3, "R. Vergueiro 3185 cj57");
    stmt.setDate(4, new java.sql.Date(
    Calendar.getInstance().getTimeInMillis()));
    // executa
    stmt.execute();
    stmt.close();
    System.out.println("Gravado!");


    
    } catch(SQLException e){
        System.out.println(e);
    }
    finally{con.close();
    
    }
    
    }


    }