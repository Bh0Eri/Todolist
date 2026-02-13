package senai.todolist.service.userService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import senai.todolist.Mapper.UserMapper;
import senai.todolist.dto.userDTO.UserRequestDTO;
import senai.todolist.dto.userDTO.UserResponseDTO;
import senai.todolist.entity.Users;
import senai.todolist.repositories.UserRepo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService{

    private final UserRepo userRepo;


    @Override
    public UserResponseDTO create(UserRequestDTO dto) {

        Users user = UserMapper.toEntity(dto);
        Users saved = userRepo.save(user);

        return UserMapper.toDto(saved);
    }

    @Override
    public List<UserResponseDTO> findAll() {

        return userRepo.findAll()
                .stream()
                .map(UserMapper::toDto)
                .toList();
    }

    @Override
    public Optional<Users> findById(UUID id) {
        return userRepo.findById(id);
    }

    @Override
    public void delete(UUID id) {
        if (!userRepo.existsById(id)){
            throw new RuntimeException("User not found");
        }
        userRepo.deleteById(id);
    }

    @Override
    public UserResponseDTO update(UUID id, UserRequestDTO dto){

        Users user = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        Users update = userRepo.save(user);

        return UserMapper.toDto(update);
    }

}

