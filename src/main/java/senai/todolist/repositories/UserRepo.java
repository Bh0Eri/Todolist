package senai.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senai.todolist.entity.Users;



@Repository
public interface UserRepo extends JpaRepository<Users, Long> {

    Users findUsersByEmail(String email);

}
