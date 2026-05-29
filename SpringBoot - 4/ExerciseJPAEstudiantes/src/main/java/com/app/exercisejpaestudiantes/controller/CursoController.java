package com.app.exercisejpaestudiantes.controller;

import com.app.exercisejpaestudiantes.model.Curso;
import com.app.exercisejpaestudiantes.model.Tema;
import com.app.exercisejpaestudiantes.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CursoController {

    @Autowired
    CursoService cursoService;

    @GetMapping("/cursos")
    public List<Curso> getCursos() {
        return  cursoService.getCursos();
    }

    @GetMapping("/cursoFind/{name}")
    public List<Curso> specifyCurso(@PathVariable String name) {
        List<Curso> cursos = cursoService.getCursos();
        List<Curso> nuevoCurso =  new ArrayList<>();
        for (Curso curso : cursos) {
            if (curso.getNombre().equals(name)) {
                nuevoCurso.add(curso);
            }
        }
       return  nuevoCurso;
    }

    @GetMapping("curso/find/{id}")
    public List<Tema> findCurso(@PathVariable Long id) {
        return cursoService.findCurso(id).getListaDeTemas();
    }


    @PostMapping("/curso/create")
    public String createCurso(@RequestBody Curso curso) {
        cursoService.saveCurso(curso);
        return "Curso create success";
    }



    @DeleteMapping("curso/delete/{id}")
    public String deleteCurso(@PathVariable Long id) {
        cursoService.deleteCurso(id);
        return "Curso delete success";
    }

    @PutMapping("/curso/update")
    public Curso updateCurso(@RequestBody Curso curso) {
        cursoService.editCurso(curso);
        return cursoService.findCurso(curso.getId_curso());
    }
}

