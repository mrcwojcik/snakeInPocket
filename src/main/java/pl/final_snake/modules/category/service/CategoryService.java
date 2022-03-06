package pl.final_snake.modules.category.service;

import pl.final_snake.modules.category.model.Category;

import java.util.List;

public interface CategoryService {

    Category addCategory(Category category);
    void deleteCategory(Long id);
    Category editCategory(Category category);
    Category showCategory(Long id);
    List<Category> getCategoryList();

}
