package com.example.buurttuin.Controllers;

import com.example.buurttuin.Dtos.UserDto;
import com.example.buurttuin.Dtos.UserInputDto;

import com.example.buurttuin.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public UserDto addUser (@RequestBody UserInputDto userInputDto){
        return userService.addUser(userInputDto);
    }

    @GetMapping("/allUsers")
    public List<UserDto> getAllUsers(){
       return userService.getAllUsers();
    }

    @PutMapping("/addNewTool/{tool_id}/ToUser/{user_id}")
    public UserDto addNewToolToUser(@PathVariable Long tool_id,
                                        @PathVariable Long user_id){
        return userService.addNewToolToUser(tool_id, user_id);
    }
}
