package com.company.business.concretes;

import com.company.business.abstracts.UserService;
import com.company.core.GoogleValidatorService;
import com.company.core.ValidatorService;
import com.company.dataAccess.abstracts.UserDao;
import com.company.entity.concretes.User;

public class UserManager implements UserService {

    private UserDao dao;
    private ValidatorService validatorService;
    private GoogleValidatorService googleValidatorService;
    public UserManager(UserDao dao, ValidatorService validatorservice, GoogleValidatorService googleValidatorService) {
        this.validatorService=validatorservice;
        this.dao = dao;
        this.googleValidatorService=googleValidatorService;
    }



    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void add(User user) {
        if(googleValidatorService.emailIsValid(user.geteMail())) {
            System.out.println(user.geteMail()+" Bu email adresi zaten mevcut!");
            return;
        }else if(user.getPassword().length()<6) {
            System.out.println(user.getPassword()+" Bu şifre en az 6 karakterden olmalıdr");
            return;
        }else if(!((user.getfName().length()>=2)&&(user.getlName().length()>=2))) {
            System.out.println(user.getfName()+" "+user.getlName() +" Ad ve soyad en az iki karakterden oluþmalýdýr!");
        }else {
            System.out.println(user.geteMail()+" email adresine bir dogrulama kodu gönderildi.");
            if(validatorService.verificition()) {
                this.dao.add(user);
                System.out.println("Kayıt başarılı!");
            }else {
                System.out.println("Onay mesajınız gelmediyse tekrar deneyiniz.");
            }
        }
    }

}

