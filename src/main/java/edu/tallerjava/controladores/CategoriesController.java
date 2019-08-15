package edu.tallerjava.controladores;

import edu.tallerjava.modelo.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {

    @GetMapping(path = "/categories")
    public ResponseEntity<List<Category>> listarCategorias(){

        ArrayList<Category> lista = new ArrayList<Category>();

        lista.add(new Category(12));
        lista.add(new Category(43));
        lista.add(new Category(45));
        lista.add(new Category(65));
        lista.add(new Category(76));
        lista.add(new Category(87));
        lista.add(new Category(98));
        lista.add(new Category(44));

        return new ResponseEntity(lista, HttpStatus.OK);

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

    @PostMapping(path = "/categories")
    public ResponseEntity<List<Category>> crear(Category categoria){

        categoria.setId((long) 99);
        return new ResponseEntity(categoria, HttpStatus.OK);
    }



    }

