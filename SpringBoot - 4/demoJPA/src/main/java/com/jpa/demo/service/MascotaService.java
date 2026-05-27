package com.jpa.demo.service;

import com.jpa.demo.model.Mascota;
import com.jpa.demo.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getMascotas() {
        return  mascotaRepository.findAll();
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        return mascotaRepository.findById(id).get();
    }

    @Override
    public void editMascota(Long idOriginal, Long idNuevo, String nuevoNombre, String nuevoEspecie, String nuevoRaza, String nuevoColor) {
        Mascota mascotaOriginal = this.findMascota(idOriginal);

        mascotaOriginal.setId_mascota(idNuevo);
        mascotaOriginal.setNombre(nuevoNombre);
        mascotaOriginal.setEspecie(nuevoEspecie);
        mascotaOriginal.setRaza(nuevoRaza);
        mascotaOriginal.setColor(nuevoColor);

        mascotaRepository.save(mascotaOriginal);

    }
}
