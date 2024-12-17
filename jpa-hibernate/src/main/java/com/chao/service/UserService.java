package com.chao.service;

import com.chao.model.User;

public interface UserService {

    User create(User user);

    User update(User user);

    User findById(Long id);

    void delete(Long id);


}
