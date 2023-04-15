package library.refactor.data;

import java.io.*;
import java.util.*;
import library.refactor.domain.model.*;

public class UserDBData implements DataDAO<User> {
    private String filePath = "C:\\Users\\JUNHA\\eclipse-workspace\\JavaClass\\userInfo.csv";
    
    @Override
    public void save(List<User> users) {
        
    }

    @Override
    public List<User> load() {
        return null;
    }

    @Override
    public void backup() {
        // TODO Auto-generated method stub

    }

}
