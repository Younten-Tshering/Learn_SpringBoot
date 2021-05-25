package com.example.DesignPatterns.state;

public interface State {
    void increaseDefense(int increment);

    void speedUp(int increment);

    void increaseAttack(int increment);

    void printStates();

}
