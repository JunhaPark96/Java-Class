package dayTenth.Algorithm;

import java.util.*;

public class Tree<T extends Location> implements Location{
    private T location;


    public Tree(T location) {
        this.location = location;
    }


    public T getLocation() {
        return location;
    }

    public void setLocation(T location) {
        this.location = location;
    }
    @Override
    public int getX() {
        return location.getX();
    }

    @Override
    public void setX(int x) {
        location.setX(x);
    }

    @Override
    public int getY() {
        return location.getY();
    }

    @Override
    public void setY(int y) {
        location.setY(y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tree other = (Tree) obj;
        return Objects.equals(location, other.location);
    }


    @Override
    public String toString() {
        return "Tree [location=" + location + "]";
    }



}
