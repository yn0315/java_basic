package day19.inter;

public class Person {

    //애완동물들
    Pet[] myPets = {new Dog(), new Cat()};

    //애완동물들과 노는 기능
    public void playWithPets() {
        for (Pet myPet : myPets) {
            myPet.play();
        }
    }

}
