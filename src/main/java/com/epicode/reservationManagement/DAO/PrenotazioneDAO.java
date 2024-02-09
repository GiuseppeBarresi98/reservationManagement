package com.epicode.reservationManagement.DAO;

import com.epicode.reservationManagement.entities.Postazione;
import com.epicode.reservationManagement.entities.Prenotazione;
import com.epicode.reservationManagement.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByUtenteAndData(Utente utente, LocalDate data);

    @Query("SELECT COUNT(p) FROM Prenotazione p WHERE p.postazione = :postazione AND p.data = :data")
    public long numeroDipostiOccupati(Postazione postazione, LocalDate data);


}
