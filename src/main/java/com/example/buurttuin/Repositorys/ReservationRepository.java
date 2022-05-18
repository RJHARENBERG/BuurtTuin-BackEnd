package com.example.buurttuin.Repositorys;

import com.example.buurttuin.Fields.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
