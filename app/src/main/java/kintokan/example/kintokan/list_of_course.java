package kintokan.example.kintokan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kintokan.R;

public class list_of_course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
                             //creating buttons
        Button inter_button;
        Button diploma_button;
        Button iiit_button;
        Button iti_button;



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_course);

        //accessing id's to buttons
        inter_button =(Button) findViewById(R.id.inter_button);
        diploma_button=(Button)findViewById(R.id.diploma_button);
        iiit_button=(Button)findViewById(R.id.iiit_button);
        iti_button=(Button)findViewById(R.id.iti_button);


        Button after_inter = (Button) findViewById(R.id.after_inter);

        after_inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inter_intent=new Intent(list_of_course.this,mpc.class);
            }
        });


        //calling inter
        inter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calling_inter();
            }
        });


        //calling diploma
      diploma_button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              calling_diploma();
          }
      });


      //calling iiit
        iiit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calling_iiit();
            }
        });

        //calling iti
        iti_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calling_iti();
            }
        });



    }


    public void calling_inter()
    {
        Intent inter_intent=new Intent(list_of_course.this,inter.class);
        startActivity(inter_intent);
    }



    public void calling_diploma()
    {
        Intent diploma_intent=new Intent(this, diplama.class);
        startActivity(diploma_intent);
    }

    public void calling_iiit()
    {
        Intent iiit_intent=new Intent(this,iiit.class);
        startActivity(iiit_intent);
    }

    public void calling_iti()
    {
        Intent iti_intent =new Intent(this, iti.class);
        startActivity(iti_intent);
    }



}