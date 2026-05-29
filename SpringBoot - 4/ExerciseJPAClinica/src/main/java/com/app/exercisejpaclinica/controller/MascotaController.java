package com.app.exercisejpaclinica.controller;

import com.app.exercisejpaclinica.dto.MascoDueDTO;
import com.app.exercisejpaclinica.model.Mascota;
import com.app.exercisejpaclinica.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    MascotaService mascotaService;

    //GET
    @GetMapping("/mascotas")
    public List<Mascota> findAllMascotas() {
       return mascotaService.findAllMascotas();
    }

    @GetMapping("/mascota/perroCaniche")
    public List<Mascota> findEspecie(){
        List<Mascota> mascotas = mascotaService.findAllMascotas();
        List<Mascota> nuevamascotas = new ArrayList();

        for(Mascota mascota : mascotas){
            if(mascota.getEspecie().equalsIgnoreCase("perro") && mascota.getRaza().equalsIgnoreCase("caniche")){
                nuevamascotas.add(mascota);
            }
        }
        return nuevamascotas;

    }

    @GetMapping("mascota/dto")
    public List<MascoDueDTO> getMix(){
       List<Mascota> mascotas = this.findAllMascotas();
       List<MascoDueDTO> mascoDueDTOS = new ArrayList<>();

       for(Mascota mascota : mascotas){
           MascoDueDTO mascoDueDTO = new MascoDueDTO();

           mascoDueDTO.setNombre_mascota(mascota.getNombre());
           mascoDueDTO.setEspecie(mascota.getEspecie());
           mascoDueDTO.setRaza(mascota.getRaza());
           mascoDueDTO.setNombre_duenio(mascota.getUnDuenio().getNombre());
           mascoDueDTO.setApellido_duenio(mascota.getUnDuenio().getApellido());

           mascoDueDTOS.add(mascoDueDTO);
       }
       return mascoDueDTOS;
    }

    //CREATE
    @PostMapping("/mascota/create")
    public String createMascota(@RequestBody Mascota mascota) {
        return mascotaService.saveMascota(mascota);
    }

    //DELETE
    @DeleteMapping("/mascota/delete/{id}")
    public String deleteMascota(@PathVariable Long id) {
        return  mascotaService.deleteMascota(id);
    }

    //FIND
    @GetMapping("/mascota/find/{id}")
    public Mascota findMascotaById(@PathVariable Long id) {
        return mascotaService.findMascotaById(id);
    }

    //UPDATE
    @PutMapping("/mascota/update")
    public Mascota updateMascota(@RequestBody Mascota mascota) {
        return mascotaService.updateMascota(mascota);
    }
}
