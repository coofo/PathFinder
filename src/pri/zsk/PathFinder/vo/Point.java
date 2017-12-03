package pri.zsk.PathFinder.vo;

import java.util.LinkedList;
import java.util.List;

public class Point {
    private String name;
    private List<Load> outLoadList;
    private List<Load> inLoadList;
    private LinkedList<Point> path;

    public String getName() {
        return name;
    }

    public List<Load> getOutLoadList() {
        return outLoadList;
    }

    public List<Load> getInLoadList() {
        return inLoadList;
    }

    public LinkedList<Point> getPath() {
        return path;
    }

    public void setPath(LinkedList<Point> path) {
        this.path = path;
    }
}
