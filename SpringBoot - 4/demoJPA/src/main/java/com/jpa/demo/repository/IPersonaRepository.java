package com.jpa.demo.repository;

import com.jpa.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //mapeamos como repositorio
/**
 * la interface extiende de JpaRepository (que maneja repositorios JPA)
 * en los parametros <> deben ir: <clase a persistir, tipo de dato del id>
 */
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
