/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author hasan
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a Habitat.
 */
public class Habitat {
    private List<Animal> animalList;
    private HabitatType habitatType;

    // Constructor
    public Habitat(HabitatType habitatType) {
        this.habitatType = habitatType;
        this.animalList = new ArrayList<>();
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public HabitatType getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(HabitatType habitatType) {
        this.habitatType = habitatType;
    }

  

    // Methods
    public void addAnimal(Animal animal) {
        animalList.add(animal);
        animal.setHabitat(this);
        System.out.println("Animal added to habitat: " + animal.getName());
    }

    public void removeAnimal(Animal animal) {
        if (animalList.remove(animal)) {
            animal.setHabitat(null);
            System.out.println("Animal removed from habitat: " + animal.getName());
        } else {
            System.out.println("Animal not in this habitat " + animal.getName());
        }
    }

    public void moveAnimal(Animal animal, Habitat destinationHabitat) {
        if (animalList.remove(animal)) {
            animal.setHabitat(destinationHabitat);
            destinationHabitat.addAnimal(animal);
            System.out.println("Animal moved to new habitat: " + animal.getName());
        } else {
            System.out.println("Animal not found in this habitat: " + animal.getName());
        }
    }

    public void cleanHabitat() {
        System.out.println("Cleaning habitat of type: " + habitatType);
    }
}

