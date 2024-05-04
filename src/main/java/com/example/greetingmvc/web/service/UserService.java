package com.example.greetingmvc.web.service;

import com.example.greetingmvc.web.models.User;
import com.example.greetingmvc.web.models.Dto.UserDto;
import java.util.List;


public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}