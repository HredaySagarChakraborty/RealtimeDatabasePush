package comp.example.hreday.realtimedatabasepush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        database= FirebaseDatabase.getInstance().getReference().child("Ma");
        HashMap<String, String>hashMap=new HashMap<>();
        hashMap.put("name","Hreday");
        hashMap.put("name2","Sagar");



        database.push().setValue(hashMap);








    }
}
