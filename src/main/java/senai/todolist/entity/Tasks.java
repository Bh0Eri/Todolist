package senai.todolist.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import senai.todolist.enums.Status;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tasks {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    private String taskName;

    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;




}
