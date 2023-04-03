package com.example.olio_viikko_9;

import android.content.Context;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public ArrayList<User> getUsers() {
        Collections.sort(users, new Comparing());

        return users;
    }

    public void saveUsers(Context context){
        try{
            ObjectOutputStream userWriter = new ObjectOutputStream(context.openFileOutput("users.data", context.MODE_PRIVATE));
            userWriter.writeObject(users);
            userWriter.close();
        }
        catch (IOException ioe) {
            System.out.println("tallentaminen epäonnistui");
            ioe.printStackTrace();
        }

    }

    public void loadUsers(Context context){
        try{
            ObjectInputStream userLoader = new ObjectInputStream(context.openFileInput("users.data"));
            users = (ArrayList<User>) userLoader.readObject();
            userLoader.close();
        }
        catch (Exception e){
            System.out.println("Lataaminen epäonnistui");
            e.printStackTrace();
        }



    }

}
