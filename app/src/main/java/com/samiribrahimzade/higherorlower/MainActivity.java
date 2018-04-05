package com.samiribrahimzade.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.id.button2;

public class MainActivity extends AppCompatActivity {

    String ss;
    public void qqq(View view){

        view.setVisibility(View.GONE);

        EditText editText = (EditText)findViewById(R.id.editText);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        String s;



        s = editText.getText().toString();

        ss = s;

        System.out.println(ss);

        editText.setVisibility(View.GONE);

        editText2.setVisibility(View.VISIBLE);

        Button buttonn = (Button)findViewById(R.id.buttonn);

        buttonn.setVisibility(View.VISIBLE);




    }
    int estimate = (int)(Math.random()*99) + 1 ;
    int ournumber;


    public void qqqq(View view){


        EditText editText2 = (EditText)findViewById(R.id.editText2);


        ournumber = Integer.parseInt(editText2.getText().toString());

        System.out.println(estimate);

        if(estimate > ournumber) Toast.makeText(MainActivity.this, "Higher", Toast.LENGTH_SHORT).show();
        if(estimate < ournumber) Toast.makeText(MainActivity.this, "Lower", Toast.LENGTH_SHORT).show();
        if(estimate == ournumber) Toast.makeText(MainActivity.this, "You Won! \n Congratulations " + ss + "!", Toast.LENGTH_SHORT).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
