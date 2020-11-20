package comceit.expensetrackerapi.resources;

import comceit.expensetrackerapi.domains.Category;
import comceit.expensetrackerapi.domains.Transaction;
import comceit.expensetrackerapi.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //Class that controls the Rest API used
@RequestMapping("/api/categories/{category_id}/transactions")
public class TransactionResource {

    @Autowired //To Have Spring Initialize the object
    TransactionService transactionService;

    @PostMapping("")
    public ResponseEntity<Transaction> addTransaction(HttpServletRequest request, @PathVariable("category_id") Integer categoryId, @RequestBody Map<String, Object> transactionMap) {
        int userId = (Integer) request.getAttribute("userId");
        double amount = Double.parseDouble(transactionMap.get("amount").toString());
        String note = (String) transactionMap.get("note");
        Long transactionDate = (Long) transactionMap.get("transactionDate");
        Transaction transaction = transactionService.addTransaction(userId, categoryId, amount, note, transactionDate);

        return new ResponseEntity<>(transaction, HttpStatus.CREATED);
    }

    @GetMapping("/{transaction_id}")
    public ResponseEntity<Transaction> getCategoryById(
            HttpServletRequest request, @PathVariable("category_id") Integer categoryId, @PathVariable("transaction_id") Integer transactionId) {
        int userId = (Integer) request.getAttribute("userId");
        Transaction transaction = transactionService.fetchTransactionById(userId, categoryId, transactionId);

        return new ResponseEntity<>(transaction, HttpStatus.OK);

    }

    @GetMapping("")
    public ResponseEntity<List<Transaction>> getAllTransactions(HttpServletRequest request, @PathVariable("category_id") Integer categoryId) {
        int userId = (Integer) request.getAttribute("userId");
        List<Transaction> transaction = transactionService.fetchAllTransaction(userId, categoryId);
        return new ResponseEntity<>(transaction, HttpStatus.OK);
    }

    @PutMapping("/{transaction_id}")
    public ResponseEntity<Map<String, Boolean>> updateTransaction(
            HttpServletRequest request,
            @PathVariable("category_id") Integer categoryId,
            @PathVariable("transaction_id")  Integer transactionId,
            @RequestBody Transaction transaction
    ){
        int userId = (Integer) request.getAttribute("userId");
        transactionService.updateTransaction(userId, categoryId, transactionId, transaction);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Success", true);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{transaction_id}")
    public ResponseEntity<Map<String,Boolean>> deleteTransaction(
            HttpServletRequest request,
            @PathVariable("category_id") Integer categoryId,
            @PathVariable("transaction_id") Integer transactionId
            ){
        int userId = (Integer) request.getAttribute("userId");
        transactionService.removeTransaction(userId,categoryId, transactionId);
        Map<String, Boolean> response = new HashMap<>();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

}