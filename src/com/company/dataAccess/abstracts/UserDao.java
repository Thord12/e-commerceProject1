package com.company.dataAccess.abstracts;

import com.company.entity.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void update(User user);
    List<User> getAll();
    void login(User user);

}
