package com.example.olio_viikko_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        context = MainActivity.this;
        UserStorage.getInstance().loadUsers(context);
    }

    public void toAddUsers(View view) {
        Intent intent = new Intent(this, AddUsersActivity.class);
        startActivity(intent);
    }

    public void toListUsers(View view) {
        Intent intent = new Intent(this, ListUsersActivity.class);
        startActivity(intent);
    }




}