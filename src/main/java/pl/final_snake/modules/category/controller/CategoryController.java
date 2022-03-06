package pl.final_snake.modules.category.controller;

import org.springframework.web.bind.annotation.*;
import pl.final_snake.modules.category.model.Category;
import pl.final_snake.modules.category.service.CategoryService;

import java.util.List;

@RestController
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/category/add")
    public Category addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    @GetMapping("/category")
    public List<Category> allCategories(){
        return categoryService.getCategoryList();
    }

    @GetMapping("/category/{id}")
    public Category showCategory(@PathVariable Long id){
        return categoryService.showCategory(id);
    }

    @GetMapping("/category/{id}/delete")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }

    @PostMapping("/category/{id}/edit")
    public Category editCategory(@RequestBody Category category, @PathVariable Long id){
        return categoryService.editCategory(category);
    }

}
