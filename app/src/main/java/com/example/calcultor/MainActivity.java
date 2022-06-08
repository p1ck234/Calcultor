package com.example.calcultor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonAdd, buttonSubtract,buttonDivided,buttonMultiply,buttonClean, buttonStepen;
    private TextView operation, result;
    private EditText number1,number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        buttonDivided = (Button) findViewById(R.id.buttonDivided);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        operation = (TextView) findViewById(R.id.operation);
        result = (TextView) findViewById(R.id.result);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        buttonClean = (Button) findViewById(R.id.buttonClean);
        buttonStepen = (Button) findViewById(R.id.buttonStepen);

        buttonAdd.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonDivided.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonClean.setOnClickListener(this);
        buttonStepen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float res = 0;

        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number2.getText().toString());

        switch (v.getId()){
            case R.id.buttonAdd:
                operation.setText("+"   );
                res = num1 + num2;
                break;
            case R.id.buttonSubtract:
                operation.setText("-");
                res = num1 - num2;
                break;
            case R.id.buttonDivided:
                operation.setText("/");
                res = num1 / num2;
                break;
            case R.id.buttonMultiply:
                operation.setText("*");
                res = num1 * num2;
                break;
            case R.id.buttonClean:
                number1.setText("");
                number2.setText("");
                operation.setText("");
                result.setText("");
                break;
            case R.id.buttonStepen:
                operation.setText("^");
                res = (float)Math.pow(num1,num2);
                break;
            default:
                break;
        }
        result.setText(res+"");
    }
}