package pl.final_snake.modules.category.service;

import org.springframework.stereotype.Service;
import pl.final_snake.modules.category.model.Category;
import pl.final_snake.modules.category.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.delete(categoryRepository.getById(id));
    }

    @Override
    public Category editCategory(Category category) {
        Category catFromDb = categoryRepository.getById(category.getId());
        catFromDb.setCategoryName(category.getCategoryName());
        return categoryRepository.save(catFromDb);
    }

    @Override
    public Category showCategory(Long id) {
        return categoryRepository.getById(id);
    }

    @Override
    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }
}
