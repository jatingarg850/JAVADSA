class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }

    void sound(String type) {
        System.out.println("Animal makes a " + type + " sound");
    }
}

class Dog extends Animal {
    
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
  
    void sound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Dog barks");
        }
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound(); 
        a.sound("generic"); 

        Dog d = new Dog();
        d.sound(); 
        d.sound("loud"); 
        d.sound(2); 
    }
}
