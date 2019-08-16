package edu.tallerjava.Services;

import edu.tallerjava.modelo.Category;

import java.security.PublicKey;
import java.util.List;

public interface CategoryService {

    List<Category> GetAll();
    Category GetCategoryById();
    void CreateCategory();
}
