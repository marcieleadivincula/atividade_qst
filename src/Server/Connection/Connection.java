package Server.Connection;

import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Connection {
     
    public static ResultSet executaSelect(String sql) {
        ResultSet rs = null;
        DB con = new DB();
        try {
            rs = con.getConnection().prepareStatement(sql).executeQuery();
        }catch(Exception e) {
            System.err.println(e.getMessage());
        }
        return rs;
    }
    
    public static void executaDataManipulation(String sql) {
        DB con = new DB();
        try {
            PreparedStatement st = con.getConnection().prepareStatement(sql);
            st.executeUpdate(sql);
        }catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
