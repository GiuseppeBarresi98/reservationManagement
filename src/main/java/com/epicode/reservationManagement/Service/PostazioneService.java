package com.epicode.reservationManagement.Service;


import com.epicode.reservationManagement.DAO.PostazioneDAO;
import com.epicode.reservationManagement.DAO.PrenotazioneDAO;
import com.epicode.reservationManagement.Enum.Tipo;
import com.epicode.reservationManagement.entities.Postazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    private PrenotazioneDAO prenotazioneDAO;
    @Autowired
    private PostazioneDAO postazioneDAO;

    public void savePostazione(Postazione postazione) {
        postazioneDAO.save(postazione);
        log.info("Postazione salvato con successo!");
    }

    public List<Postazione> filterByTipoAndCitta(Tipo tipo, String citta) {
        List<Postazione> listaFiltrata = postazioneDAO.findByTipoAndEdificio_Citta(tipo, citta);
        return listaFiltrata;
    }
}
