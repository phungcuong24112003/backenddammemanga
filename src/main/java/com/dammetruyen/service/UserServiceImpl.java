package com.dammetruyen.service;

import com.dammetruyen.model.User;
import com.dammetruyen.repository.UserRepository;
import com.dammetruyen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User create(User user) {
        // Tự tạo id
        user.setIdUser(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

    @Override
    public User login(String account, String password) {
        User u = userRepo.findByAccount(account);
        if (u != null && u.getPassword().equals(password)) {
            return u; // Không mã hóa mật khẩu theo yêu cầu
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }
}
