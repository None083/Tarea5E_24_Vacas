/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author noelia
 */
public class Vaqueria {
    
    private Set<Vaca> rebanyo;

    public Vaqueria() {
        this.rebanyo = new HashSet<>();
    }

    public Set<Vaca> getRebanyo() {
        return rebanyo;
    }
    
    public int numeroVacas(){
        return this.rebanyo.size();
    }
    
    public void anyadirVaca(Vaca v){
        this.rebanyo.add(v);
    }
    
    public boolean vaqueriaVacia(){
        return this.rebanyo.isEmpty();
    }
    
    public boolean encontrarVaca(Vaca v){
        return this.rebanyo.contains(v);
    }
    
    public ArrayList<Vaca> sacarVacasArrayList(){  
        return new ArrayList<>(this.rebanyo);
    }
    
    public void darBajaVaca(Vaca v){
        this.rebanyo.remove(v);
    }
    
}
