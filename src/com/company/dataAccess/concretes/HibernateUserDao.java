package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entity.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println("Eklendiniz" + user.getfName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Silindiniz" + user.getfName());
    }

    @Override
    public void update(User user) {
        System.out.println("Güncellendi" );

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void login(User user) {
        System.out.println("Giriş Yapıldı" + user.getfName());

    }
}

