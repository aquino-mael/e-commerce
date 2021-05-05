
package com.facimp.servlets.dao;

import com.facimp.entitys.Administrators;
import java.sql.*;
import java.util.ArrayList;
import javax.sql.DataSource;

public class AdministratorDao {
    
    private final DataSource dataSource;
    
    public AdministratorDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public ArrayList<Administrators> selectAll(){              
        String SQL = "SELECT * FROM administradors";
        ArrayList<Administrators> administratorList;
        
        try (PreparedStatement preparedStatement = this.dataSource.getConnection().prepareStatement(SQL)) {
            
            ResultSet result = preparedStatement.executeQuery();
            administratorList = new ArrayList();
            
            while(result.next()) {
                Administrators administrator = new Administrators();
                
                administrator.setId(result.getInt("id"));
                administrator.setName(result.getString("nome"));
                administrator.setEmail(result.getString("email"));
                administrator.setPassword(result.getString("password"));
                
                administratorList.add(administrator);
            }
            
            return administratorList;
        } catch(SQLException ex){
            System.err.println("Erro ao recuperar: " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("Erro geral..."+ex.getMessage());
        }
        
        return null;
    }
}
