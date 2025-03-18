/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author Lecturer
 */
public abstract class Animal {
    
    // Create some attributes 
    
    private String name;
    private int age;
    private double weight;
    private String habitat;
    private String behavior; 
    private String hungerStatus; 
    private String healthStatus;
    
    
//    / The constructor is our point of reference when communicating with this class
    public Animal(String name, int age, double weight, String habitat){
    
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.habitat = habitat;
            this.behavior = "unknown";
            this.hungerStatus = "Hungry"; 
            this.healthStatus = "Healthy";
            
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getHungerStatus() {
        return hungerStatus;
    }

    public void setHungerStatus(String hungerStatus) {
        this.hungerStatus = hungerStatus;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return name + ", " + age + ", " + weight + "kg, " + habitat + 
               ", Behavior: " + behavior + 
               ", Hunger Status: " + hungerStatus + 
               ", Health Status: " + healthStatus;
    
    
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    

