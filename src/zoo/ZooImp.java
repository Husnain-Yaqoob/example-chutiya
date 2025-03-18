/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ZooImp implements Zoo {
    // List to store animals in the zoo
    private List<Animal> animals;

    // Constructor to initialize and populate the list with sample animals
    public ZooImp() {
        this.animals = new ArrayList<>();
        animals.add(new Mammal("Lion", 12, 200, "Jungle"));
        animals.add(new Bird("Eagle", 5, 9, "Trees"));
        animals.add(new Fish("Baby Shark", 2, 3, "Ocean"));
    }

    // Method to list all animals in the zoo
    @Override
    public void listAllAnimals() {
        System.out.println("\nListing All Animals: ");
        System.out.println("-----------------------");

        for (Animal animal : animals) {
            System.out.println(animal); // Automatically uses the toString() method of each class
            System.out.println("-----------------------");
        }
    }

    // Method to list the types of animals and their counts
    @Override
    public void listAllTypes() {
        int mammalCount = 0, birdCount = 0, fishCount = 0;

        for (Animal animal : animals) {
            if (animal instanceof Mammal) mammalCount++;
            else if (animal instanceof Bird) birdCount++;
            else if (animal instanceof Fish) fishCount++;
        }

        System.out.println("\nAnimal Types Count: ");
        System.out.println("--------------------");
        System.out.println("Mammals: " + mammalCount);
        System.out.println("Birds: " + birdCount);
        System.out.println("Fish: " + fishCount);
        System.out.println("--------------------\n");
    }

    // Method to add a new animal to the zoo
    @Override
    public void addAnimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter details of the new animal:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Weight: ");
        double weight = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character left by nextDouble()

        System.out.print("Habitat (e.g., Jungle, Ocean): ");
        String habitat = scanner.nextLine();

        System.out.print("Type (Mammal, Bird, Fish): ");
        String type = scanner.nextLine();

        switch (type.toLowerCase()) {
            case "mammal":
                animals.add(new Mammal(name, age, weight, habitat));
                System.out.println("Mammal added successfully!");
                break;
            case "bird":
                animals.add(new Bird(name, age, weight, habitat));
                System.out.println("Bird added successfully!");
                break;
            case "fish":
                animals.add(new Fish(name, age, weight, habitat));
                System.out.println("Fish added successfully!");
                break;
            default:
                System.out.println("Invalid animal type. Animal not added.");
        }
    }

    // Method to get a random animal from the zoo
    @Override
    public void getRandom() {
        if (animals.isEmpty()) {
            System.out.println("The zoo is empty. No animals to display.");
            return;
        }

        Random random = new Random();
        int index = random.nextInt(animals.size()); // Random index within the list size
        Animal animal = animals.get(index);

        System.out.println("\nRandom Animal: ");
        System.out.println("-----------------------");
        System.out.println(animal); // Automatically uses the toString() method
        System.out.println("-----------------------");
    }

    // Getter for the animals list (used in other parts of the program if necessary)
    public List<Animal> getAnimals() {
        return animals;
}
