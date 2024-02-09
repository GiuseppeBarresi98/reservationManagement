package com.epicode.reservationManagement.DAO;

import com.epicode.reservationManagement.Enum.Tipo;
import com.epicode.reservationManagement.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByTipoECitta(Tipo tipo, String citta);
}
