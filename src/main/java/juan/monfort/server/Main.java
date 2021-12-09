/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juan.monfort.server;

import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import juan.monfort.server.controller.LoginController;
import juan.monfort.server.database.FirebaseConfig;
import juan.monfort.server.view.LoginFrame;

/**
 *
 * @author ionres
 */
public class Main {

    public static void main(String[] args) throws IOException {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        new LoginController(loginFrame);

        new FirebaseConfig().initFirebase();

        System.out.println(FirebaseAuth.getInstance());
    }
}
