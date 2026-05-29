package com.app.exercisejpaestudiantes.service;

import com.app.exercisejpaestudiantes.model.Curso;
import com.app.exercisejpaestudiantes.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService {

    @Autowired
    ICursoRepository cursoRepository;

    @Override
    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public void saveCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public Curso findCurso(Long id) {
        return cursoRepository.findById(id).get();
    }

    @Override
    public void editCurso(Curso curso) {
        this.saveCurso(curso);
    }
}
