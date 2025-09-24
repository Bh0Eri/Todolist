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

    public ToDolist(String user, String senha, String email) {
        this.user = user;
        this.senha = senha;
        this.email = email;
    }

    public ToDolist() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
