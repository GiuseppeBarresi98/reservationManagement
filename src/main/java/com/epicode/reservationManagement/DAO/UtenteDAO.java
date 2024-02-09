package com.epicode.reservationManagement.DAO;

import com.epicode.reservationManagement.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteDAO extends JpaRepository<Utente, Long> {

    
}
