package patterns.state.b_gumballState.context;

import patterns.state.b_gumballState.state.*;

public class GumballMachine {
    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;

    private State state;
    private int count;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        state = hasGumballs()
                ? noQuarterState
                : soldOutState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (hasGumballs()) {
            count--;
        }
    }

    public boolean hasGumballs() {
        return count > 0;
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
        state.refill();
    }

    public void setNoQuarterState() {
        this.state = noQuarterState;
    }

    public void setSoldOutState() {
        this.state = soldOutState;
    }

    public void setHasQuarterState() {
        this.state = hasQuarterState;
    }

    public void setSoldState() {
        this.state = soldState;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: ").append(count).append(" gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ").append(state).append("\n");
        return result.toString();
    }
}
