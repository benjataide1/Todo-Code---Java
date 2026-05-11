package com.app.multicapas.service;

import com.app.multicapas.model.Persona;

import java.util.List;

public interface IPersonaService {

  public abstract void createPersona(Persona persona);

   public abstract List<Persona> readAllPersonas();
}
