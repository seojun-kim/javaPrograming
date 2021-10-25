package ch08;

import java.util.ArrayList;

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

class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("날아다닌다.");
    }

    public void flying() {
        System.out.println("날개를 피고 난다.");
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

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal animal : animalList) {
            animal.move();
        }

        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> animalList) {

        for(Animal animal : animalList) {

            if(animal instanceof Human) {
                Human human = (Human)animal;
                human.readBook();
            }
            else if(animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }
            else if(animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            }
            else {
                System.out.println("error");
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
