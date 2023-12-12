package connectDB;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConnectFirebase {

    public static Firestore db;

    public static void ConnectarFirebase(){
        try {
            FileInputStream sa = new FileInputStream("turorial.json");
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(sa))
                    .build();
            FirebaseApp.initializeApp(options);
            db = FirestoreClient.getFirestore();
            System.out.println("Connected to Firebase successfully !");
        } catch (IOException e) {
            System.out.println("Firebase connection failed !");
        }
    }
}
