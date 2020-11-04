package comceit.expensetrackerapi.repositories;

import comceit.expensetrackerapi.domains.User;
import comceit.expensetrackerapi.exceptions.EAuthExceptions;

public interface UserRepository {

    Integer create (String firstName, String lastName, String email, String password) throws EAuthExceptions;

    User findByEmailAndPassword(String email, String password) throws EAuthExceptions;

    Integer getCountByEmail(String email);

    User findById (Integer userId);
}
