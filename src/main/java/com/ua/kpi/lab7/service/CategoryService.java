package com.ua.kpi.lab7.service;

import com.ua.kpi.lab7.entity.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(Category category);

    Category updateCategoryById(Category category, long id);

    List<Category> getCategories();

    Category getCategoryById(long id);

    void deleteCategoryById(long id);
}
