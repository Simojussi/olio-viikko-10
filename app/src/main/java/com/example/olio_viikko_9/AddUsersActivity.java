package com.example.olio_viikko_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AddUsersActivity extends AppCompatActivity {
    private TextView firstName;
    private TextView lastName;
    private TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_users2);

        firstName = findViewById(R.id.inputUserFirstName);
        lastName = findViewById(R.id.inputUserLastName);
        email = findViewById(R.id.inputUserEmail);
    }
    public void addUser(View view){
        RadioGroup rgDegreeProgram = findViewById(R.id.rgChooseDegreeProgram);
        switch(rgDegreeProgram.getCheckedRadioButtonId()){
            case R.id.rbTuTa:
                UserStorage.getInstance().addUsers(new User(firstName.toString(), lastName.toString(), email.toString(), "Tuotantotalous"));

            case R.id.rbTiTe:
                UserStorage.getInstance().addUsers(new User(firstName.toString(), lastName.toString(), email.toString(), "Tietotekniikka"));

            case R.id.rbLaTe:
                UserStorage.getInstance().addUsers(new User(firstName.toString(), lastName.toString(), email.toString(), "Laskennallinen tekniikka"));

            case R.id.rbSäTe:
                UserStorage.getInstance().addUsers(new User(firstName.toString(), lastName.toString(), email.toString(), "Sähkötekniikka"));
        }


    }


}