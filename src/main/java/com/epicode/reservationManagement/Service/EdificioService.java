package com.epicode.reservationManagement.Service;


import com.epicode.reservationManagement.DAO.EdificioDAO;
import com.epicode.reservationManagement.entities.Edificio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService {

    @Autowired
    private EdificioDAO edificioDAO;

    public void saveEdificio(Edificio edificio) {
        edificioDAO.save(edificio);
        log.info("Edificio salvato con successo!");
    }

}
