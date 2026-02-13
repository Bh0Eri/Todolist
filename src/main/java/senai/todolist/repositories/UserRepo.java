package senai.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senai.todolist.dto.userDTO.UserResponseDTO;
import senai.todolist.entity.Users;

import java.util.UUID;


@Repository
public interface UserRepo extends JpaRepository<Users, UUID> {

    Users findUsersByEmail(String email);

}
