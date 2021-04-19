/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heri
 */
import javax.swing.JOptionPane;
public class login {
   static  String username;
   static  String password;
   static String designation;

    public login() {
        login.username = JOptionPane.showInputDialog("username", username);
        login.password = JOptionPane.showInputDialog("password", password);
        login.designation = JOptionPane.showInputDialog("designation", designation);
    }
    
    public void validate(String username, String password){
        if ("david".equals(login.username) && "12345".equals(login.password)){
                JOptionPane.showMessageDialog(null,"login succressful");
        } else {
            JOptionPane.showMessageDialog(null,"Invalid Username or Password!");
        }
    }
    
public static void main(String[] args){
    login user = new login();
    user.validate(username, password);
}
}

