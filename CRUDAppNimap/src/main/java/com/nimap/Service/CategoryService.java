package com.nimap.Service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.nimap.Model.Category;
import com.nimap.Repository.CategoryRepo;



@Service
public class CategoryService {
    @Autowired 
    private CategoryRepo categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    } 

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    
    
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

   
    public List<Category> getAllCategories(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Category> categoryPage = categoryRepository.findAll(pageable);
        return categoryPage.getContent();
    }
}

