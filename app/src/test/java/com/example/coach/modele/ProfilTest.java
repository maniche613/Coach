package com.example.coach.modele;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Date;

public class ProfilTest {

    private Profil profil = new Profil(67, 165, 35, 0, new Date());
    private float img = (float)32.2;
    private String message = "trop de graisse";

    @Test
    public void getImg() {
        assertEquals(img, profil.getImg(), (float)0.1);
    }

    @Test
    public void getMessage() {
        assertEquals(message, profil.getMessage());
    }
}