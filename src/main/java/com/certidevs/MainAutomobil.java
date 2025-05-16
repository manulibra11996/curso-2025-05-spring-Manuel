package com.certidevs;

import com.certidevs.entities.Automobil;
import com.certidevs.repositories.AutomobilRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class MainAutomobil {

    public static void main(String[] args) {
        // inicializar spring
        ApplicationContext spring = SpringApplication.run(Main.class, args);

        // obtener repositorio (lo crea spring)
        AutomobilRepository automobilRepository = spring.getBean(AutomobilRepository.class);

        // crear automobiles
        Automobil seat = new Automobil("Panda","SEAT",215,25.5,false);
        Automobil ferrari = new Automobil("Enzo","FERRARY",500,100.0,false);
        Automobil ford = new Automobil("Capri","FORD",100,50.0,true);
        Automobil renault = new Automobil("Clio","RENAULT",200,500.0,false);
        Automobil porsche = new Automobil("911","PORSCHE",550,1000.0,false);

        // guardar automobiles
        automobilRepository.save(seat);
        automobilRepository.save(ferrari);
        automobilRepository.save(ford);
        automobilRepository.save(renault);
        automobilRepository.save(porsche);

        //Un método derivado para buscar automóviles con caballos mayor que un valor
        Integer caballosMinimos = 200;
        List<Automobil> automobilesCaballo = automobilRepository.findByCaballosGreaterThan(Integer caballosMinimos);
        for(Automobil automobilCaballos : automobilesCaballo){
            automobilCaballos.toString();
        }

        //Un método derivado para encontrar automóviles por modelo ignorando mayúsculas y minúsculas
        String modeloAutomobil = "PANDA";
        List<Automobil> automobilesModelo =  automobilRepository.findByModeloIgnoreCase(String modeloAutomobil);
        for(Automobil automobilModelos : automobilesModelo){
            automobilModelos.toString();
        }

        //Un método derivado para encontrar automóviles según si son eléctricos o no
        Boolean electricidadAutomobil = Boolean.FALSE;
        List<Automobil> automobilesElectricidad =  automobilRepository.findByElectrico(Boolean electricidadAutomobil);
        for(Automobil automobilElectricos : automobilesElectricidad){
            automobilElectricos.toString();
        }

        //Una consulta JPQL que encuentre todos los automóviles en un rango entre dos precios
        Double precioMenor = 50.0;
        Double precioMayor = 500.0;
        List<Automobil> automobilesPrecio =  automobilRepository.findByPrecioBetween(Double precioMenor, Double precioMayor);
        for(Automobil automobilPrecios : automobilesPrecio){
            automobilPrecios.toString();
        }
    }
}
