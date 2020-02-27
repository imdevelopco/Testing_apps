/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JFrame;
import test.Views.Login;
/**
 *
 * @author Usuario
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    // Cadena para ingresar: abc' or '1' = '1
    public static void main(String[] args) {
        // TODO code application logic here
        Login lg = new Login();
        lg.setVisible(true);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
