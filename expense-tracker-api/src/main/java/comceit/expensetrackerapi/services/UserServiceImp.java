package comceit.expensetrackerapi.services;

import comceit.expensetrackerapi.domains.User;
import comceit.expensetrackerapi.exceptions.EAuthExceptions;
import comceit.expensetrackerapi.repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImp implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public User validateUser(String email, String password) throws EAuthExceptions {
        if(email!=null)
            email = email.toLowerCase();

        User user  = userRepository.findByEmailAndPassword(email,password);
        if(BCrypt.checkpw(password,user.getPassword()))
            return user;
        else
            throw  new EAuthExceptions("Wrong Password");
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EAuthExceptions {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if(email != null){
            email = email.toLowerCase();
            //Checking if the email in correct pattern
            if(!pattern.matcher(email).matches())
                throw new EAuthExceptions("Invalid Email Format");
            //Checking if the email already exists
            Integer count = userRepository.getCountByEmail(email);
            if(count > 0) throw new EAuthExceptions("Email Already in Use");
            //We can register the user using the create api
            Integer userId = userRepository.create(firstName,lastName,email,password);
            //return the User object from the database
            return userRepository.findById(userId);
        }
        return null;
    }
}
