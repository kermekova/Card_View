package com.example.cardview;

import java. util. Calendar;
import java. util. Date;
public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        System.out.println("Current date: " + currentDate);
    }
}
