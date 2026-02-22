package senai.todolist.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import senai.todolist.dto.userDTO.UserRequestDTO;
import senai.todolist.dto.userDTO.UserResponseDTO;
import senai.todolist.entity.Users;
import senai.todolist.service.userService.UsersService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("user/")
@RequiredArgsConstructor
public class UserController {

    private final UsersService usersService;

    @PostMapping(value = "create")
    public String save(@RequestBody UserRequestDTO user) {
        usersService.create(user);
        return "success";
    }

    @GetMapping(value = "showAll")
    public List<UserResponseDTO> findAll() {
        return usersService.findAll();
    }
    @GetMapping(value = "show")
    public Optional<Users> findById(@RequestBody UUID id) {
        return usersService.findById(id);
    }
    @DeleteMapping(value = "delete")
    public String delete(@RequestBody UUID id) {
        usersService.delete(id);
        return "success";
    }

    @PostMapping(value = "update")
    public String update(@RequestBody UUID id, UserRequestDTO user) {
        if (usersService.findById(id).isPresent()) {
            usersService.update(id, user);
            return "success";
        }else  {
            return "error";
        }
    }



}
