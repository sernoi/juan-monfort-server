/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juan.monfort.server.database;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author ionres
 */
public class FirebaseConfig {
    public void initFirebase() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("credentials.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
        .setDatabaseUrl("https://juanmonfort-c9f10-default-rtdb.firebaseio.com")
        .build();

        FirebaseApp.initializeApp(options);

        //System.out.println(FirebaseAuth.getInstance());
    }
}
