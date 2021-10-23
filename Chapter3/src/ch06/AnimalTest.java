package ch06;

import java.beans.ConstructorProperties;

class Animal {

    public void move() {
        System.out.println("움직인다");
    }
}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 걷는다");
    }

    public void readBook() {
        System.out.println("책을 읽는다");
    }
}

class Tiger extends Human {

    @Override
    public void move() {
        System.out.println("호랑이 움직인다");
    }

    public void hunting() {
        System.out.println("호랑이 사냥");
    }
}

public class AnimalTest {

    public static void main(String[] args) {


    }
}
