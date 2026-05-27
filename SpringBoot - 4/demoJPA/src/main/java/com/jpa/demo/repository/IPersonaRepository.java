package com.jpa.demo.repository;

import com.jpa.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //mapeamos como repositorio
/**
 * la interface extiende de JpaRepository (que maneja repositorios JPA)
 * en los parametros <> deben ir: <clase a persistir, tipo de dato del id>
 * esto nos permite usar todos los metodos CRUD
 */
public interface IPersonaRepository extends JpaRepository<Persona, Long> {



}
