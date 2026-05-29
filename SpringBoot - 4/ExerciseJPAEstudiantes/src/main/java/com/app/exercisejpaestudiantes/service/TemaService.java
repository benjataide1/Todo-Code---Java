package com.app.exercisejpaestudiantes.service;

import com.app.exercisejpaestudiantes.model.Tema;
import com.app.exercisejpaestudiantes.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {

    @Autowired
    ITemaRepository temaRepository;

    @Override
    public List<Tema> getTemas() {
        return temaRepository.findAll();
    }

    @Override
    public void saveTema(Tema tema) {
        temaRepository.save(tema);
    }

    @Override
    public void deleteTema(Long id) {
        temaRepository.deleteById(id);
    }

    @Override
    public Tema findTema(Long id) {
        return temaRepository.findById(id).get();
    }

    @Override
    public void editTema(Long idOriginal, Long idNuevo, String nuevNombre, String nuevDescripcion) {
        Tema temaOriginal = findTema(idOriginal);

        temaOriginal.setId_tema(idNuevo);
        temaOriginal.setNombre(nuevNombre);
        temaOriginal.setDescripcion(nuevDescripcion);
        temaRepository.save(temaOriginal);

    }
}
