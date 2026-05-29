package com.app.exercisejpaclinica.service;

import com.app.exercisejpaclinica.model.Mascota;
import com.app.exercisejpaclinica.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

   @Autowired
   IMascotaRepository mascotaRepository;

    @Override
    public String  deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
        return "Delete Mascota Successfully";
    }

    @Override
    public List<Mascota> findAllMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public String saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
        return "Save Mascota Successfully";
    }

    @Override
    public Mascota findMascotaById(Long id) {
        return mascotaRepository.findById(id).get();
    }

    @Override
    public Mascota updateMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }
}
