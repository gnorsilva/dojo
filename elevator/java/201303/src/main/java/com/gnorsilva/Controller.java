package com.gnorsilva;

class Controller {
    private Elevator elevator;

    public Controller(Elevator elevator) {
        this.elevator = elevator;
    }

    public void handle(Request request) {
        if (elevator.currentFloor().equals(request.floor) && canStopAtCurrentFloor(request) ||
            (elevator.isMoving() && request.floor.isBetween(elevator.currentFloor(), elevator.nextDestination()))) {

            elevator.setNextDestination(request.floor);
        } else {
            elevator.queueFutureDestination(request.floor);
        }
    }

    private boolean canStopAtCurrentFloor(Request request) {
        return (elevator.isStopped() || nextDestinationDirectionMatches(request.direction));
    }

    private boolean nextDestinationDirectionMatches(Direction direction) {
        if (direction == Direction.DOWN) {
            return elevator.currentFloor().isAbove(elevator.nextDestination());
        } else {
            return elevator.currentFloor().isBelow(elevator.nextDestination());
        }
    }
}
