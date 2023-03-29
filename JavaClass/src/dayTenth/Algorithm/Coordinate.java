package dayTenth.Algorithm;

import java.util.*;

public class Coordinate implements Location {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate getCoordinate() {
        return this;
    }

    @Override
    public int getX() {
        return x;
    }

//    @Override
//    public void setX(int x) {
//        this.x = x;
//    }

    @Override
    public int getY() {
        return y;
    }

//    @Override
//    public void setY(int y) {
//        this.y = y;
//    }

    @Override
    public String toString() {
        return "Coordinate [x=" + x + ", y=" + y + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coordinate other = (Coordinate) obj;
        return x == other.x && y == other.y;
    }
}

