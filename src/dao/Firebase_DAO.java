package dao;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Precondition;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.core.view.QuerySpec;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import entity.LicenseKey;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Firebase_DAO {

    CollectionReference reference;
    static Firestore db;
//    static Firestore db = FirestoreClient.getFirestore();

    //Thêm
    public static boolean addDataFirebase(String collection, String document, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();
        try {
            DocumentReference docRef = db.collection(collection).document(document);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Add data to Firebase successfully !");
            return true;

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return false;
    }

//    Sửa
    public static boolean editDataFirebase(String collection, String documen, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();
        try {
            DocumentReference docRef = db.collection(collection).document(documen);
            ApiFuture<WriteResult> result = docRef.update(data);
            System.out.println("Successfully updated data to Firebase !");
            return true;

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return false;
    }

//        Xóa
    public static boolean deletaDataFirebase(String collection, String documento) {
        db = FirestoreClient.getFirestore();
        try {
            DocumentReference docRef = db.collection(collection).document(documento);
            ApiFuture<WriteResult> result = docRef.delete(Precondition.NONE);
            System.out.println("Delete data Firebase successfully !");
            return true;

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return false;
    }

//    load dữ liệu 
    public static List<LicenseKey> loadData() {
        List<LicenseKey> listKey = new ArrayList<>();

        try {
            CollectionReference collection = connectDB.ConnectFirebase.db.collection("LicenseKey");
            ApiFuture<QuerySnapshot> querySnap = collection.get();

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                    String id = document.getId();
                    String key = document.getString("Key");
                    String dayStart = document.getString("dayStart");
                    String dayEnd = document.getString("dayEnd");
                    String decription = document.getString("decription");
                LicenseKey licenseKey = new LicenseKey(id, utils.Utils.getLocalDate(dayStart), utils.Utils.getLocalDate(dayEnd), decription, key);
                listKey.add(licenseKey);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        System.out.println("Get data from Firebase successfully !");
        return listKey;
    }
}
