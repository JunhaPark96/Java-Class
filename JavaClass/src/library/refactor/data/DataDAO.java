package library.refactor.data;

import java.util.*;

public interface DataDAO<T> {
    void save(List<T> items);
    
    List<T> load();
    
    void backup();
}
