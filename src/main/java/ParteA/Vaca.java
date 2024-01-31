package ParteA;


import java.time.LocalDate;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noelia
 */
public class Vaca {
    
    private String id;
    private LocalDate fecNacimiento;
    private String descripcion;
    private static int contador;

    public Vaca(LocalDate fecNacimiento, String descripcion) {
        contador++;
        this.id = String.valueOf(contador);
        this.fecNacimiento = fecNacimiento;
        this.descripcion = descripcion;
    }

    public Vaca() {
    }

    public String getId() {
        return id;
    }

    public LocalDate getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(LocalDate fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vaca{");
        sb.append("id=").append(id);
        sb.append(", fecNacimiento=").append(fecNacimiento);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.fecNacimiento);
        hash = 17 * hash + Objects.hashCode(this.descripcion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vaca other = (Vaca) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return Objects.equals(this.fecNacimiento, other.fecNacimiento);
    }
    
    
    
    
}
