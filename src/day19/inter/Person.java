package day19.inter;

import java.util.Arrays;

public class Person {

    //애완동물들
    static Pet[] myPets = {new Dog(), new Cat()};

    public Person() {
        playWithPets();
    }

    //애완동물들과 노는 기능
    public void playWithPets() {
        for (Pet myPet : myPets) {
            myPet.play();
        }
    }


}
