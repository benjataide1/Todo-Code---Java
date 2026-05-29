package com.app.exercisejpaestudiantes.service;

import com.app.exercisejpaestudiantes.model.Curso;

import java.util.List;

public interface ICursoService {
    //get
    public List<Curso> getCursos();

    //put
    public void saveCurso(Curso curso);

    //delete
    public void deleteCurso(Long id);

    //find
    public Curso findCurso(Long id);

    //update
    public void editCurso(Curso curso);
}
