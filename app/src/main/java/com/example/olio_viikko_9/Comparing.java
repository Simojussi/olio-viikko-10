package com.example.olio_viikko_9;

import java.util.Comparator;

public class Comparing implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {

        return u1.getLastName().compareTo(u2.getLastName());
    }
}
