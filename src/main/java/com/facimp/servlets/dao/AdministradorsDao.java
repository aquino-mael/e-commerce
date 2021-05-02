
package com.facimp.servlets.dao;

import java.util.ArrayList;
import com.facimp.entitys.Administrators;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.activation.DataSource;

public class AdministradorsDao {
    
    private DataSource dataSource;
    
    public AdministradorsDao(DataSource dataSource){
        
        this.dataSource = dataSource;
    
    }
    public ArrayList<Administrators> readAll(){
    try{                
        String SQL = "SELECT * FROM administradors";
        PreparedStatement ps = dataSource.getConnection().PrepareStatement(SQL);
        ResultSet rs =ps.executeQuery();
        
        ArrayList<Administrators> lista = new ArrayList<Administrators>();
        
        while(rs.next()){
            Administrators administradores = new Administrators();
            administradores.setId(rs.getInt("id"));
            administradores.setNome(rs.getString("nome"));
            administradores.setEmail(rs.getString("email"));
            lista.add(administradores);
        }
       
        ps.close();                                         
        return lista;
    }
    catch(SQLException ex){
        System.err.println("Erro geral..."+ex.getMessage());
    
    }
    
    catch(Exception ex){
        System.err.println("Erro geral..."+ex.getMessage());
   
    
    }
    return null;
    }    
    
}
