//Write a Java program to create a class called Animal with a method called makeSound().
//Create a subclass called Cat that overrides the makeSound() method to bark.

class InheritanceAnimal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends InheritanceAnimal {
    @Override
    public void makeSound() {
        System.out.println("Cat barks");
    }
}

class Main {
    public static void main(String[] args) {
        InheritanceAnimal genericAnimal = new InheritanceAnimal();
        Cat cat = new Cat();

        genericAnimal.makeSound(); // Output: Animal makes a sound
        cat.makeSound();           // Output: Cat barks
    }
}
