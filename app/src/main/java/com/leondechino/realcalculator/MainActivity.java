package com.leondechino.realcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String input = "";

    private EditText txtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInput = (EditText) findViewById(R.id.txtInput);
    }
    private void StrAdd(String chain) {
        input = input + chain;
        txtInput.setText(txtInput.getText()+chain);
    }
    public void ButtonAC(View view) {
        txtInput.setText("");
        input = "";
    }
    public void ButtonDel(View view) {
        if (input == ""){
            return;
        }else if (input.length() == 0){
            return;
        } else {
            input = input.substring(0, input.length() - 1);
            txtInput.setText(txtInput.getText().toString().substring(0, txtInput.getText().toString().length() -1));
            return;
        }
    }

    // Agregados a la cadena
    public void Button0(View view) {
        String chain = "0";
        StrAdd(chain);
    }
    public void Button2(View view) {
        String chain = "2";
        StrAdd(chain);
    }
    public void Button3(View view) {
        String chain = "3";
        StrAdd(chain);
    }
    public void Button4(View view) {
        String chain = "4";
        StrAdd(chain);
    }
    public void Button5(View view) {
        String chain = "5";
        StrAdd(chain);
    }
    public void Button6(View view) {
        String chain = "6";
        StrAdd(chain);
    }
    public void Button7(View view) {
        String chain = "7";
        StrAdd(chain);
    }
    public void Button8(View view) {
        String chain = "8";
        StrAdd(chain);
    }
    public void Button9(View view) {
        String chain = "9";
        StrAdd(chain);
    }
    public void ButtonDot(View view) {
        String chain = ".";
        StrAdd(chain);
    }
    public void ButtonLeft(View view) {
        String chain = "(";
        StrAdd(chain);
    }
    public void ButtonRight(View view) {
        String chain = ")";
        StrAdd(chain);
    }

    // TODO considerar el hacer una calculadora mas simple como las del gobierno :)

    public void ButtonDiv(View view) {
        String chain = "/";
        StrAdd(chain);
    }
    public void ButtonMul(View view) {
        String chain = "*";
        StrAdd(chain);
    }
    public void ButtonSub(View view) {
        String chain = "-";
        StrAdd(chain);
    }
    public void ButtonAdd(View view) {
        String chain = "+";
        StrAdd(chain);
    }

    // TODO terminar e implementar la funcion de la calculadora
    public void ButtonCalculate(View view) {
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
    }

}