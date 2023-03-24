package com.example.olio_viikko_9;

import java.util.ArrayList;

public class UserStorage {

    private static UserStorage us = null;
    ArrayList<User> users = new ArrayList<>();

    private UserStorage(){

    }

    public static UserStorage getInstance(){
        if(us == null){
            us = new UserStorage();
        }
        return us;
    }

    public void addUsers(User user){
        users.add(user);

    }



}
