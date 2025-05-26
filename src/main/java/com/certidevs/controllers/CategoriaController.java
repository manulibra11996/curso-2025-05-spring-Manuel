package com.certidevs.controllers;

import com.certidevs.entities.Categoria;
import com.certidevs.repositories.CategoriaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoriaController {

    private CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    // anotación que mapea las peticiones GET a la URL "/categoria"
    @GetMapping("/categoria") // http://localhost:8080/categoria
    public String findAll(Model model) {
        // crear una lista con todos los categoria
        List<Categoria> categoria = categoriaRepository.findAll();
        model.addAttribute("categoria", categoria);

        return "categoria-list";
    }

}
