package senai.todolist.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import senai.todolist.enums.Status;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Tasks {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    private String taskName;

    private String description;


    private Status status;


    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private Users users;


}
