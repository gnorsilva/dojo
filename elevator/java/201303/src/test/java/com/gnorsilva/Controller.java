package com.gnorsilva;

class Controller {
    private Elevator elevator;

    public Controller(Elevator elevator) {
        this.elevator = elevator;
    }

    public void handle(Request request) {
        if (elevator.currentFloor() != request.floor) {
            if (elevator.isMoving()) {
                int currentDelta = Math.abs(elevator.currentFloor() - elevator.nextDestination());
                int possibleDelta = Math.abs(elevator.currentFloor() - request.floor);
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
