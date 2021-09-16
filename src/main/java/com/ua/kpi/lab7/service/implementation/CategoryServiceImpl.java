package com.ua.kpi.lab7.service.implementation;

import com.ua.kpi.lab7.entity.Category;
import com.ua.kpi.lab7.repository.CategoryRepository;
import com.ua.kpi.lab7.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepo;

    public CategoryServiceImpl(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Category updateCategoryById(Category category, long id) {
        Category categoryFromDB = categoryRepo.findById(id).orElseThrow(null);
        categoryFromDB.setName(category.getName());
        categoryRepo.save(categoryFromDB);
        return categoryFromDB;
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public Category getCategoryById(long id) {
        return categoryRepo.findById(id).orElseThrow(null);
    }

    @Override
    public void deleteCategoryById(long id) {
        categoryRepo.deleteById(id);
    }
}
