package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albar
 */
public class Conexion {
    public static Connection con = null;
    public static Connection getConnection(){
        String url = "jdbc:postgresql://localhost:5432/AMS";
        String usuario = "albar";
        String contraseña = "albar";
        try{
            Class.forName("org.postgresql.Driver");
            
        }catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"No se encontraron los Drivers" + e.getMessage(),
                    "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        try{
            con = DriverManager.getConnection(url, usuario, contraseña);
            
        }catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"ERROR" + e.getMessage(),
                    "error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    /*
    public void reportes(){
        try{
            String pt = "/Reportes/report.jrxml";
            JasperReport
    }
    */

    public static boolean insertar(String id, String marca, String modelo, String tipo, int precio, int cantidad, int contador){
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement("INSERT INTO public.productos VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, id);
            ps.setString(2, marca);
            ps.setString(3, modelo);
            ps.setString(4, tipo);
            ps.setInt(5, precio);
            ps.setInt(6, cantidad);
            ps.setInt(7, contador);
            ps.execute();
        }catch(SQLException e){
            return false;
        }finally{
            return true;
        }
    }
    
    public static ResultSet consulta1(String dato, String filtro){
        PreparedStatement ps = null;
        ResultSet rs=null;
        try {
            ps = con.prepareStatement("SELECT * FROM public.productos WHERE "+filtro+" like '%"+dato+"%'");
            //ps.setString(1, dato);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }finally{
            return rs;
        }
    }
        public static ResultSet consultaG(){
        PreparedStatement ps = null;
        ResultSet rs=null;
        try {
            ps = con.prepareStatement("SELECT * FROM public.productos ");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            return null;
        }finally{
            return rs;
        }
    }
    
    public static ResultSet Consulta(String consulta){
       
        Statement declara;
        try {
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"ERROR" + e.getMessage(),
                    "error de conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public static Boolean Ejecutar(String consulta){
        boolean b = true;
        
        Statement declara;
        try {
            declara=con.createStatement();
            declara.executeQuery(consulta);
            return b;
        } catch (SQLException e) {
            System.out.print("Error: " + e);
            if (e.getMessage().equals("La instrucción no devolvió un conjunto de resultados.")) {
                JOptionPane.showMessageDialog(null,
                    "Se actualizo el base de datos correctamente");

            }else if (!e.getMessage().equals("La consulta no retornó ningún resultado.")){
            JOptionPane.showMessageDialog(null,"El Producto siendo usado en pedidos" ,
                    "ERROR",JOptionPane.ERROR_MESSAGE);
                    //System.out.println(e);
            }
        }
        return b;
    }
    
}
