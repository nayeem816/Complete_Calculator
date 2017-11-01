package com.example.diu.simplecompletecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bC,b11,bpercent,bdiv,b7,b8,b9,bmul,b4,b5,b6;
    Button bsub,b1,b2,b3,badd,b0,b10,bdot,bequal;
    TextView tv;
    Double a,b;
    String operator;
    boolean add,sub,mul,div,percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bC = (Button) findViewById(R.id.bt2);
        b11 = (Button) findViewById(R.id.bt21);
        bpercent = (Button) findViewById(R.id.bt3);
        bdiv =  (Button) findViewById(R.id.bt4);
        b7 =  (Button) findViewById(R.id.bt5);
        b8 =  (Button) findViewById(R.id.bt6);
        b9 =  (Button) findViewById(R.id.bt7);
        bmul =  (Button) findViewById(R.id.bt8);
        b4 =  (Button) findViewById(R.id.bt9);
        b5 =  (Button) findViewById(R.id.bt10);
        b6 =  (Button) findViewById(R.id.bt11);
        bsub =  (Button) findViewById(R.id.bt12);
        b1 =  (Button) findViewById(R.id.bt13);
        b2 =  (Button) findViewById(R.id.bt14);
        b3 =  (Button) findViewById(R.id.bt15);
        badd =  (Button) findViewById(R.id.bt16);
        b0 =  (Button) findViewById(R.id.bt17);
        b10 =  (Button) findViewById(R.id.bt20);
        bdot =  (Button) findViewById(R.id.bt18);
        bequal =  (Button) findViewById(R.id.bt19);

        tv = (TextView) findViewById(R.id.text);


        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(null);

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(Double.parseDouble(tv.getText().toString())*(-1)+"");

            }
        });
        bpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.setText(Double.parseDouble(tv.getText().toString())/100+"");

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(tv.getText().toString());
                div = true;
                tv.setText(null);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                tv.setText(tv.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                tv.setText(tv.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.setText(tv.getText()+"9");
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(tv.getText().toString());
                mul = true;
                tv.setText(null);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.setText(tv.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.setText(tv.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.setText(tv.getText()+"6");
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(tv.getText().toString());
                sub = true;
                tv.setText(null);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.setText(tv.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.setText(tv.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.setText(tv.getText()+"3");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(tv.getText().toString());
                add = true;
                tv.setText(null);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv.setText(tv.getText()+"0");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stb = new StringBuilder(tv.getText().toString());
                stb.deleteCharAt(tv.getText().toString().length()-1);
                tv.setText(stb.toString());
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(tv.getText()+".");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = Double.parseDouble(tv.getText().toString());
                if(add == true){
                    tv.setText(String.valueOf(a+b));
                    add = false;
                }
                if(sub == true){
                    tv.setText(String.valueOf(a-b));
                    sub = false;
                }
                if(mul == true){
                    tv.setText(String.valueOf(a*b));
                    mul = false;
                }
                if(div == true){
                    tv.setText(String.valueOf(a/b));
                    div = false;
                }


            }
        });


    }


}

