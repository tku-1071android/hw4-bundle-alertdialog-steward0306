package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText math,chinese,english;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    private void findViews(){
        math=(EditText)findViewById(R.id.math);
        chinese=(EditText)findViewById(R.id.chinese);
        english=(EditText)findViewById(R.id.english);

}
    private boolean isvalid(EditText editText){
        String pattern = "1[0]{2}|[0-9]{1,2}";
        String text = editText.getText().toString();
        if(!text.matches(pattern)){
         editText.setError("0~100");
         return false;
        }
        else return true;


}
    public void submit(View view) {
        boolean isvalid = isvalid(math) & isvalid(chinese) & isvalid(english);
        if (!isvalid) return;

        int mathx = Integer.parseInt(math.getText().toString());
        int chinesex = Integer.parseInt(chinese.getText().toString());
        int englishx = Integer.parseInt(english.getText().toString());
        Intent intent = new Intent(this, Result00_00.class);
        Bundle bundle = new Bundle();
        bundle.putInt("mathx", mathx);
        bundle.putInt("chinesex", chinesex);
        bundle.putInt("englishx",englishx);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}
