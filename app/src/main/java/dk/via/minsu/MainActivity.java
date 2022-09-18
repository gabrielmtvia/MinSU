package dk.via.minsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate", "the application is running");
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, SecondaryActivity.class)));
    }

    public void welcomeToast(View view) {
        Toast.makeText(this, "Thank you for using the app!!", Toast.LENGTH_LONG).show();
    }
}