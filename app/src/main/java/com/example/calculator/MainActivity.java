package com.example.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText display;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.display).equals(display.getText().toString())){
                    display.setText("");
                }
            }
        });
    }

    private void updateString(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        display.setText(String.format("%s%s%s",leftStr,strToAdd,rightStr));
    }

    public void zeroBtn(View view){
        updateString("0");
    }
    public void oneBtn(View view){
        updateString("1");

    }
    public void twoBtn(View view){
        updateString("2");

    }
    public void threeBtn(View view){
        updateString("3");

    }
    public void fourBtn(View view){
        updateString("4");

    }
    public void fiveBtn(View view){
        updateString("5");

    }
    public void sixBtn(View view){
        updateString("6");

    }
    public void sevenBtn(View view){
        updateString("7");

    }
    public void eightBtn(View view){
        updateString("8");

    }
    public void nineBtn(View view){
        updateString("9");

    }
    public void clearBtn(View view){
        updateString("");

    }
    public void parenthesesBtn(View view){

    }
    public void exponentialBtn(View view){
        updateString("^");

    }
    public void divideBtn(View view){
        updateString("÷");

    }
    public void multiplyBtn(View view){
        updateString("x");

    }
    public void minusBtn(View view){
        updateString("-");

    }
    public void addBtn(View view){
        updateString("+");

    }
    public void plusMinusBtn(View view){
        updateString("0");

    }
    public void pointBtn(View view){
        updateString(".");

    }
    public void equalsBtn(View view){

    }
    public void BackspaceBtn(View view){

    }
  
}