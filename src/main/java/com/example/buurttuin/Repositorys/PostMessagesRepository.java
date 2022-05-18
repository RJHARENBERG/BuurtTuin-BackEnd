package com.example.buurttuin.Repositorys;

import com.example.buurttuin.Fields.PostMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostMessagesRepository extends JpaRepository<PostMessage, Long> {
}
