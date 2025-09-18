package com.mysql.todolist.enity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_todolist")
public class ToDolist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String user;
    private String senha;
    private String email;

}
