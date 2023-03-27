package dayTenth.Algorithm;

import java.util.*;

public class Tree {
    private Location location;

    public Tree(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
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
