package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity{
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank("Diamond Bank");
        Client a=new Client("Farhad", 100), b=new Client("Timur", 1);
        bank.registration(a);
        bank.registration(b);
        try {
            bank.transaction(10,a,b);
            System.out.println("All ok");
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
