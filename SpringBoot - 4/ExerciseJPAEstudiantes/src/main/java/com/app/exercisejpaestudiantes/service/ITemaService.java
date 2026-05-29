package com.app.exercisejpaestudiantes.service;

import com.app.exercisejpaestudiantes.model.Tema;

import java.util.List;

public interface ITemaService {

    public List<Tema> getTemas();

    public void saveTema(Tema tema);

    public void deleteTema(Long id);

    public Tema findTema(Long id);

    public void editTema(Long idOriginal,Long nuevoId, String nuevNombre,String nuevDescripcion);
}
