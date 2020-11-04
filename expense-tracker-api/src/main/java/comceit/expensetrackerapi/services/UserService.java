package comceit.expensetrackerapi.services;

import comceit.expensetrackerapi.domains.User;
import comceit.expensetrackerapi.exceptions.EAuthExceptions;

public interface UserService {
                   User validateUser(String email,String password) throws EAuthExceptions;

                   User registerUser(String firstName, String lastName, String email, String password) throws EAuthExceptions;
}
