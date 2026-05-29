package com.app.exercisejpaestudiantes.repository;

import com.app.exercisejpaestudiantes.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
