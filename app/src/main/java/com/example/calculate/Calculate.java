package com.example.calculate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Calculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculate);

        //Inflate
        EditText n1 = findViewById(R.id.calculate_et_firstNumber);
        EditText n2 = findViewById(R.id.calculate_et_secondNumber);
        TextView result = findViewById(R.id.calculate_et_result);
        Button btn = findViewById(R.id.calculate_btn_sum);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             int s =    Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());
             result.setText("Result: "+s);
            }
        });

    }
}