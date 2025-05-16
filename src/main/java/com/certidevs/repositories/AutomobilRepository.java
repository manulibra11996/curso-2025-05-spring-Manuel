package com.certidevs.repositories;

import com.certidevs.entities.Automobil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AutomobilRepository extends JpaRepository<Automobil, Long> {


    //Un método derivado para buscar automóviles con caballos mayor que un valor
    List<Automobil> findByCaballosGreaterThan(Integer caballosMinimos);

    //Un método derivado para encontrar automóviles por modelo ignorando mayúsculas y minúsculas
    List<Automobil> findByModeloIgnoreCase(String modelo);


    //Un método derivado para encontrar automóviles según si son eléctricos o no
    List<Automobil> findByElectrico(Boolean electrico);


    //Una consulta JPQL que encuentre todos los automóviles en un rango entre dos precios
    @Query("select a from Automobil a where a.precio between ?1 and ?2")
    List<Automobil> findByPrecioBetween(Double precioMenor, Double precioMayor);


}
