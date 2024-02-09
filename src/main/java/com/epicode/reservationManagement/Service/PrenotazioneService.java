package com.epicode.reservationManagement.Service;

import com.epicode.reservationManagement.DAO.PrenotazioneDAO;
import com.epicode.reservationManagement.entities.Postazione;
import com.epicode.reservationManagement.entities.Prenotazione;
import com.epicode.reservationManagement.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class PrenotazioneService {

    @Autowired
    private PrenotazioneDAO prenotazioneDAO;


    public void faiPrenotazione(Postazione postazione, LocalDate data, Utente utente) {
        if (postiOccupati(postazione, data) < postazione.getCapienza() && filterUtenteData(utente, data).isEmpty()) {
            Prenotazione prenotazione = new Prenotazione(postazione, data, utente);
            prenotazioneDAO.save(prenotazione);
            log.info("Prenotazione avvenuta con successo");
        } else {
            log.info("Errore prenotazione  non avvenuta posti terminati o hai gia una prenotato una postazione oggi riprova domani! ");
        }
    }


    public List<Prenotazione> filterUtenteData(Utente utente, LocalDate data) {
        List<Prenotazione> lista = prenotazioneDAO.findByUtenteAndData(utente, data);
        return lista;
    }

    public long postiOccupati(Postazione postazione, LocalDate data) {
        long postiOccupati = prenotazioneDAO.numeroDipostiOccupati(postazione, data);
        return postiOccupati;
    }
}
