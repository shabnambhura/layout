package online.test.androidtask2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {

    EditText Age,Address;
    Button button;
    LinearLayout parentView;
    String userName;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Age= findViewById(R.id.age);
        Address=findViewById(R.id.address);
        button=findViewById(R.id.submit2);
        parentView=findViewById(R.id.parentView);
        Intent intent= getIntent();
        userName= intent.getStringExtra("Name");
        getSupportActionBar().setTitle(userName);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  if(Age.getText().toString().isEmpty()){

                      Snackbar.make(parentView,"Enter Age", Snackbar.LENGTH_SHORT).show();
                  }
                  else if(Address.getText().toString().isEmpty()) {

                      Snackbar.make(parentView,"Please Enter Address",Snackbar.LENGTH_LONG).show();
                  }

                  else{

                      Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                      startActivity(intent);

                  }




            }



        });



    }
}
