package controller;

import model.User;
import model.dto.UserDto;
import model.service.UserService;
import model.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private final UserService userService = new UserServiceImpl();
    public void addNewUser(User user, User nana){
        userService.addNewUser(user);
    }
    public void deleteUserById(Integer id){
        userService.deleteUserById(id);
    }
    public void updateUser(User user){
        userService.updateUser(user);
    }

    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }
}