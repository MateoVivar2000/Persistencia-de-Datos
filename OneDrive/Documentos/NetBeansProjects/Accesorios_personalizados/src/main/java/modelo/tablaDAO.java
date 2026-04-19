package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class tablaDAO {
   String linkConexionBD = "jdbc:sqlite:C:/Users/mateo/OneDrive/Documentos/Base de datos/ProductosPersonalizados.s3db";
    Connection conn = null;
    
    public tablaDAO(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn= DriverManager.getConnection(linkConexionBD);
            
            System.out.println("Conexión establecida");
        } catch (Exception e) {
            System.out.println("Error de conexión" + e);
        }
    }
    public int ejecutarSentenciaSQL (String linkConexion){
        try {
            PreparedStatement pstm= conn.prepareStatement(linkConexion);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    public ResultSet consultarProductos (String strsentenciaSQL){
        try {
            PreparedStatement pstm= conn.prepareStatement(strsentenciaSQL); 
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
