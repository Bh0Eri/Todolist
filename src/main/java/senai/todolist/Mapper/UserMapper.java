package senai.todolist.Mapper;


import senai.todolist.dto.userDTO.UserRequestDTO;
import senai.todolist.dto.userDTO.UserResponseDTO;
import senai.todolist.entity.Users;

public class UserMapper {

    public static Users toEntity(UserRequestDTO dto){

        return Users.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();
    }

    public static UserResponseDTO toDto(Users users){

        return UserResponseDTO.builder()
                .id(users.getId())
                .name(users.getName())
                .email(users.getEmail())
                .password(users.getPassword())
                .build();
    }


}
