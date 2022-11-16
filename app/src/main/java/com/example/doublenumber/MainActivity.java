package com.example.doublenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView TextNo;
        Button button;


            TextNo=(TextView) findViewById(R.id.TextView);
            button=(Button) findViewById(R.id.Btn);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String Originalval = TextNo.getText().toString();
                    int Oldval= Integer.parseInt(Originalval);
                    int Newval= doubleMe(Oldval);
                    String NewValText= Integer.toString(Newval);
                    TextNo.setText(NewValText);

                }
            });
        }
        public int doubleMe(int realvalue){
            return realvalue*2;
    }
}