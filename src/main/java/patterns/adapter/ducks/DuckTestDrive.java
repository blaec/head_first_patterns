package patterns.adapter.ducks;

import patterns.adapter.ducks.challenge.Drone;
import patterns.adapter.ducks.challenge.DroneAdapter;
import patterns.adapter.ducks.challenge.SuperDrone;
import patterns.adapter.ducks.duck.Duck;
import patterns.adapter.ducks.duck.MallardDuck;
import patterns.adapter.ducks.turkey.Turkey;
import patterns.adapter.ducks.turkey.WildTurkey;
import patterns.adapter.ducks.duck.TurkeyAdapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        // Challenge
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
