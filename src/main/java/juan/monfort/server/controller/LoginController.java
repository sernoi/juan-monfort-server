/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juan.monfort.server.controller;

import juan.monfort.server.service.LoginService;
import juan.monfort.server.serviceprovider.LoginServiceProvider;
import juan.monfort.server.view.LoginFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ionres
 */
public class LoginController {
    LoginFrame loginFrame;
    LoginService loginService = new LoginServiceProvider();
    
    public LoginController(LoginFrame loginFrame) {
        this.loginFrame = loginFrame;
        
        this.loginFrame.buttonListeners(new ButtonEvents());
    }
    
    class ButtonEvents implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == loginFrame.loginBtn) {
                loginService.login();
            } else if(e.getSource() == loginFrame.exitBtn) {
                loginService.exit();
            }
        }
    }
}
