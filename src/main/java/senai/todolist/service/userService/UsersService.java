package senai.todolist.service.userService;

import senai.todolist.dto.userDTO.UserRequestDTO;
import senai.todolist.dto.userDTO.UserResponseDTO;
import senai.todolist.entity.Users;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface UsersService {

    UserResponseDTO create(UserRequestDTO dto);

    List<UserResponseDTO> findAll();

    Optional<Users> findById(UUID id);

    void delete(UUID id);

    UserResponseDTO update(UUID id, UserRequestDTO dto);
}
