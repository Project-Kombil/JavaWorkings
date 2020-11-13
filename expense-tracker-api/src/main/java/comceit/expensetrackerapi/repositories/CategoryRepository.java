package comceit.expensetrackerapi.repositories;

import comceit.expensetrackerapi.domains.Category;
import comceit.expensetrackerapi.exceptions.EtBadRequestException;
import comceit.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    Integer create (Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

}