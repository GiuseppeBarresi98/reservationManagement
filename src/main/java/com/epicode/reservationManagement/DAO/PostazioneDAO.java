package com.epicode.reservationManagement.DAO;

import com.epicode.reservationManagement.Enum.Tipo;
import com.epicode.reservationManagement.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, Long> {

    List<Postazione> findByTipoAndEdificio_Citta(Tipo tipo, String citta);
}
