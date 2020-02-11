package com;

public class DirectionE extends Direction {

    public DirectionE(char direction) {
        super(direction);
    }

    @Override
    public Direction turnRight() {
        return (Direction) new DirectionS('S');
    }

    @Override
    public Direction turnLeft() {
        return (Direction) new DirectionN('N');
    }
}
