package com.example.LAB2_KieuThiHaDuyen.services;

import com.example.LAB2_KieuThiHaDuyen.entity.User;
import com.example.LAB2_KieuThiHaDuyen.respository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public void save (User user){
        userRepository.save(user);
    }
}