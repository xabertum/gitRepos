
package Jun_2016;

import java.sql.*;

public class Conexion 
{
    
    //********************* Atributos *************************//
    private java.sql.Connection Conex;  
    
    private java.sql.Statement Sentencia_SQL; 

    private java.sql.ResultSet Conj_Registros; 

    
    //********************** Métodos **************************//
    //----------------------------------------------------------//
    public Conexion() throws ClassNotFoundException, 
            InstantiationException, IllegalAccessException, SQLException
    {
        //Cargar el driver/controlador
        //String controlador = "sun.jdbc.odbc.JdbcOdbcDriver";
        String controlador = "com.mysql.jdbc.Driver";
        Class.forName(controlador).newInstance();
        
        ConectarBD();
    }
    
    //----------------------------------------------------------//
    /*
    ESTE CONSTRUCTOR ES PARA PROBAR, DEBES CREAR EL TUYO PROPIO AL QUE LE DEBES PASAR
    EL NOMBRE DE LA BD, EL USUARIO DE MYSQL Y SU CONTRASEÑA.
    *
    private void Conectar() throws SQLException
    {
        String URL_BD = "jdbc:mysql://localhost:3306/pescavona";
        String Usuario = "Fernando";
        String Clave = "Chubaca2014";
        //Realizamos la conexión a una BD con un usuario y una clave.
        try {
        Conex = java.sql.DriverManager.getConnection(URL_BD,Usuario,Clave);
        Sentencia_SQL = Conex.createStatement();
        System.out.println("Conexion realizada con éxito");
        }
        catch (Exception e)
        {
            System.err.println("Exception: "+e.getMessage());
        }

    }
    */
    
    /**
     * 
     * @throws SQLException 
     */
    private void ConectarBD () throws SQLException {
    
        String URL_BD = "jdbc:mysql://localhost:85/examenprog";
        String Usuario = "xabertum";
        String Clave = "zanfona";
        
        try {
        Conex = java.sql.DriverManager.getConnection(URL_BD,Usuario,Clave);
        Sentencia_SQL = Conex.createStatement();
        System.out.println("Conexion realizada con éxito");
        }
        catch (Exception e)
        {
            System.err.println("Exception: "+e.getMessage());
        }
    
    }
    
    
    //----------------------------------------------------------
    public void Modificar_Dato(String tabla, String DNI, String Nuevo_Nombre) throws SQLException
    {
        String Sentencia = "UPDATE " + tabla + " SET Nombre = '" + Nuevo_Nombre + "' WHERE DNI = '" + DNI + "'";
        
    }
    
    //----------------------------------------------------------
    public void Insertar_Dato(String tabla, String DNI, String Nombre, int Tfno) throws SQLException
    {
        String Sentencia = "INSERT INTO " + tabla + " VALUES ('" + DNI + "'," + "'" + Nombre + "','" + Tfno + "')";
        
    }
    
    
    //----------------------------------------------------------
    public void Borrar_Dato(String tabla, String DNI) throws SQLException
    {
        String Sentencia = "DELETE FROM " + tabla + " WHERE DNI = '" + DNI + "'";
       
    }

}






