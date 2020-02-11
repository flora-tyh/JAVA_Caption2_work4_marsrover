package com;

public class DirectionW extends Direction {

    public DirectionW(char direction) {
        super(direction);
    }

    @Override
    public Direction turnRight() {
        return (Direction) new DirectionN('N');
    }

    @Override
    public Direction turnLeft() {
        return (Direction) new DirectionS('S');
    }
}
