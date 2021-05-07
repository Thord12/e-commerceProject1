package com.company.GoogleVERİFİCTİON;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleVerificition {
    public boolean emailIsValid(String email) {
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            System.out.println("Girilen Email google hesabýdýr. :" + email);
            return true;
        }
        else
        {
            System.out.println("Girilen Email google hesabý deðildir!");
            return false;
        }

    }

}
