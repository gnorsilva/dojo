package com.gnorsilva;

class Controller {
    private Elevator elevator;

    public Controller(Elevator elevator) {
        this.elevator = elevator;
    }

    public void handle(Request request) {
        if (!elevator.currentFloor().equals(request.floor)) {
            if (elevator.isMoving()) {
                int currentDelta = Math.abs(elevator.currentFloor().value - elevator.nextDestination().value);
                int possibleDelta = Math.abs(elevator.currentFloor().value - request.floor.value);
                if (possibleDelta < currentDelta) {
                    elevator.setNextDestination(request.floor);
                } else {
                    elevator.queueFutureDestination(request.floor);
                }
            } else {
                elevator.queueFutureDestination(request.floor);
            }
        }
    }
}
