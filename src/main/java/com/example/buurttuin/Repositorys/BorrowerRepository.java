package com.example.buurttuin.Repositorys;

import com.example.buurttuin.Fields.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {
}
