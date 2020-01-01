package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {

   public static void createNewTable(){

        String url ="jdbc:sqlite:KATA5.db";
        String sql ="CREATE TABLE IF NOT EXISTS email (\n"
                + "id integer PRIMARY KEY AUTOINCREMENT,\n"
                + "Mail TEXT NOT NULL);";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()){
            stmt.execute(sql);
            System.out.println("Tabla creada");            
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }        
    }
}