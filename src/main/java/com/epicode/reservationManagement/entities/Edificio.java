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
@NoArgsConstructor
@Entity
public class Edificio {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String indirizzo;
    private String citta;
    @OneToMany(mappedBy = "edificio")
    private List<Postazione> lista_postazioni;

    public Edificio(String nome, String indirizzo, String citta) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }
}
