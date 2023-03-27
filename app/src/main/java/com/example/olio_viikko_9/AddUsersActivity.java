package com.example.olio_viikko_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AddUsersActivity extends AppCompatActivity {
    private EditText firstName;
    private EditText lastName;
    private EditText email;

    private int image;



    private UserStorage us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_users2);

        us = UserStorage.getInstance();

        firstName = findViewById(R.id.inputUserFirstName);
        lastName = findViewById(R.id.inputUserLastName);
        email = findViewById(R.id.inputUserEmail);

/*        RadioGroup rgUserImage = findViewById(R.id.rgChooseImage);
        switch (rgUserImage.getCheckedRadioButtonId()) {
            case R.id.rbMasi:
                image = R.drawable.masi__2_;
                break;

            case R.id.rbNiilinHanhet:
                image = R.drawable.niilinhanhet;
                break;

            case R.id.rbPutin:
                image = R.drawable.putin_kalassa;
                break;

        }*/
    }
        public void addUser (View view){
            RadioGroup rgDegreeProgram = findViewById(R.id.rgChooseDegreeProgram);
            switch (rgDegreeProgram.getCheckedRadioButtonId()) {
                case R.id.rbTuTa:
                    us.addUsers(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), "Tuotantotalous", image));
                    break;

                case R.id.rbTiTe:
                    us.addUsers(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), "Tietotekniikka", image));
                    break;

                case R.id.rbLaTe:
                    us.addUsers(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), "Laskennallinen tekniikka", image));
                    break;

                case R.id.rbSäTe:
                    us.addUsers(new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), "Sähkötekniikka", image));
                    break;

            }


        }


}