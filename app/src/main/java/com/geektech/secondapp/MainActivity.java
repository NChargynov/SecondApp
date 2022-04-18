package com.geektech.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCard = findViewById(R.id.buttn_card);
        CardView cardView = findViewById(R.id.card_view);

        buttonCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //обработка клика
                if (cardView.getAlpha() == 0){
                    cardView.animate().alpha(1);
                }else {
                    cardView.animate().alpha(0);
                }
            }
        });

        LinearLayout container = findViewById(R.id.container);

        findViewById(R.id.big_button).setOnClickListener(view -> {
            if (container.getVisibility() == View.GONE){
                container.setVisibility(View.VISIBLE);
            }else {
                container.setVisibility(View.GONE);
            }
        });
        EditText editText = findViewById(R.id.edit_text);

        findViewById(R.id.buttn_oval).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if (editText.getText().toString().equals("Hello world")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            editText.getText().toString(),
                            Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP, 0, 0);
                    toast.show();
//                }else {
//                    Toast.makeText(MainActivity.this, "Ошибка",
//                            Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }
}