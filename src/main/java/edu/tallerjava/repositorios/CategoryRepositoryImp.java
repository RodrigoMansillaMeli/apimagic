package edu.tallerjava.repositorios;

import edu.tallerjava.modelo.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImp implements CategoryRepository{

    private List<Category> categories;

    public CategoryRepositoryImp() {

        categories = new ArrayList<Category>();

        categories.add(new Category(12));
        categories.add(new Category(43));
        categories.add(new Category(45));
        categories.add(new Category(65));
        categories.add(new Category(76));
        categories.add(new Category(87));
        categories.add(new Category(98));
        categories.add(new Category(44));
    }

    @Override
    public List<Category> GetAll() {
        return categories;
    }

    @Override
    public Category GetCategoryById() {
        return null;
    }

    @Override
    public void CreateCategory() {

    }
}
