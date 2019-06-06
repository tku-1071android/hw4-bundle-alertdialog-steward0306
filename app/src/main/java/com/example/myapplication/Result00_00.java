package com.example.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class Result00_00 extends AppCompatActivity {
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result00_00);
        result=(TextView)findViewById(R.id.result);
        showresult();
    }
private void showresult(){
    NumberFormat nf = NumberFormat.getInstance();
    Bundle bundle=getIntent().getExtras();
    int math=bundle.getInt("mathx");
    int chinese=bundle.getInt("cinesex");
    int english = bundle.getInt("englishx");
    int sum=math+chinese+english;
    double average=sum/3;
    String text="math="+math+"\nchinese="+chinese+"\nenglish="+english+"\nsum="+sum+"\naverage="+nf.format(average);
    result.setText(text);
    alert(average);}


public void alert(double average){
        String message=new String();
        String title=new String();
        int pic =0;
                if(average==100){
                    message="100";title="Pass";pic=R.drawable.pass;
                }
        else if(average>=60){
        message="congrats!";title="Pass";pic=R.drawable.pass;
        }
        else{
        message="Sad";title="fail";pic=R.drawable.pass;
    }
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setTitle(title);
        builder.setIcon(pic);
        builder.show();
}
public void back(View view){
        finish();
}







}





