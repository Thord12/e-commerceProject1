package com.company;

import com.company.business.abstracts.UserService;
import com.company.business.concretes.UserManager;
import com.company.core.GoogleValidatorManager;
import com.company.core.ValidatorManager;
import com.company.core.ValidatorService;
import com.company.dataAccess.concretes.HibernateUserDao;
import com.company.entity.concretes.User;

import javax.naming.NamingEnumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        User user=new User("Engin","Demiroğ","129386","ascas@gmail.com");
        UserService userService = new UserManager(new HibernateUserDao(),new ValidatorManager(),new GoogleValidatorManager());
        userService.add(user);
        


    }
}
