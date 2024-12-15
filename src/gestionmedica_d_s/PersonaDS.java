/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmedica_d_s;

/**
 *
 * @author Daniel Sagastume
 */
public class PersonaDS {
    private String nombreDS;
    private int edadDS;
    private String direccionDS;

    public PersonaDS(String nombreDS, int edadDS, String direccionDS) {
        this.nombreDS = nombreDS;
        this.edadDS = edadDS;
        this.direccionDS = direccionDS;
    }

    public String getNombreDS() {
        return nombreDS;
    }

    public void setNombreDS(String nombreDS) {
        this.nombreDS = nombreDS;
    }

    public int getEdadDS() {
        return edadDS;
    }

    public void setEdadDS(int edadDS) {
        this.edadDS = edadDS;
    }

    public String getDireccionDS() {
        return direccionDS;
    }

    public void setDireccionDS(String direccionDS) {
        this.direccionDS = direccionDS;
    }
    
}
