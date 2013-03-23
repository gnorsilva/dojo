package com.gnorsilva;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private final List<Floor> nextDestinations = new ArrayList<Floor>();

    private Floor currentFloor;

    public Elevator(Floor floor) {
        this.currentFloor = floor;
    }

    public Floor currentFloor() {
        return currentFloor;
    }

    public List<Floor> nextDestinations() {
        return nextDestinations;
    }

    public Floor nextDestination() {
        return nextDestinations.get(0);
    }

    public void queueFutureDestination(Floor floor) {
        nextDestinations.add(floor);
    }

    public void setNextDestination(Floor floor) {
        nextDestinations.add(0,floor);
    }

    public boolean isMoving() {
        return nextDestinations.size() > 0;
    }
}
