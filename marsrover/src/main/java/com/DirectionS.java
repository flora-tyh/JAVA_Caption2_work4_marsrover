package com;

public class DirectionS extends Direction {

    public DirectionS(char direction) {
        super(direction);
    }

    @Override
    public Direction turnRight() {
        return (Direction) new DirectionW('W');
    }

    @Override
    public Direction turnLeft() {
        return (Direction) new DirectionE('E');
    }
}
