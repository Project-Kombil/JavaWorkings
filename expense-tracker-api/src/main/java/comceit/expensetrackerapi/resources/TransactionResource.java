package comceit.expensetrackerapi.resources;

import comceit.expensetrackerapi.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Class that controls the Rest API used
@RequestMapping("/api/categories/{categoryId}/transactions")
public class TransactionResource {

    @Autowired //To Have Spring Initialize the object
    TransactionService transactionService;

}
