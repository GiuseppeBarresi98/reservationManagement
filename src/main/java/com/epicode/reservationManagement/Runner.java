package com.epicode.reservationManagement;

import com.epicode.reservationManagement.Enum.Tipo;
import com.epicode.reservationManagement.entities.Edificio;
import com.epicode.reservationManagement.entities.Postazione;
import com.epicode.reservationManagement.entities.Utente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ReservationManagementApplication.class);

        Edificio palazzo_dei_congressi = new Edificio("Palazzo dei congressi", "Via dell'EUR", "Roma");
        Edificio ufficio_manzoni = new Edificio("Ufficio Manzoni", "Via dell'architettura", "Milano");

        Postazione postazioneUno = new Postazione("Zona per riunioni", Tipo.SALA_RIUNIONI, 30, ufficio_manzoni);
        Postazione postazioneDue = new Postazione("Zona congressi", Tipo.OPENSPACE, 400, palazzo_dei_congressi);


        Utente utenteUno = new Utente("Spiderman23", "Giuseppe", "peppe@gmail.com");
        Utente utenteDue = new Utente("Super Mario", "Mario", "mario@gmail.com");


    }
}
