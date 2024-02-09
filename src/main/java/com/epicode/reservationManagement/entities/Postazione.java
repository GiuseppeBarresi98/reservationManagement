package com.epicode.reservationManagement.entities;


import com.epicode.reservationManagement.Enum.Tipo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter


public class Postazione {
    @Id
    @GeneratedValue
    private long id;
    private String descrizione;
    private Tipo tipo;
    private int capienza;
    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;
    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> list_prenotazioni;

    public Postazione(String descrizione, Tipo tipo, int capienza, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.capienza = capienza;
        this.edificio = edificio;

    }

    @Override
    public String toString() {
        return "Postazione{" +
                "descrizione='" + descrizione + '\'' +
                ", tipo=" + tipo +
                ", capienza=" + capienza +
                ", città dell'edificio=" + edificio.getCitta();
    }
}
