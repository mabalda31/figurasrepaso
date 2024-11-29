/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasrepaso;

import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class salida {
    
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Introduce la base: ");
            double base = scanner.nextDouble();
            
            System.out.print("Introduce la altura: ");
            double altura = scanner.nextDouble();
            
           
            imprimirResultados(base, altura);
        }
    }

    public static void imprimirResultados(double base, double altura) {
        Figurasrepaso figura = new Figurasrepaso(base, altura);
        System.out.println("Área del triángulo: " + figura.areatriangulo());
        System.out.println("Área del rectángulo: " + figura.arearectangulo());
    }
}
