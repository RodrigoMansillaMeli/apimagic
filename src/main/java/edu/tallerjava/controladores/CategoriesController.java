package edu.tallerjava.controladores;

import edu.tallerjava.Services.CategoryService;
import edu.tallerjava.modelo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(path = "/categories")
    public ResponseEntity<List<Category>> listarCategorias(){
        return new ResponseEntity(categoryService.GetAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/categories/{id}")
    public ResponseEntity obtenerCategoria(@PathVariable String id) {

        return new ResponseEntity(categoryService.GetCategoryById(Long.parseLong(id)),HttpStatus.OK);
    }

    @PostMapping(path = "/categories")
    public ResponseEntity<List<Category>> crear(Category categoria){

        return new ResponseEntity(categoryService.CreateCategory(categoria), HttpStatus.OK);
    }



    }

