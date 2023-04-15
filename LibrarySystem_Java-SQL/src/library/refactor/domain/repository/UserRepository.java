package library.refactor.domain.repository;

import java.util.*;
import library.refactor.domain.model.*;

public interface UserRepository {
    // CRUD
    void addUser(User user);
    
    void updateUser(User user);
    
    void deleteUser(User user);
    
    List<User> findAll();
    
    User findById(int id);
    
    User findByName(String name);
}
