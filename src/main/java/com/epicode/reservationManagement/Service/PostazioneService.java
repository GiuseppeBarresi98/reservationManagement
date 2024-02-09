package com.epicode.reservationManagement.Service;


import com.epicode.reservationManagement.DAO.PostazioneDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    private PostazioneDAO postazioneDAO;
}
