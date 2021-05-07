package com.company.business.abstracts;

import com.company.entity.concretes.User;

public interface UserService {

    void delete(User user);
    void update(User user);

    void add(User user);
}
