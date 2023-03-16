package dayNineth;

import java.util.*;

public class Student implements Comparable<Student>{
    private String name;
    private int id;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return Objects.equals(name, other.name);
    }

//    @Override
//    public int compareTo(Student o) {
//        return (id < o.id) ? -1 : ( (id == o.id) ? 0 : 1  );
//    }
    
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
    
    
}
