package kintokan.example.kintokan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;

import com.example.kintokan.R;


public class MainActivity extends AppCompatActivity {


        Button button,contact_us_code;
        EditText name_input,age_input;



    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name_input=(EditText) findViewById(R.id.name_input);
        age_input=(EditText) findViewById(R.id.age_input);
        button=(Button) findViewById(R.id.button1);
        Button about_us=(Button)findViewById(R.id.about_us);
        contact_us_code=(Button)findViewById(R.id.contact_us);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(name_input.getText().toString().isEmpty() || age_input.getText().toString().isEmpty())
                {
                  Toast.makeText(MainActivity.this, "please enter your name and age to proceed further", Toast.LENGTH_SHORT).show();
                }
                else if(age_input.getText().toString().length()>=3)
                {
                    Toast.makeText(MainActivity.this, "please enter your age correctly", Toast.LENGTH_SHORT).show();
                }
                

                else
                {
                    activity();
                }
            }
        });



        about_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,about_us.class);
                startActivity(intent);
            }
        });

        contact_us_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contact_us_activity();
            }
        });












    }



public void activity()
{
    Intent intent =new Intent(this,list_of_course.class);
    startActivity(intent);
}
public void contact_us_activity()
{
    Intent intent_1=new Intent(this,contact_us.class);
    startActivity(intent_1);
}





}