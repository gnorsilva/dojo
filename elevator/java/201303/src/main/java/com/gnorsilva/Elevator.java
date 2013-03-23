package com.gnorsilva;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private final List<Integer> nextDestinations = new ArrayList<Integer>();

    private int currentFloor;

    public Elevator(int floor) {
        this.currentFloor = floor;
    }

    public int currentFloor() {
        return currentFloor;
    }

    public List<Integer> nextDestinations() {
        return nextDestinations;
    }

    public int nextDestination() {
        return nextDestinations.get(0);
    }

    public void queueFutureDestination(int floor) {
        nextDestinations.add(floor);
    }

    public void setNextDestination(int floor) {
        nextDestinations.add(0,floor);
    }

    public boolean isMoving() {
        return nextDestinations.size() > 0;
    }
}
