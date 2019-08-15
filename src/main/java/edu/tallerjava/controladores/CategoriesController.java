package edu.tallerjava.controladores;

import edu.tallerjava.modelo.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CategoriesController {

    @GetMapping(path = "/categories")
    public ArrayList<Category> listarCategorias(){

        ArrayList<Category> lista = new ArrayList<Category>();

        lista.add(new Category(12));
        lista.add(new Category(43));
        lista.add(new Category(45));
        lista.add(new Category(65));
        lista.add(new Category(76));
        lista.add(new Category(87));
        lista.add(new Category(98));
        lista.add(new Category(44));

        return lista;

    }

    @GetMapping(path = "/categories/{id}")
    public Category obtenerCategoria(@PathVariable String id) {
        ArrayList<Category> lista = new ArrayList<Category>();

        lista.add(new Category(12));
        lista.add(new Category(43));
        lista.add(new Category(45));
        lista.add(new Category(65));
        lista.add(new Category(76));
        lista.add(new Category(87));
        lista.add(new Category(98));
        lista.add(new Category(44));


    return lista.stream().filter(x-> x.getId() == Long.parseLong(id)).findFirst().get();
    }




    }

