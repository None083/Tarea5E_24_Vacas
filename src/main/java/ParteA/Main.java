/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ParteA;

import ParteA.Vaqueria;
import ParteA.Vaca;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        Vaqueria rebanyo1 = new Vaqueria();
        Vaqueria rebanyo2 = new Vaqueria();
        
        Vaca v1 = new Vaca(LocalDate.of(2024, 1, 1), "Margarita");
        Vaca v2 = new Vaca(LocalDate.of(2022, 12, 1), "Lussy");
        Vaca v3 = new Vaca(LocalDate.of(2023, 10, 1), "Hamburguesa");
        
        rebanyo1.anyadirVaca(v1);
        rebanyo1.anyadirVaca(v2);
        rebanyo1.anyadirVaca(v3);
        rebanyo2.anyadirVaca(v1);
        rebanyo2.anyadirVaca(v2);
        rebanyo2.anyadirVaca(v3);
        
        System.out.println("Número de vacas: " + rebanyo1.numeroVacas());
        System.out.println("Está vacía la vaquería? " + rebanyo1.vaqueriaVacia());
        System.out.println("Está la vaca v1 en la vaquería? " + rebanyo1.encontrarVaca(v1));
        
        rebanyo1.darBajaVaca(v1);
        System.out.println("Está la vaca v1 en la vaquería? " + rebanyo1.encontrarVaca(v1));
        
        Vaqueria.mostrarVacas(rebanyo1.getRebanyo());
        
        ArrayList<Vaca> rebanyoFuera = rebanyo1.sacarVacasAPastar();
        
        System.out.println("Está vacía la vaquería? " + rebanyo1.vaqueriaVacia());
        
        Vaqueria.mostrarVacas(rebanyoFuera);
        
        
        
        
        
    }
}
