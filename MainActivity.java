package com.example.abc_coffeeshop;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    EditText editText1;
    Button btnorder,btncancel;
    CheckBox cream;
    CheckBox sugar;
    RadioButton decaf,expresso,colombian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){
        editText1 = (EditText)findViewById(R.id.editTextNumber5);
        cream = (CheckBox)findViewById(R.id.checkBox);
        sugar = (CheckBox)findViewById(R.id.checkBox2);
        decaf = (RadioButton)findViewById(R.id.radioButton7);
        expresso = (RadioButton)findViewById(R.id.radioButton8);
        colombian = (RadioButton)findViewById(R.id.radioButton9);
        btncancel = (Button)findViewById(R.id.button);
        btnorder = (Button)findViewById(R.id.button2);


        btncancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Your order has been cancelled.",Toast.LENGTH_LONG).show();
            }
        });

        btnorder.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("Order details: ");
                String temp = editText1.getText().toString();

                result.append("\nOrder number:  "+temp);

                result.append("\nCoffee Type: ");
                if(decaf.isChecked()){
                    result.append("Decaf \n");
                }
                if(expresso.isChecked()){
                    result.append("Expresso \n");
                }
                if(colombian.isChecked()){
                    result.append("Colombian \n");
                }
                result.append("Choice: ");
                if (cream.isChecked()){
                    result.append("Creamy ");
                }
                if (sugar.isChecked()){
                    result.append("Sugar");
                }

                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }

}