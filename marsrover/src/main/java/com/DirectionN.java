package com;

public class DirectionN extends Direction {

    public DirectionN(char direction) {
        super(direction);
    }

    @Override
    public Direction turnRight() {
        return (Direction) new DirectionE('E');
    }

    @Override
    public Direction turnLeft() {
        return (Direction) new DirectionW('W');
    }
}
