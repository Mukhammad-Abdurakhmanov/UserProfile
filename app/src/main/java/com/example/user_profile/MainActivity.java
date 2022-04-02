package com.example.user_profile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView back_button;
    Button change_profile_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        back_button = (ImageView) findViewById(R.id.back_button);
        change_profile_button = (Button) findViewById(R.id.change_profile_button);
        View.OnClickListener yes = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case (R.id.back_button):
                        show("Вы хотите перейти назад");
                    case (R.id.change_profile_button):
                        show("Вы хотите изменить профиль");
                }
            }
        };
        back_button.setOnClickListener(yes);
        change_profile_button.setOnClickListener(yes);
    }

    private void show(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}