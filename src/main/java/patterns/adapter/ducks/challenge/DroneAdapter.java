package patterns.adapter.ducks.challenge;

import patterns.adapter.ducks.duck.Duck;

public class DroneAdapter implements Duck {
    Drone drone;

    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void quack() {
        drone.beep();
    }

    @Override
    public void fly() {
        drone.spin_rotors();
        drone.take_off();
    }
}
