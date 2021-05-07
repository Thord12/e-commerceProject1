package com.company.entity.concretes;

import com.company.entity.abstracts.Entity;

public class User  implements Entity {
    private String fName;
    private String lName;
    private String password;
    private String eMail;

    public User(String fName, String lName, String password, String eMail) {
        this.setfName(fName);
        this.setlName(lName);
        this.setPassword(password);
        this.seteMail(eMail);
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
