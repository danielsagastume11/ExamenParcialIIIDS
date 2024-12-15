/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmedica_d_s;

/**
 *
 * @author Daniel Sagastume
 */
public class PacienteDS extends PersonaDS{
    private int nroHistorialDS;
    private String EnfermedadDS;

    public int getNroHistorialDS() {
        return nroHistorialDS;
    }

    public void setNroHistorialDS(int nroHistorialDS) {
        this.nroHistorialDS = nroHistorialDS;
    }

    public String getEnfermedadDS() {
        return EnfermedadDS;
    }

    public void setEnfermedadDS(String EnfermedadDS) {
        this.EnfermedadDS = EnfermedadDS;
    }

    public PacienteDS(int nroHistorialDS, String EnfermedadDS, String nombreDS, int edadDS, String direccionDS) {
        super(nombreDS, edadDS, direccionDS);
        this.nroHistorialDS = nroHistorialDS;
        this.EnfermedadDS = EnfermedadDS;
    }
}
