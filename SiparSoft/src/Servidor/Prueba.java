/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

/**
 *
 * @author user
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //Prueba de funcionalidad con la base de datos
        Server conexion = new Server();
        conexion.ejecutar("SELECT * FROM Empleado", "nombre");
    }
    
}
