/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasrepaso;

/**
 *
 * @author alejo
 */
public class Figurasrepaso {

    private final double base;
    private final double altura;

    public Figurasrepaso(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double areatriangulo () {
        return ((base * altura)/2);
    }
     public double arearectangulo () {
        return (base * altura);
    }

   
}
