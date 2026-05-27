package com.jpa.demo.repository;

import com.jpa.demo.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository  extends JpaRepository<Mascota, Long> {
}
