package comceit.expensetrackerapi.resources;

import comceit.expensetrackerapi.domains.Category;
import comceit.expensetrackerapi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/categories")
public class CategoryResource {

    @Autowired
    CategoryService categoryService;

    @PostMapping("")
    public ResponseEntity<Category> addCategory(HttpServletRequest request,
                                                @RequestBody Map<String,Object> categoryMap
    ){

        int userId = (Integer) request.getAttribute("userId");

        String title = (String) categoryMap.get("title");
        String description = (String) categoryMap.get("description");

        Category category = categoryService.addCategory(userId, title, description);

        return new ResponseEntity<>(category, HttpStatus.CREATED);

    }
    @GetMapping("/{category_id}")
    public ResponseEntity<Category> getCategoryById(
            HttpServletRequest request, @PathVariable("category_id")Integer category_id){
        int userId = (Integer)request.getAttribute("userId");
        Category category = categoryService.fetchCategoryById(category_id, userId);

        return new ResponseEntity<>(category, HttpStatus.OK);

    }

    @GetMapping("")
    public ResponseEntity<List<Category>> getAllCategories(HttpServletRequest request){
        int userId = (Integer) request.getAttribute("userId");
        List<Category> categories = categoryService.fetchAllCategories(userId);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
    @PutMapping("/{category_id}")
    public ResponseEntity<Map<String, Boolean>> updateCategory(
            HttpServletRequest request, @PathVariable("category_id")
            Integer categoryId,
            @RequestBody Category category
    ){
        int userId = (Integer) request.getAttribute("userId");
        categoryService.updateCategory(userId, categoryId,category);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Success", true);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}