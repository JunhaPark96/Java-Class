package dayTenth;

import java.util.*;

public class Pocket<E>{
    private E data;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Pocket(E data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pocket other = (Pocket) obj;
        return Objects.equals(data, other.data);
    }

    @Override
    public String toString() {
        return "Pocket [data=" + data + "]";
    }
    
//    public void put(E data) {
//        this.data = data;
//    }
//    
//    public E get() {
//        return this.data;
//    }
    
    
}
