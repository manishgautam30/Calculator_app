package com.example.calc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonSubstract;
    Button buttonMul;
    Button buttonDiv;
    Button buttonClear;
    Button buttonEqual;
    Button buttonDot;
    Button buttonSquare;
    Button buttonSquareroot;
    Button buttonCube;
    Button buttonCuberoot;
    String result;
    String tmp;
    String operator;
    TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl();
        initControlListener();

    }

    private void initControlListener() {
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("3");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked(".");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("9");
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClearButtonClicked();
            }
        });
        buttonSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){ onOperatorButtonClicked("-"); }});
        buttonSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("x²");
            }
        });
        buttonCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("x³");
            }
        });
        buttonSquareroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onOperatorButtonClicked("2√");
            }
        });
        buttonCuberoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onOperatorButtonClicked("3√");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("+");
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("*");
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("/");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onEqualButtonClicked();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

}

    //  method to open faq activity on click.
    public void openNewActivity(){
        Intent intent = new Intent(this, faq.class);
        startActivity(intent);
    }

    private void onEqualButtonClicked() {
        double res = 0;
        double number2=0;
        try {
            double number = Double.valueOf(tmp);

            if(operator == "x²" || operator == "x³" || operator == "2√" || operator == "3√") {

            }else{
                number2 = Double.valueOf(resultTextView.getText().toString());
            }

            switch (operator) {
                case "+":
                    res = number + number2;
                    break;
                case "/":
                    res = number / number2;
                    break;
                case "-":
                    res = number - number2;
                    break;
                case "*":
                    res = number * number2;
                    break;
                case "x²":

                    res = number * number;
                    break;
                case "x³":

                    res = number * number * number;
                    break;
                case "2√":

                    res = Math.sqrt(number);
                    break;
                case "3√":

                    res = Math.cbrt(number);
                    break;
            }
            result = String.valueOf(res);
            resultTextView.setText(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void onOperatorButtonClicked(String operator) {
        tmp = resultTextView.getText().toString();
        onClearButtonClicked();
        this.operator = operator;
    }

    private void onClearButtonClicked() {
        result = "";
        resultTextView.setText("");
    }

    private void onNumberButtonClicked(String pos) {
        result = resultTextView.getText().toString();
        result = result + pos;
        resultTextView.setText(result);
    }

    private void initControl() {
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonDot = (Button)findViewById(R.id.buttonDot);
        buttonAdd = (Button)findViewById(R.id.buttonAdd);
        buttonClear = (Button)findViewById(R.id.buttonClear);
        buttonSubstract = (Button)findViewById(R.id.buttonSub);
        buttonMul = (Button)findViewById(R.id.buttonMul);
        buttonDiv = (Button)findViewById(R.id.buttonDiv);
        buttonEqual = (Button)findViewById(R.id.buttonEqual);
        buttonSquare = (Button)findViewById(R.id.buttonSquare);
        buttonCube = (Button)findViewById(R.id.buttonCube);
        buttonSquareroot = (Button)findViewById(R.id.buttonSquareroot);
        buttonCuberoot = (Button)findViewById(R.id.buttonCuberoot);
        button =(Button)findViewById(R.id.button);

        resultTextView = (TextView)findViewById(R.id.text_view_result);
    }
}
