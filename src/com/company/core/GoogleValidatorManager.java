package com.company.core;

import com.company.GoogleVERİFİCTİON.GoogleVerificition;

public class GoogleValidatorManager implements GoogleValidatorService{
    @Override
    public boolean emailIsValid(String email) {
        GoogleVerificition googleVerificition=new GoogleVerificition();
        googleVerificition.emailIsValid(email);
        return false;
    }
}
