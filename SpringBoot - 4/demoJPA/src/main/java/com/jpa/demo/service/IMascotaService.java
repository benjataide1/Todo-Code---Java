package com.jpa.demo.service;

import com.jpa.demo.model.Mascota;

import java.util.List;

public interface IMascotaService  {

    //get
    public List<Mascota> getMascotas();

    //put
    public void saveMascota(Mascota mascota);

    //delete
    public void deleteMascota(Long id);

    //find
    public Mascota findMascota(Long id);

    //update
    public void editMascota(Long idOriginal, Long idNuevo, String nuevoNombre, String nuevoEspecie, String nuevoRaza, String nuevoColor );
}
