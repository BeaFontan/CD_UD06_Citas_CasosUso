package src.main;
public class Medico {

    private String nombreMedico;
    private String especialidadMedico;

    
    public Medico(String nombreMedico, String especialidadMedico) {
        this.nombreMedico = nombreMedico;
        this.especialidadMedico = especialidadMedico;
    }


    public String getNombreMedico() {
        return nombreMedico;
    }


    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }


    public String getEspecialidadMedico() {
        return especialidadMedico;
    }


    public void setEspecialidadMedico(String especialidadMedico) {
        this.especialidadMedico = especialidadMedico;
    }


    @Override
    public String toString() {
        return "Medico [nombreMedico=" + nombreMedico + ", especialidadMedico=" + especialidadMedico + "]";
    }

    


}