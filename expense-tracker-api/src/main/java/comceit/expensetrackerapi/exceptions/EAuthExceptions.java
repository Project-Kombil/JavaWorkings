package comceit.expensetrackerapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class EAuthExceptions extends RuntimeException{

    public EAuthExceptions (String message){
        super(message);
    }

}
