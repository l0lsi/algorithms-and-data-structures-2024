package ru.mirea.practice.s0000001.task1;

class Const extends Expression {
    private int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(int x) {
        return value;
    }
}
