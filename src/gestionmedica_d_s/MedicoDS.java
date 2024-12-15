/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmedica_d_s;

/**
 *
 * @author Daniel Sagastume
 */
public class MedicoDS extends PersonaDS{
    private String especialidadDS;
    private int aniosExperienciaDS;

    public MedicoDS(String especialidadDS, int aniosExperienciaDS, String nombreDS, int edadDS, String direccionDS) {
        super(nombreDS, edadDS, direccionDS);
        this.especialidadDS = especialidadDS;
        this.aniosExperienciaDS = aniosExperienciaDS;
    }

    public String getEspecialidadDS() {
        return especialidadDS;
    }

    public void setEspecialidadDS(String especialidadDS) {
        this.especialidadDS = especialidadDS;
    }

    public int getAniosExperienciaDS() {
        return aniosExperienciaDS;
    }

    public void setAniosExperienciaDS(int aniosExperienciaDS) {
        this.aniosExperienciaDS = aniosExperienciaDS;
    }
    

    
}
