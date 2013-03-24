package com.gnorsilva;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ControllerShould {

    @Test
    public void not_move_an_idle_elevator_when_the_request_is_from_that_floor() throws Exception {
        Elevator elevator = new Elevator(new Floor(0));
        Controller controller = new Controller(elevator);
        Request request = new Request(new Floor(0), Direction.UP);
        controller.handle(request);
        assertThat(elevator.nextDestinations(), equalTo(floor(0)));
    }

    @Test
    public void send_an_idle_elevator_to_a_floor_where_a_request_happens() throws Exception {
        Elevator elevator = new Elevator(new Floor(4));
        Controller controller = new Controller(elevator);
        Request request = new Request(new Floor(3), Direction.DOWN);
        controller.handle(request);
        assertThat(elevator.nextDestinations(), equalTo(floor(3)));
    }

    @Test
    public void queue_a_destination_floor_when_an_elevator_is_already_moving_to_a_floor() throws Exception {
        Elevator elevator = new Elevator(new Floor(2));
        elevator.queueFutureDestination(new Floor(3));
        Controller controller = new Controller(elevator);
        Request request = new Request(new Floor(4), Direction.DOWN);
        controller.handle(request);
        assertThat(elevator.nextDestinations(), equalTo(floors(3, 4)));
    }

    @Test
    public void send_a_moving_elevator_to_a_requested_floor_first_if_its_on_the_way_to_the_next_destination_floor() throws Exception {
        Elevator elevator = new Elevator(new Floor(5));
        elevator.queueFutureDestination(new Floor(1));
        Controller controller = new Controller(elevator);
        Request request = new Request(new Floor(3), Direction.DOWN);
        controller.handle(request);
        assertThat(elevator.nextDestinations(), equalTo(floors(3, 1)));
    }

    @Test
    public void stop_a_moving_elevator_at_the_current_floor_if_there_is_a_request_from_that_floor() throws Exception {
        Elevator elevator = new Elevator(new Floor(2));
        elevator.queueFutureDestination(new Floor(5));
        Controller controller = new Controller(elevator);
        Request request = new Request(new Floor(2), Direction.DOWN);
        controller.handle(request);
        assertThat(elevator.nextDestinations(), equalTo(floors(2, 5)));
    }

    private List<Floor> floor(int floor) {
        return floors(floor);
    }

    private List<Floor> floors(int ... values) {
        ArrayList<Floor> floors = new ArrayList<Floor>();
        for (int v : values) {
            floors.add(new Floor(v));
        }
        return floors;
    }

}
