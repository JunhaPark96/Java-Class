package library.refactor.data;

import java.util.*;
import library.refactor.domain.model.*;
import library.refactor.domain.repository.*;

public class UserRepositoryImpl implements UserRepository {
    private DataDAO<User> data;
    private List<User> users = new ArrayList<>();

    public UserRepositoryImpl() {

    }

    public UserRepositoryImpl(DataDAO<User> data) {
        this.data = data;
    }

    @Override
    public void addUser(User user) {
        int index = -1;
        for (int i = 0; i < users.size(); i++) {
            User e = users.get(i);
            if (e.getId() == user.getId()) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            users.add(user);
            if (data != null) {
                data.save(users);
            }
        } else {
            users.set(index, user);
            if (data != null) {
                data.save(users);
            }
        }
        
    }

    @Override
    public void updateUser(User user) {
        int index = 0;
        for (int i = 0; i < users.size(); i++) {
            User e = users.get(i);
            if (e.getId() == user.getId()) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            users.set(index, user);
            if (data != null) {
                data.save(users);
            }
        }
    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
        if (data != null) {
            data.save(users);
        }
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(int id) {
        User user = null;
        for (int i = 0; i < users.size(); i++) {
            user = users.get(i);
            if (user.getId() == id) {
                break;
            }
        }
        return user;
    }

    @Override
    public User findByName(String name) {
        User user = null;
        for (int i = 0; i < users.size(); i++) {
            user = users.get(i);
            if (user.getName().equals(name)) {
                break;
            }
        }
        return user;
    }


}
