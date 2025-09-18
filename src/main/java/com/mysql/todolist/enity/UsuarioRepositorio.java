package com.mysql.todolist.enity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysql.todolist.enity.ToDolist;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<ToDolist,Long> {
}
