package com.epicode.reservationManagement.DAO;

import com.epicode.reservationManagement.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, Long> {
}
