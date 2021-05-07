package com.company.core;

public class ValidatorManager implements  ValidatorService{
    @Override
    public boolean verificition() {
        System.out.println("E-Mail doğrulandı");
        return false;

    }
}
