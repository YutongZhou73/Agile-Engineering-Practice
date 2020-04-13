package edu.berkeley.aep;

import java.util.*;

// Understands whether it is possible to travel between two cities
public class City {

    public static final int UNREACHABLE = -1;
    private List<City> children = new ArrayList<City>();

    public boolean canReach(City destination) {
        return hopsTo(destination, new HashSet<>()) != UNREACHABLE;
    }

//    public boolean canReach(City destination, Set<City> visited) {
//        if (this == destination) return true;
//        if (visited.contains(this)) return false;
//        visited.add(this);
//        for (var child: children) {
//            if (child.canReach(destination, visited)) return true;
//        }
//        return false;
//    }

    public void addChild(City other) {
        children.add(other);
    }

    public int hopsTo(City destination) {
        return hopsTo(destination, new HashSet<>());
    }

    public int hopsTo(City destination, Set<City> visited) {
        if (this == destination) return 0;
        if (visited.contains(this)) return UNREACHABLE;
        visited.add(this);
        for (var child: children) {
            var hops = (child.hopsTo(destination, visited));
            if (hops != UNREACHABLE) return hops + 1;
        }
        return UNREACHABLE;
    }

    public int minHopsTo(City destination) {
        if (this == destination) return 0;
        Set<City> visited = new HashSet<>();
        LinkedList<City> queue = new LinkedList<>();
        int hops = 0;
        visited.add(this);
        queue.add(this);

        while(!queue.isEmpty()) {
            City currCity = queue.poll();
            hops = hops + 1;
            for (var child: currCity.children) {
                if(!visited.contains(child)){
                    queue.add(child);
                    visited.add(child);
                }
                if (child == destination) {
                    return hops;
                }
            }
        }
        return UNREACHABLE;
    }
}
