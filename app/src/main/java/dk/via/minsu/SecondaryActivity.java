package dk.via.minsu;

import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondaryActivity extends AppCompatActivity {

    Switch feriePenge;
    Switch fritValg;
    Switch saerlig;
    TextView grossSalary;
    TextView hours;
    TextView realGrossSalaryPerHour;
    TextView totalAmountOfMoneyAfterAm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("onCreate", "secondary activity is running");
        feriePenge = findViewById(R.id.switch1);
        fritValg =  findViewById(R.id.switch2);
        saerlig =  findViewById(R.id.switch3);
        grossSalary = findViewById(R.id.editTextNumberSigned);
        hours = findViewById(R.id.editTextNumberSigned2);
        realGrossSalaryPerHour = findViewById(R.id.realSalaryPerHour);
        totalAmountOfMoneyAfterAm = findViewById(R.id.realSalaryThatMonth);

    }

}
