package com.epicode.reservationManagement.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Utente {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String nome;

    private String email;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> lista_prenotazioni;

    public Utente(String username, String nome, String email) {
        this.username = username;
        this.nome = nome;
        this.email = email;
    }
}
