public class animal2 {
    void move(){
        System.out.println("Animal is moving");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends animal2 {
    @Override void move(){
        System.out.println("Dog is running ");
        
    }
    void bark(){
        System.out.println("Dog is barking");
    }

}
class Main {
    public static void main(String[] args) {
        animal2 myAnimal = new animal2();
        myAnimal.move();
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.move();
        myDog.eat();
        myDog.bark();
    }
}