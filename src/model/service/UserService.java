package model.service;

import model.User;
import model.dto.UserDto;

import java.util.List;

public interface UserService {
    void addNewUser(User user);
    void deleteUserById(Integer id);
    void updateUser(User user);
    List<UserDto> getAllUsers();
}