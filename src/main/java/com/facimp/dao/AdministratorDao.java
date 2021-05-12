/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facimp.dao;

import com.facimp.entitys.Administrators;
import java.util.List;

/**
 *
 * @author interisk
 */
public interface AdministratorDao {
    public void insertAdministrator(Administrators administrator);
    
    public Administrators getAdministrator(int id);
    
    public void deleteAdministrator(int id);
    
    public void updateAdministrator(Administrators administrator);
    
    public Administrators authenticate(String email, String password);
    
    public List<Administrators> allAdministrator();
}
