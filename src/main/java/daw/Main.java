/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.time.LocalDate;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        Vaqueria rebanyo1 = new Vaqueria();
        
        rebanyo1.anyadirVaca(new Vaca("", LocalDate.MIN, ""));
        
    }
}
