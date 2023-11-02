/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexionMYSQL {
    public String db = "empleados";
    public String url = "jdbc:mysql://localhost:1881/"+db;
    public String  user = "root";
    public String pass = "";

    public conexionMYSQL() {
    }

    public Connection Conectar(){
        Connection link = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        }
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
    }
}
