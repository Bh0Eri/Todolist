package senai.todolist.service;

import org.springframework.stereotype.Service;
import senai.todolist.repositories.UserRepo;

@Service
public class UsersService {

    private final UserRepo userRepo;


    public UsersService(UserRepo userRepo) {
        this.userRepo = userRepo;







    }
}
