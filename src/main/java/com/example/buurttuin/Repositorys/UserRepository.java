package com.example.buurttuin.Repositorys;

import com.example.buurttuin.Fields.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
