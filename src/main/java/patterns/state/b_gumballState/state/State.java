package patterns.state.b_gumballState.state;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}
