package com.epicode.reservationManagement.DAO;

import com.epicode.reservationManagement.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EdificioDAO extends JpaRepository<Edificio, Long> {
}
