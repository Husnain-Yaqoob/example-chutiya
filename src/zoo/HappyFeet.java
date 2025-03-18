/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author hasan
 */

 
public class HappyFeet extends Habitat {
    private int temperature;

    // Constructor
    public HappyFeet(HabitatType habitatType, int temperature) {
        super(habitatType);
        this.temperature = temperature;
    }

    // Getter and setter
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void penguinParade() {
        System.out.println("Penguins are parading in the habitat with temperature: " + temperature + "°C");
    }
}


