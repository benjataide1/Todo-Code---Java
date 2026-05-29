package com.app.exercisejpaclinica.service;

import com.app.exercisejpaclinica.model.Mascota;

import java.util.List;

public interface IMascotaService {

    public List<Mascota> findAllMascotas();

    public String  saveMascota(Mascota mascota);

    public String  deleteMascota(Long id);

    public Mascota findMascotaById(Long id);

    public Mascota updateMascota(Mascota mascota);

}
