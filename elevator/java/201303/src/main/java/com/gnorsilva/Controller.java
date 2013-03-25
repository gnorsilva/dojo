package com.gnorsilva;

class Controller {
    private Elevator elevator;

    public Controller(Elevator elevator) {
        this.elevator = elevator;
    }

    public void handle(Request request) {
        if ((elevator.currentFloor().equals(request.floor) && elevator.isStopped()) ||
            (elevator.isMoving() && nextDestinationDirectionMatches(request.direction))) {

            elevator.setNextDestination(request.floor);
        } else {
            elevator.queueFutureDestination(request.floor);
        }
    }

    private boolean nextDestinationDirectionMatches(Direction direction) {
        Floor current = elevator.currentFloor();
        Floor next = elevator.nextDestination();
        if (direction == Direction.DOWN) {
            return current.isAbove(next);
        } else {
            return current.isBelow(next);
        }
    }
}
