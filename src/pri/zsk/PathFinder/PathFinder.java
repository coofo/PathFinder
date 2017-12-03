package pri.zsk.PathFinder;

import pri.zsk.PathFinder.vo.Load;
import pri.zsk.PathFinder.vo.Point;

import java.util.*;

public class PathFinder {
    private long now = 0;
    private LinkedList<Point> nextPoint = new LinkedList<>();

    public List<Point> findByJump(Point begin, Point end) {
        nextPoint.add(begin);
        begin.setPath(new LinkedList<>());

        while (!nextPoint.isEmpty()) {
            Point point = nextPoint.getFirst();
            if (end.equals(point)) {
                LinkedList<Point> path = point.getPath();
                path.addLast(point);
                return path;
            }

            for (Load load : point.getOutLoadList()) {
                if (load.getEndPoing().getPath() != null) {

                    continue;
                }
                @SuppressWarnings("unchecked")
                LinkedList<Point> path = (LinkedList<Point>) point.getPath().clone();
                path.addLast(point);
                load.getEndPoing().setPath(path);
                nextPoint.addLast(point);
            }
        }
        return null;
    }
}
