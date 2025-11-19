package com.dammetruyen.service;

import com.dammetruyen.model.User;
import java.util.List;

public interface UserService {
    User create(User user);
    User login(String account, String password);
    List<User> getAll();
}
