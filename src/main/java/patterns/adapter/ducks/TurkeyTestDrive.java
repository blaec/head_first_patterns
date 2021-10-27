package patterns.adapter.ducks;

import patterns.adapter.ducks.turkey.DuckAdapter;
import patterns.adapter.ducks.duck.MallardDuck;
import patterns.adapter.ducks.turkey.Turkey;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for (int i = 0; i < 10; i++) {
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
