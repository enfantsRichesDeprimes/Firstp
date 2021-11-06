package com.example.firstp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    EditText mathgrades;
    EditText mathpoints;
    EditText englishgrades;
    EditText englishpoints;
    EditText csgrades;
    EditText cspoints;
    EditText chinesegrades;
    EditText chinesepoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn=findViewById(R.id.Sure);

        mathgrades=(EditText) findViewById(R.id.mathgrades);
        mathpoints=(EditText) findViewById(R.id.mathcredit);
        englishgrades=(EditText) findViewById(R.id.englishgrades);
        englishpoints=(EditText) findViewById(R.id.englishcredit);
        csgrades=(EditText) findViewById(R.id.csgrades);
        cspoints=(EditText) findViewById(R.id.cscredit);
        chinesegrades=(EditText) findViewById(R.id.chinesegrades);
        chinesepoints=(EditText) findViewById(R.id.chinesecredit);


        mathgrades.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        mathpoints.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        englishgrades.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        englishpoints.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        csgrades.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        cspoints.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        chinesegrades.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        chinesepoints.setKeyListener(DigitsKeyListener.getInstance("0123456789."));


        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

        Intent intent=new Intent(MainActivity.this,NextActivity.class);

        intent.putExtra("mathgrades",mathgrades.getText().toString());
        intent.putExtra("mathpoints",mathpoints.getText().toString());
        intent.putExtra("englishgrades",englishpoints.getText().toString());
        intent.putExtra("englishpoints",englishpoints.getText().toString());
        intent.putExtra("csgrades",csgrades.getText().toString());
        intent.putExtra("cspoints",cspoints.getText().toString());
        intent.putExtra("chinesegrades",chinesegrades.getText().toString());
        intent.putExtra("chinesepoints",chinesepoints.getText().toString());



                if("".equals(mathgrades.getText().toString())||(mathgrades.getText().toString()==null)){
                    Toast.makeText(MainActivity.this,"输入不能有空",Toast.LENGTH_LONG).show();
                }
                if("".equals(mathpoints.getText().toString())||(mathpoints.getText().toString()==null)){
                    Toast.makeText(MainActivity.this,"输入不能有空",Toast.LENGTH_LONG).show();
                }
                if("".equals(englishgrades.getText().toString())||(englishgrades.getText().toString()==null)){
                    Toast.makeText(MainActivity.this,"输入不能有空",Toast.LENGTH_LONG).show();

                }
                if("".equals(englishpoints.getText().toString())||(englishpoints.getText().toString()==null)){
                    Toast.makeText(MainActivity.this,"输入不能有空",Toast.LENGTH_LONG).show();

                }
                if("".equals(csgrades.getText().toString())||(csgrades.getText().toString()==null)){
                    Toast.makeText(MainActivity.this,"输入不能有空",Toast.LENGTH_LONG).show();

                }
                if("".equals(cspoints.getText().toString())||(cspoints.getText().toString()==null)){
                    Toast.makeText(MainActivity.this,"输入不能有空",Toast.LENGTH_LONG).show();

                }
                if("".equals(chinesegrades.getText().toString())||(chinesegrades.getText().toString()==null)){
                    Toast.makeText(MainActivity.this,"输入不能有空",Toast.LENGTH_LONG).show();

                }
                if("".equals(chinesepoints.getText().toString())||(chinesepoints.getText().toString()==null)){
                    Toast.makeText(MainActivity.this,"输入不能有空",Toast.LENGTH_LONG).show();

                }

                if(Integer.parseInt(mathgrades.getText().toString())>100){
                    Toast.makeText(MainActivity.this,"输入数字超过100，请重新输入",Toast.LENGTH_SHORT).show();

                }
                if(Integer.parseInt(mathpoints.getText().toString())>100){
                    Toast.makeText(MainActivity.this,"输入数字超过100，请重新输入",Toast.LENGTH_LONG).show();

                }
                if(Integer.parseInt(englishgrades.getText().toString())>100){
                    Toast.makeText(MainActivity.this,"输入数字超过100，请重新输入",Toast.LENGTH_LONG).show();

                }
                if(Integer.parseInt(englishpoints.getText().toString())>100){
                    Toast.makeText(MainActivity.this,"输入数字超过100，请重新输入",Toast.LENGTH_LONG).show();

                }
                if(Integer.parseInt(englishpoints.getText().toString())>100){
                    Toast.makeText(MainActivity.this,"输入数字超过100，请重新输入",Toast.LENGTH_LONG).show();

                }
                if(Integer.parseInt(csgrades.getText().toString())>100){
                    Toast.makeText(MainActivity.this,"输入数字超过100，请重新输入",Toast.LENGTH_LONG).show();

                }
                if(Integer.parseInt(cspoints.getText().toString())>100){
                    Toast.makeText(MainActivity.this,"输入数字超过100，请重新输入",Toast.LENGTH_LONG).show();

                }
                if(Integer.parseInt(chinesegrades.getText().toString())>100){
                    Toast.makeText(MainActivity.this,"输入数字超过100，请重新输入",Toast.LENGTH_LONG).show();

                }
                if(Integer.parseInt(chinesepoints.getText().toString())>100){
                    Toast.makeText(MainActivity.this,"输入数字超过100，请重新输入",Toast.LENGTH_LONG).show();
                }

        startActivity(intent);
    }
});
    };
}
