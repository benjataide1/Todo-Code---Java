package com.app.exercisejpaclinica.service;

import com.app.exercisejpaclinica.model.Duenio;
import com.app.exercisejpaclinica.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService implements IDuenioService {

   @Autowired
   IDuenioRepository duenioRepository;

    @Override
    public List<Duenio> getAllDuenios() {
        return duenioRepository.findAll();
    }

    @Override
    public String  saveDuenio(Duenio duenio) {
        duenioRepository.save(duenio);
        return "Duenio crate success ";
    }

    @Override
    public String deleteDuenio(Long id) {
        duenioRepository.deleteById(id);
        return "Duenio Delete success ";
    }

    @Override
    public Duenio findDuenioById(Long id) {
        return duenioRepository.findById(id).get();
    }

    @Override
    public Duenio updateDuenio(Duenio duenio) {
        return duenioRepository.save(duenio);
    }
}
