package com.epicode.reservationManagement.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class Prenotazione {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;

    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    public Prenotazione(Postazione postazione, LocalDate data, Utente utente) {
        this.postazione = postazione;
        this.data = data;
        this.utente = utente;
    }
}
