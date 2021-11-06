package com.example.firstp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class reportActivity extends AppCompatActivity {
    Button back1;
    TextView mathRank;
    TextView englishRank;
    TextView csRank;
    TextView chineseRank;
    TextView rank;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        Intent mathPoints=getIntent();
        Intent englishPoints=getIntent();
        Intent csPoints=getIntent();
        Intent chinesePoints=getIntent();

        String mathPoints1=mathPoints.getStringExtra("mathPoints");
        String englishPoints1=englishPoints.getStringExtra("englishPoints");
        String csPoints1=csPoints.getStringExtra("csPoints");
        String chinesePoints1=chinesePoints.getStringExtra("chinesePoints");

        final float mathnum=Float.parseFloat(mathPoints1);
        final float englishnum=Float.parseFloat(englishPoints1);
        final float csnum=Float.parseFloat(csPoints1);
        final float chinesenum=Float.parseFloat(chinesePoints1);

        mathRank=findViewById(R.id.mathRank);
        Intent mathRank=getIntent();
        String mathRank1=mathRank.getStringExtra("mathGrades");
        final float num1=Float.parseFloat(mathRank1);
        if(num1<=100&&num1>=90){
            mathRank1="该科成绩优异，继续保持";
        }
        else if(num1>70){
            mathRank1="该科成绩良好，争取努力取得更高成绩";
        }
        else if(num1>60){
            mathRank1="该科处在挂科边缘，请多投入一些精力";
        }
        else {
            mathRank1="该科已经挂科，希望引起重视";
        }
        this.mathRank.append(mathRank1);


        englishRank=findViewById(R.id.englishRank);
        Intent englishRank=getIntent();
        String englishRank1=englishRank.getStringExtra("englishGrades");
        final float num2=Float.parseFloat(englishRank1);
        if(num2<=100&&num2>=90){
            englishRank1="该科成绩良好，争取努力取得更高成绩";
        }
        else if(num2>70){
            englishRank1="该科成绩良好，争取努力取得更高成绩";
        }
        else if(num2>60){
            englishRank1="该科处在挂科边缘，请多投入一些精力";
        }
        else {
            englishRank1="该科已经挂科，希望引起重视";
        }
        this.englishRank.append(englishRank1);

        csRank=findViewById(R.id.csRank);
        Intent csRank=getIntent();
        String csRank1=csRank.getStringExtra("csGrades");
        final  float num3=Float.parseFloat(csRank1);
        if(num3<=100&&num3>=90){
            csRank1="该科成绩良好，争取努力取得更高成绩";
        }
        else if(num3>70){
            csRank1="该科成绩良好，争取努力取得更高成绩";
        }
        else if(num3>60){
            csRank1="该科处在挂科边缘，请多投入一些精力";
        }
        else {
            csRank1="该科已经挂科，希望引起重视";
        }
        this.csRank.append(csRank1);

        chineseRank=findViewById(R.id.chineseRank);
        Intent chineseRank=getIntent();
        String chineseRank1=chineseRank.getStringExtra("chineseGrades");
        final  float num4=Float.parseFloat(chineseRank1);
        if(num4<=100&&num4>=90){
            chineseRank1="该科成绩良好，争取努力取得更高成绩";
        }
        else if(num4>70){
            chineseRank1="该科成绩良好，争取努力取得更高成绩";
        }
        else if(num4>60){
            chineseRank1="该科处在挂科边缘，请多投入一些精力";
        }
        else {
            chineseRank1="该科已经挂科，希望引起重视";
        }
        this.chineseRank.append(chineseRank1);

        rank=findViewById(R.id.rank);
        Intent rank1=getIntent();
        String rank1_=rank1.getStringExtra("weightedAverage");
        final float num5=Float.parseFloat(rank1_);
        Intent rank2=getIntent();
        String rank2_=rank2.getStringExtra("stability");
        final float num6=Float.parseFloat(rank2_);
        if(num5<=100&&num5>=80){
            rank1_="总体成绩优秀。";
        }
        else if(num5>60){
            rank1_="总体成绩良好，可以更加努力。";
        }
        else {
            rank1_="总体成绩较差，需更加努力。";
        }
        this.rank.append(rank1_);

        if(num6<1&&num6>=0){
            rank2_="各科成绩稳定。";
        }
        else if(num6<4){
            rank2_="各科成绩稍有不平衡，取长补短。";
        }
        else if(num6<10){
            rank2_="存在偏科现象，多花点时间在薄弱科目上。";
        }
        else {
            rank2_="存在严重偏科现象，望多加重视。";
        }
        this.rank.append(rank2_);

        back1=findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent=new Intent(reportActivity.this,NextActivity.class);

                intent.putExtra("mathgrades",num1+"");
                intent.putExtra("englishgrades",num2+"");
                intent.putExtra("csgrades",num3+"");
                intent.putExtra("chinesegrades",num4+"");

                intent.putExtra("mathpoints",mathnum+"");
                intent.putExtra("englishpoints",englishnum+"");
                intent.putExtra("cspoints",csnum+"");
                intent.putExtra("chinesepoints",chinesenum+"");
                startActivity(intent);
            }
        });
}}
