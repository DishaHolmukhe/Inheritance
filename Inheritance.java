// Base class
class Animal {
    // Method in the base class
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Derived class (inherits from Animal)
class Dog extends Animal {
    // Method in the derived class
    public void makeSound() {
        System.out.println("The dog barks");
    }
    
    // Additional method in the derived class
    public void displayBreed() {
        System.out.println("This is a Labrador");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create an object of the derived class
        Dog myDog = new Dog();
        
        // Call methods
        myDog.makeSound();      // Calls the overridden method in Dog class
        myDog.displayBreed();   // Calls method specific to Dog class
    }
}
