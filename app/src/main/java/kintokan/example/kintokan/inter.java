package kintokan.example.kintokan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kintokan.R;

public class inter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button after_inter = (Button) findViewById(R.id.after_mpc);
        Button after_cec=(Button) findViewById(R.id.after_cec);
        Button after_hec=(Button) findViewById(R.id.after_hec);
        Button after_bipc=(Button) findViewById(R.id.after_bipc);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter);


        after_inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mpc_intent=new Intent(inter.this,mpc.class);
                startActivity(mpc_intent);
            }
        });
        after_cec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mpc_intent=new Intent(inter.this,cec.class);
                startActivity(mpc_intent);
            }
        });
        after_hec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mpc_intent=new Intent(inter.this,hec.class);
                startActivity(mpc_intent);
            }
        });
        after_bipc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mpc_intent=new Intent(inter.this,bipc.class);
                startActivity(mpc_intent);
            }
        });








    }

}