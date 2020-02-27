
package test.models;

import java.sql.*;


public class Postgres {

    Statement st;
    Connection db;
    public Postgres(){
     try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        String url = "jdbc:postgresql://raja.db.elephantsql.com:5432/egdehmiu";
        String username = "egdehmiu";
        String password = "AHrOdM8pW4ffHw8vpj3iAP9iI8a8ztzl";
        
        try {
            db = DriverManager.getConnection(url, username, password);
            st = db.createStatement();
            
        }catch (java.sql.SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        
        
    }
    
    
    public String RunQuery(String query) throws SQLException{
            String result = "";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                result = rs.getString(1);
            }
            rs.close();
            //st.close();
            return result;
    }
}