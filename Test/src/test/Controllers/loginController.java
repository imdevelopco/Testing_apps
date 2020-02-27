/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Controllers;

import java.sql.SQLException;
import test.models.LoginModel;
/**
 *
 * @author Usuario
 */
public class loginController {
    
    private LoginModel LgModel = new LoginModel();
    public boolean checkUser(String user,String pwd) throws SQLException{
        return LgModel.findUser(user, pwd);
    }
}
