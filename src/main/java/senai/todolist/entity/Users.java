package senai.todolist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    private String name;

    @Column(unique = true)
    private String email;

    private String password;
}
