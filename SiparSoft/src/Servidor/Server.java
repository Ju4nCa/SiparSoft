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
    
    private void conexion(String sql) throws ClassNotFoundException, SQLException{
        Class.forName (DRIVER);
        conexion = DriverManager.getConnection (URL,USER,PASS);
            
            //sql sera la consulta en la base de datos
            psSql=conexion.prepareStatement (sql);
            resultado = psSql.executeQuery();
            //Se muestra el resultado de la busquedA
    }
    
    private void cerrarConexion(){
         try{
               
           resultado.close();
           psSql.close();
           conexion.close();
           
         }catch(SQLException e){
               e.printStackTrace();
            } 
    }
    public void mostrar(String tabla){
        try{ 
            conexion("SELECT * FROM "+tabla);
            int columna=1; 
            while (resultado.next())
            {
                while (columna<resultado.getMetaData().getColumnCount()){
                System.out.println(resultado.getString(columna));
                columna++;
                }
            }
        }catch(Exception ex){
            System.out.println("Error en "+ex.getMessage());
       
        }finally{
                cerrarConexion();
                }         
      }
     public void ingresar (String tabla){
         
          try{ 
            conexion("INSERT INTO "+tabla+" VALUES ()");//bUSCAR MANERA DE INTRODUCIR LOS DATOS
            int columna=1; 
            while (resultado.next())
            {
                while (columna<resultado.getMetaData().getColumnCount()){
                System.out.println(resultado.getString(columna));
                columna++;
                }
            }
        }catch(Exception ex){
            System.out.println("Error en "+ex.getMessage());
       
        }finally{
                cerrarConexion();
                }         
          
     }
}
