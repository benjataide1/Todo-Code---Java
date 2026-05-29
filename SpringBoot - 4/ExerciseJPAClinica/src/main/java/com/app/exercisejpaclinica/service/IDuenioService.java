package com.app.exercisejpaclinica.service;

import com.app.exercisejpaclinica.model.Duenio;

import java.util.List;

public interface IDuenioService {

    public List<Duenio> getAllDuenios();

    public String saveDuenio(Duenio duenio);

    public String deleteDuenio(Long id);

    public Duenio findDuenioById(Long id);

    public Duenio updateDuenio(Duenio duenio);
}
