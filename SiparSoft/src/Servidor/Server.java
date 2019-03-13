/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Server {
    
//RECORDATORIO: Modificar de tal forma no se tenga que alterar los datos directamente
//              desde la clase, para conectar a la base de datos
    
    private static String USER="postgres";
    private static String PASS="1735922";
    private static String DB="Inventario";
    private static String SERVIDOR="localhost";
    private static String PUERTO="5432";
       
    private final static String DRIVER ="org.postgresql.Driver";
    private final static String URL = "jdbc:postgresql://"+SERVIDOR+":"+PUERTO+"/"+DB;
    
    private static Connection conexion =null;
    private static PreparedStatement psSql = null;
    private static ResultSet resultado = null;

    
    //RECORDATORIO: cambiar la funcione por unas de buscar e ingresar, dependiendo
    //              de los objetos que se creen
    
    public void ejecutar(String sql, String mostrar){
        try{ 
            Class.forName (DRIVER);
            conexion = DriverManager.getConnection (URL,USER,PASS);
            
            //sql sera la consulta en la base de datos
            
            psSql=conexion.prepareStatement (sql);
            resultado = psSql.executeQuery();
            
            //Se muestra el resultado de la busqueda
            //mostrar es el atributo que se quiere enseñar de la base de datos
             while (resultado.next()){
                System.out.println(resultado.getString(mostrar));
            }
            
        }catch(Exception ex){
            System.out.println("Error en "+ex.getMessage());
        }
        finally{
                try{
                resultado.close();
                psSql.close();
                conexion.close();
                }catch(SQLException e){
                e.printStackTrace();
                }
                }
    }

}
