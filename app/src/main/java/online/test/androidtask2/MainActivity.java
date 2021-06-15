package online.test.androidtask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button submit;
    ImageView mv;
    EditText name;
    EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.button);
        mv=findViewById(R.id.imageView);
        name=findViewById(R.id.Name);
        pwd=findViewById(R.id.pwd);

       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
           }
       });


    }
}