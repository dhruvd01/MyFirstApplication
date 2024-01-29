package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myfirstapplication.R;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    Button changeTextButton;
    CheckBox checkBox;
    Switch switchButton;
    RadioGroup radioGroup;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        changeTextButton = findViewById(R.id.changeTextButton);
        checkBox = findViewById(R.id.checkBox);
        switchButton = findViewById(R.id.switchButton);
        radioGroup = findViewById(R.id.radioGroup);
        textView1 = findViewById(R.id.textView1);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle button click to change TextView text
                String name = editTextName.getText().toString();
                textView1.setText("Hi " + name);
            }
        });
    }
}