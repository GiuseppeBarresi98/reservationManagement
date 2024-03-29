package com.epicode.reservationManagement.Service;


import com.epicode.reservationManagement.DAO.UtenteDAO;
import com.epicode.reservationManagement.entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {

    @Autowired
    private UtenteDAO utenteDAO;

    public void saveUtente(Utente utente) {
        utenteDAO.save(utente);
    }
}
