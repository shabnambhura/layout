package online.test.androidtask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    ImageView mv;
    EditText name,pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.button);
        mv=findViewById(R.id.imageView);
        name=findViewById(R.id.Name);
        pwd=findViewById(R.id.pwd);
        getSupportActionBar().hide();

       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String userName= name.getText().toString().trim();
               String userPassword= pwd.getText().toString();

               if(userName.isEmpty()){

                   Toast.makeText(MainActivity.this, "Name cannot be empty", Toast.LENGTH_SHORT).show();

               }
               else if(userPassword.isEmpty()){

                  Toast.makeText(MainActivity.this,"Password cannot be empty",Toast.LENGTH_LONG).show();
               }

               else{
                //next Activity

                   Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                   intent.putExtra("Name",userName);
                   startActivity(intent);


               }


           }
       });


    }
}