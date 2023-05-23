package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText etAdj1;
    private EditText etColor1;
    private EditText etVehicle;
    private EditText etAdj2;
    private EditText Color2;
    private EditText Number;
    private EditText Fruit;
    private EditText Body_Part;
    private EditText Fruit2;
    private EditText Place;






    private Button btnGenerate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign variables to objects
        etAdj1 = findViewById(R.id.et_adjective);
        etColor1 = findViewById(R.id.et_color);
        etVehicle = findViewById(R.id.et_vehicle);
        etAdj2 = findViewById(R.id.et_adjective2);
        etColor2 = findViewById(R.id.et_color2);
        etNumber = findViewById(R.id.et_number);
        etFruit = findViewById(R.id.et_fruit);
        etBody_Part = findViewById(R.id.et_bodyPart);
        etFruit2 = findViewById(R.id.et_fruit2);
        etPlace = findViewById(R.id.et_place);



        btnGenerate = findViewById(R.id.btn_generate);


        Intent intentDisplay = new Intent(MainActivity.this, DisplayActivity.class);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String story = "";
                story += "\nI am very " + etAdj1.getText() + " today";
                story += "\nMy hair is " + etColor1.getText();
                story += "\nyadayadayda";
                story += "\nyadayadayda";
                story += "\nyadayadayda";
                story += "\nyadayadayda";
                story += "\nyadayadayda";
                story += "\nyadayadayda";

                intentDisplay.putExtra("story",story);

                startActivity(intentDisplay);
            }
        });
    }

}