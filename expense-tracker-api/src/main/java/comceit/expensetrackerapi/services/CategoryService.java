package comceit.expensetrackerapi.services;

import comceit.expensetrackerapi.domains.Category;
import comceit.expensetrackerapi.exceptions.EtBadRequestException;
import comceit.expensetrackerapi.exceptions.EtResourceNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryService {
        List<Category> fetchAllCategories(Integer userId) throws EtResourceNotFoundException;

        Category fetchCategoryById(Integer categoryId, Integer userId) throws EtBadRequestException;

        Category addCategory(Integer userId,String title, String description) throws EtBadRequestException;

        void updateCategory(Integer userId, Integer CategoryId, Category category) throws EtBadRequestException;

        void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    }

