package comceit.expensetrackerapi.services;

import comceit.expensetrackerapi.domains.Category;
import comceit.expensetrackerapi.exceptions.EtBadRequestException;
import comceit.expensetrackerapi.exceptions.EtResourceNotFoundException;
import comceit.expensetrackerapi.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> fetchAllCategories(Integer userId) throws EtResourceNotFoundException {
        return categoryRepository.findAll(userId);
    }

    @Override
    public Category fetchCategoryById(Integer categoryId, Integer userId) throws EtBadRequestException {
        return categoryRepository.findById(userId, categoryId);
    }

    @Override
    public Category addCategory(Integer userId, String title, String description) throws EtBadRequestException {

        int categoryId = categoryRepository.create(userId, title, description);

        return new Category(categoryId, userId, title, description,0.0);
    }

    @Override
    public void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException {
        Category oldCategory = categoryRepository.findById(userId, categoryId);
        if(oldCategory != null)
        categoryRepository.update(userId, categoryId, category);
        else
            throw new EtResourceNotFoundException("Category Not Found");
    }

    @Override
    public void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException {

    }
}
