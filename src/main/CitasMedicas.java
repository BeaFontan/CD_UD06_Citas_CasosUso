package src.main;
import java.util.ArrayList;
import java.util.List;

// Clase para manejar las citas médicas
public class CitasMedicas {

    private List<String> calendario; // Calendario de citas

    public CitasMedicas() {
        calendario = new ArrayList<>();
    }


    public void agendarCita(String fechaHora) {
        calendario.add(fechaHora);
    }
    

    public void cancelarCita(String fechaHora) {
       calendario.remove(calendario.indexOf(fechaHora));

    }

    public void reprogramarCita(String fechaHoraAntigua, String fechaHoraNueva) {
       
        calendario.remove(calendario.indexOf(fechaHoraAntigua));
        calendario.add(fechaHoraNueva);

    }

    public void verCalendario() {
        for (String fecha : calendario) {
            System.out.println(fecha);
        }
    }
}
