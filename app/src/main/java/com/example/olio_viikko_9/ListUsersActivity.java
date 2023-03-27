package com.example.olio_viikko_9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListUsersActivity extends AppCompatActivity {

    private UserStorage us;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_users);

        us = UserStorage.getInstance();
        rv = findViewById(R.id.rvUserList);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new UserListAdapter(getApplicationContext(), us.getUsers()));
    }
}