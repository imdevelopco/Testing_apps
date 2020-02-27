/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.models;

import java.sql.SQLException;
import test.models.Postgres;

/**
 *
 * @author Carlos Andres Cordoba Ramos
 */
public class LoginModel {
    private Postgres pg = new Postgres();
    
    public boolean findUser(String user, String pwd) throws SQLException{
        if(!(pg.RunQuery("Select login from usuarios where login= '"+user+"' and pwd='" +pwd+"';").equals(""))){
            return true;
        }
        return false;
    }
}
