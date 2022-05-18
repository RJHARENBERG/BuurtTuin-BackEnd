package com.example.buurttuin.Repositorys;

import com.example.buurttuin.Fields.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
