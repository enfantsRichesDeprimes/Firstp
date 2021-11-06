package com.example.firstp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {
    Button back;
    Button report;

    TextView mathgrades;
    TextView englishgrades;
    TextView csgrades;
    TextView chinesegrades;
    TextView mathCredit;
    TextView englishCredit;
    TextView csCredit;
    TextView chineseCredit;
    TextView mathRank;
    TextView englishRank;
    TextView csRank;
    TextView chineseRank;

    TextView totalpoints;
    float totalpoints1;
    TextView weightedAverage;
    float weightedAverage1;
    TextView totalCredit;
    float totalCredit1;
    TextView stability;
    float stability1;
    TextView comprehensive;
    float average;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        String mathCredit1;
        String englishCredit1;
        String csCredit1;
        String chineseCredit1;
        String mathRank1;
        String englishRank1;
        String csRank1;
        String chinsesRank1;
        String stability2;
        String average1;


        back=findViewById(R.id.back);
        report=findViewById(R.id.report);


        mathgrades=(TextView)findViewById(R.id.mathgrades);
        englishgrades=(TextView)findViewById(R.id.englishgrades);
        csgrades=(TextView)findViewById(R.id.csgrades);
        chinesegrades=(TextView)findViewById(R.id.chinesegrades);
        mathCredit=(TextView)findViewById(R.id.mathCredit);
        englishCredit=(TextView)findViewById(R.id.englishCredit);
        csCredit=(TextView)findViewById(R.id.csCredit);
        chineseCredit=(TextView)findViewById(R.id.chineseCredit);
        mathRank=(TextView) findViewById(R.id.mathRank);
        englishRank=(TextView)findViewById(R.id.englishRank);
        csRank=(TextView)findViewById(R.id.csRank);
        chineseRank=(TextView)findViewById(R.id.chineseRank);
        totalpoints=(TextView)findViewById(R.id.totalpoints);
        weightedAverage=(TextView)findViewById(R.id.weightedAverage);
        totalCredit=(TextView)findViewById(R.id.totalCredit);
        stability=(TextView)findViewById(R.id.stability);
        comprehensive=(TextView)findViewById(R.id.comprehensive);

        Intent intent=getIntent();


        String mathgrades=intent.getStringExtra("mathgrades");
        String englishgrades=intent.getStringExtra("englishgrades");
        String csgrades=intent.getStringExtra("csgrades");
        String chinesegrades=intent.getStringExtra("chinesegrades");
        String mathpoints=intent.getStringExtra("mathpoints");
        String englispoints=intent.getStringExtra("englishpoints");
        String cspoints=intent.getStringExtra("cspoints");
        String chinesepoints=intent.getStringExtra("chinesepoints");

        final float num1=Float.parseFloat(mathpoints);
        final float num2=Float.parseFloat(englispoints);
        final float num3=Float.parseFloat(cspoints);
        final float num4=Float.parseFloat(chinesepoints);

        final float num5=Float.parseFloat(mathgrades);
        final float num6=Float.parseFloat(englishgrades);
        final float num7=Float.parseFloat(csgrades);
        final float num8=Float.parseFloat(chinesegrades);

        totalpoints1=num1+num2+num3+num4;
        String totalpoints=String.valueOf(totalpoints1);
        weightedAverage1=(num1*num5+num2*num6+num3*num7+num4*num8)/totalpoints1;
        java.text.DecimalFormat myformat=new java.text.DecimalFormat("0.00");
        String weightedAverage=myformat.format(weightedAverage1);
        if(num5>=90&&num5<=100){
              mathCredit1="4.0";
              mathRank1="A";
        }
        else if(num5>=86){
              mathCredit1="3.7";
              mathRank1="A-";
        }
        else if(num5>=83){
             mathCredit1="3.3";
             mathRank1="B+";
        }
        else if(num5>=80){
             mathCredit1="3.0";
             mathRank1="B";
        }
        else if(num5>=76){
             mathCredit1="2.7";
             mathRank1="B-";
        }
        else if(num5>=73){
            mathCredit1="2.3";
            mathRank1="C+";
        }
        else if(num5>=70){
            mathCredit1="2.0";
            mathRank1="C";
        }
        else if(num5>=66){
             mathCredit1="1.7";
             mathRank1="C-";
        }
        else if(num5>=63){
             mathCredit1="1.3";
             mathRank1="D+";
        }
        else if(num5>=60){
             mathCredit1="1.0";
             mathRank1="D";
        }
        else {
            mathCredit1="0";
            mathRank1="F";
        }

        if(num6>=90&&num6<=100){
            englishCredit1="4.0";
            englishRank1="A";
            finish();
        }
        else if(num6>=86){
            englishCredit1="3.7";
            englishRank1="A-";
            finish();
        }
        else if(num6>=83){
            englishCredit1="3.3";
            englishRank1="B+";
            finish();
        }
        else if(num6>=80){
            englishCredit1="3.0";
            englishRank1="B";
        }
        else if(num6>=76){
            englishCredit1="2.7";
            englishRank1="B-";
        }
        else if(num6>=73){
            englishCredit1="2.3";
            englishRank1="C+";
        }
        else if(num6>=70){
            englishCredit1="2.0";
            englishRank1="C";
        }
        else if(num6>=66){
            englishCredit1="1.7";
            englishRank1="C-";
        }
        else if(num6>=63){
            englishCredit1="1.3";
            englishRank1="D+";
        }
        else if(num6>=60){
            englishCredit1="1.0";
            englishRank1="D";
        }
        else {
            englishCredit1="0";
            englishRank1="F";
        }

        if(num7>=90&&num7<=100){
            csCredit1="4.0";
            csRank1="A";
        }
        else if(num7>=86){
            csCredit1="3.7";
            csRank1="A-";
        }
        else if(num7>=83){
            csCredit1="3.3";
            csRank1="B+";
        }
        else if(num7>=80){
            csCredit1="3.0";
            csRank1="B";
        }
        else if(num7>=76){
            csCredit1="2.7";
            csRank1="B-";
        }
        else if(num7>=73){
            csCredit1="2.3";
            csRank1="C+";
        }
        else if(num7>=70){
            csCredit1="2.0";
            csRank1="C";
        }
        else if(num7>=66){
            csCredit1="1.7";
            csRank1="C-";
        }
        else if(num7>=63){
            csCredit1="1.3";
            csRank1="D+";
        }
        else if(num7>=60){
            csCredit1="1.0";
            csRank1="D";
        }
        else {
            csCredit1="0";
            csRank1="F";
        }

        if(num8>=90&&num8<=100){
            chineseCredit1="4.0";
            chinsesRank1="A";
        }
        else if(num8>=86){
            chineseCredit1="3.7";
            chinsesRank1="A-";
        }
        else if(num8>=83){
            chineseCredit1="3.3";
            chinsesRank1="B+";
        }
        else if(num8>=80){
           chineseCredit1="3.0";
            chinsesRank1="B";
        }
        else if(num8>=76){
            chineseCredit1="2.7";
            chinsesRank1="B-";
        }
        else if(num8>=73){
            chineseCredit1="2.3";
            chinsesRank1="C+";
        }
        else if(num8>=70){
            chineseCredit1="2.0";
            chinsesRank1="C";
        }
        else if(num8>=66){
            chineseCredit1="1.7";
            chinsesRank1="C-";
        }
        else if(num8>=63){
            chineseCredit1="1.3";
            chinsesRank1="D+";
        }
        else if(num8>=60){
            chineseCredit1="1.0";
            chinsesRank1="D";
        }
        else {
            chineseCredit1="0";
            chinsesRank1="F";
        }

        float num9=Float.parseFloat(mathCredit1);
        float num10=Float.parseFloat(englishCredit1);
        float num11=Float.parseFloat(csCredit1);
        float num12=Float.parseFloat(chineseCredit1);

        average=(num5+num6+num7+num8)/4;
        stability1=((num5-average)*(num5-average)+(num6-average)*(num6-average)+(num7-average)*(num7-average)+(num8-average)*(num8-average))/4;
        if(stability1>=10){
            stability2="差";
        }
        else if(stability1>=4){
            stability2="较差";
        }
        else if(stability1>=1){
            stability2="良好";
        }
        else {
            stability2="优秀";
        }

        if(average>=90&&average<=100){
            average1="A";
        }
        else if(average>=86){
            average1="A-";
        }
        else if(average>=83){
            average1="B+";
        }
        else if(average>=80){
            average1="B";
        }
        else if(average>=76){
            average1="B-";
        }
        else if(average>=73){
            average1="C+";
        }
        else if(average>=70){
            average1="C";
        }
        else if(average>=66){
            average1="C-";
        }
        else if(average>=63){
            average1="D+";
        }
        else if(average>=60){
            average1="D";
        }
        else {
            average1="F";
        }


        totalCredit1=(num9*num1+num10*num2+num11*num3+num12*num4)/totalpoints1;
        String totalCredit=myformat.format(totalCredit1);

        this.mathgrades.append(mathgrades);
        this.englishgrades.append(englishgrades);
        this.csgrades.append(csgrades);
        this.chinesegrades.append(chinesegrades);
        this.mathRank.append(mathRank1);
        this.englishRank.append(englishRank1);
        this.csRank.append(csRank1);
        this.chineseRank.append(chinsesRank1);
        this.mathCredit.append(mathCredit1);
        this.englishCredit.append(englishCredit1);
        this.csCredit.append(csCredit1);
        this.chineseCredit.append(chineseCredit1);
        this.totalpoints.append(totalpoints);
        this.weightedAverage.append(weightedAverage);
        this.totalCredit.append(totalCredit);
        this.stability.append(stability2);
        this.comprehensive.append(average1);


        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent=new Intent(NextActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        report.setOnClickListener(new View.OnClickListener(){
            public  void  onClick(View v){
                Intent report=new Intent(NextActivity.this,reportActivity.class);
                report.putExtra("mathGrades",num5+"");
                report.putExtra("englishGrades",num6+"");
                report.putExtra("csGrades",num7+"");
                report.putExtra("chineseGrades",num8+"");
                report.putExtra("weightedAverage",average+"");
                report.putExtra("stability",stability1+"");

                report.putExtra("mathPoints",num1+"");
                report.putExtra("englishPoints",num2+"");
                report.putExtra("csPoints",num3+"");
                report.putExtra("chinesePoints",num4+"");


                startActivity(report);
                finish();
            }
        }

        );
    };}


