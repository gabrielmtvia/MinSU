package dk.via.minsu;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
    TextView percentageFeriePenge;
    TextView percentageFritvalg;
    TextView percentageSaerlig;

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
        percentageFeriePenge = findViewById(R.id.holidayMoneyPercentage);
        percentageFritvalg= findViewById(R.id.fritvalgPercentage);
        percentageSaerlig= findViewById(R.id.editTextNumberDecimal3);

        Button btn = findViewById(R.id.button2);

        btn.setOnClickListener(view -> magic(view));

    }

    private void magic(View view) {
        double salary = 0;
        double howManyHours = 0;

        double amContribution = 1-0.08;

        double pFeriePenge = 0;
        double pFritValg = 0;
        double pSaerlig = 0;

        boolean bFeriePenge = feriePenge.isChecked();
        boolean bFritValg = fritValg.isChecked();
        boolean bSaerlig = saerlig.isChecked();

        if(grossSalary.getText().toString().isEmpty()){
            salary = 12500.75;
        } else {
            salary = Double.parseDouble(grossSalary.getText().toString());
        }

        if(hours.getText().toString().isEmpty()){
            howManyHours = 82.53;
        } else {
            howManyHours = Double.parseDouble(hours.getText().toString());
        }



        if(bFeriePenge){
            pFeriePenge = Double.parseDouble(percentageFeriePenge.getText().toString())/100;
        }

        if(bFritValg){
            pFritValg = Double.parseDouble(percentageFritvalg.getText().toString())/100;
        }

        if(bSaerlig){
            pSaerlig = Double.parseDouble(percentageSaerlig.getText().toString())/100;
        }

        double totalMoney = salary*(pFeriePenge+pFritValg+pSaerlig+1)*amContribution;
        double totalSalaryPerHour = totalMoney / howManyHours;

        realGrossSalaryPerHour.setText(String.format("%.2f", totalSalaryPerHour));
        totalAmountOfMoneyAfterAm.setText(String.format("%.2f", totalMoney));

    }

}
