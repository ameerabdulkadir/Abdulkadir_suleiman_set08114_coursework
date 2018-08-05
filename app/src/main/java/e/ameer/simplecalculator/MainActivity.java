package e.ameer.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number, number2;
    TextView result;
    Button ADD,SUBTRACT,MULTIPLY,DIVIDE;

   View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.gray);


        {


        }



        number = (EditText)findViewById(R.id.num1);
        number2 = (EditText)findViewById(R.id.num2);

        result = (TextView)findViewById(R.id.result);


        ADD = (Button)findViewById(R.id.buttonAdd);
        SUBTRACT = (Button)findViewById(R.id.buttonSub);
        MULTIPLY = (Button)findViewById(R.id.buttonMul);
        DIVIDE = (Button)findViewById(R.id.buttonDiv);

        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number.getText() != null && number.getText() != null) {


                    double nl = Double.parseDouble(number.getText().toString());
                    double n2 = Double.parseDouble(number2.getText().toString());

                    double res = nl + n2;
                    result.setText(String.valueOf(res));


                }
                else {
                    Toast.makeText(v.getContext(),"enter the correct numbers",Toast.LENGTH_SHORT).show();

                }
            }
        });

        SUBTRACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number.getText() != null && number.getText() != null) {


                    double nl = Double.parseDouble(number.getText().toString());
                    double n2 = Double.parseDouble(number2.getText().toString());

                    double res = nl - n2;
                    result.setText(String.valueOf(res));


                }
                else {
                    Toast.makeText(v.getContext(),"enter the correct numbers",Toast.LENGTH_SHORT).show();

                }
            }
        });

        MULTIPLY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number.getText() != null && number.getText() != null) {


                    double nl = Double.parseDouble(number.getText().toString());
                    double n2 = Double.parseDouble(number2.getText().toString());

                    double res = nl * n2;
                    result.setText(String.valueOf(res));


                }
                else {
                    Toast.makeText(v.getContext(),"enter the correct numbers",Toast.LENGTH_SHORT).show();

                }
            }
        });


        DIVIDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number.getText() != null && number.getText() != null) {


                    double nl = Double.parseDouble(number.getText().toString());
                    double n2 = Double.parseDouble(number2.getText().toString());

                    double res = nl / n2;
                    result.setText(String.valueOf(res));


                }
                else {
                    Toast.makeText(v.getContext(),"enter the correct numbers",Toast.LENGTH_SHORT).show();

                }
            }
        });



    }
}
