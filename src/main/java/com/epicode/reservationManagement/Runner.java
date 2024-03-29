package com.epicode.reservationManagement;

import com.epicode.reservationManagement.Enum.Tipo;
import com.epicode.reservationManagement.Service.EdificioService;
import com.epicode.reservationManagement.Service.PostazioneService;
import com.epicode.reservationManagement.Service.PrenotazioneService;
import com.epicode.reservationManagement.Service.UtenteService;
import com.epicode.reservationManagement.entities.Edificio;
import com.epicode.reservationManagement.entities.Postazione;
import com.epicode.reservationManagement.entities.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private UtenteService utenteService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PrenotazioneService prenotazioneService;


    @Override
    public void run(String... args) throws Exception {

        Edificio palazzo_dei_congressi = new Edificio("Palazzo dei congressi", "Via dell'EUR", "Roma");
        Edificio ufficio_manzoni = new Edificio("Ufficio Manzoni", "Via dell'architettura", "Milano");

        Postazione postazioneUno = new Postazione("Zona per riunioni", Tipo.SALA_RIUNIONI, 30, ufficio_manzoni);
        Postazione postazioneDue = new Postazione("Zona congressi", Tipo.OPENSPACE, 400, palazzo_dei_congressi);
        Postazione postazioneTre = new Postazione("Palazzo Madama", Tipo.OPENSPACE, 1, palazzo_dei_congressi);


        Utente utenteUno = new Utente("Spiderman23", "Giuseppe", "peppe@gmail.com");
        Utente utenteDue = new Utente("Super Mario", "Mario", "mario@gmail.com");


        /////////////////////////////////SALVATAGGI NEL DB ///////////////////////////////////////////////////

        edificioService.saveEdificio(ufficio_manzoni);
        edificioService.saveEdificio(palazzo_dei_congressi);

        postazioneService.savePostazione(postazioneUno);
        postazioneService.savePostazione(postazioneDue);
        postazioneService.savePostazione(postazioneTre);

        utenteService.saveUtente(utenteUno);
        utenteService.saveUtente(utenteDue);


        /////////////////////////////// RICERCA PER TIPO E CITTA /////////////

        postazioneService.filterByTipoAndCitta(Tipo.OPENSPACE, "Roma").forEach(System.out::println);


        ///////////// SERVIZIO PRENOTAZIONI //////////

        prenotazioneService.faiPrenotazione(postazioneUno, LocalDate.now(), utenteUno);
        prenotazioneService.faiPrenotazione(postazioneTre, LocalDate.now(), utenteUno);

    }
}
