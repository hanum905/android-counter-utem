package my.edu.utem.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.Counter_textView);
    }

    public void buttonPressed(View view) {
        counter++;
                textView.setText(counter+ "");
    }

    public void decrementPressed(View view) {
        if (counter == 0) {
            Toast.makeText(MainActivity.this, "Number cannot be less than zero", Toast.LENGTH_LONG).show();
        }else{
                counter--;
                textView.setText(counter+ "");
            }


        }

    public void resetPressed(View view) {
        counter = 0;
        textView.setText(counter+ "");
    }
}

