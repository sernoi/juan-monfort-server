/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juan.monfort.server.serviceprovider;

import juan.monfort.server.service.LoginService;

/**
 *
 * @author ionres
 */
public class LoginServiceProvider implements LoginService{

    @Override
    public void login() {
        
    }

    @Override
    public void exit() {
        System.exit(0);
    }
}
