package edu.tallerjava.Services;

import edu.tallerjava.modelo.Category;
import edu.tallerjava.repositorios.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> GetAll() {
        return categoryRepository.GetAll();
    }

    @Override
    public Category GetCategoryById() {
        return null;
    }

    @Override
    public void CreateCategory() {

    }
}
