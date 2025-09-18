package com.mysql.todolist.controller;

import com.mysql.todolist.enity.ToDolist;
import com.mysql.todolist.enity.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    UsuarioRepositorio user;

    @GetMapping
    public List<ToDolist> show(){
        List<ToDolist> usuario = user.findAll();
        return usuario;
    }




}
