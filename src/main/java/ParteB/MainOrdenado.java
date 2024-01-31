/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ParteB;

import ParteB.VaqueriaOrdenada;
import ParteB.Vaca;
import java.time.LocalDate;

/**
 *
 * @author noelia
 */
public class MainOrdenado {

    public static void main(String[] args) {
        
        VaqueriaOrdenada rebanyo1 = new VaqueriaOrdenada();

        Vaca v1 = new Vaca( "34", LocalDate.of(2024, 1, 1), "Margarita");
        Vaca v2 = new Vaca("1", LocalDate.of(2022, 12, 1), "Lussy");
        Vaca v3 = new Vaca("40",LocalDate.of(2023, 10, 1), "Hamburguesa");
        
        //Se añaden las vacas desordenadas: 34, 1, 40
        rebanyo1.anyadirVaca(v1);
        rebanyo1.anyadirVaca(v2);
        rebanyo1.anyadirVaca(v3);
        
        VaqueriaOrdenada.mostrarVacas(rebanyo1.getRebanyo());
        
        //Intentamos añadir una vaca que ya está dentro
        rebanyo1.anyadirVaca(v2);
        
        //Comprobamos que no se añade
        System.out.println("------------------------------------------------------------");
        VaqueriaOrdenada.mostrarVacas(rebanyo1.getRebanyo());
        
        //Borramos una vaca con sólo su id
        System.out.println("------------------------------------------------------------");
        rebanyo1.darBajaVaca(new Vaca("1", LocalDate.MIN, ""));
        
        //Comprobamos que se ha borrado
        VaqueriaOrdenada.mostrarVacas(rebanyo1.getRebanyo());
        
        //Intentamos añadirla de nuevo
        System.out.println("------------------------------------------------------------");
        rebanyo1.anyadirVaca(v2);
        VaqueriaOrdenada.mostrarVacas(rebanyo1.getRebanyo());
        
    }
}
