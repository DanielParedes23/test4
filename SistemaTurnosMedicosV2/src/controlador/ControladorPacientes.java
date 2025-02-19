package controlador;
import modelo.Paciente;
import java.util.ArrayList;
import java.util.List;

public class ControladorPacientes {
    private List<Paciente> listaPacientes;

    public ControladorPacientes() {
        listaPacientes = new ArrayList<>();
    }

    public boolean registrarPaciente(String cedula, String nombre, String fecha, String hora) {
        // Verificar si el paciente ya tiene un turno en la misma fecha
        for (Paciente p : listaPacientes) {
            if (p.getCedula().equals(cedula) && p.getFecha().equals(fecha)) {
                return false; // Turno duplicado en la misma fecha
            }
        }

        // Agregar paciente a la lista
        Paciente nuevoPaciente = new Paciente(cedula, nombre, fecha, hora);
        listaPacientes.add(nuevoPaciente);
        return true;
    }

    public void eliminarPaciente(String cedula) {
        listaPacientes.removeIf(p -> p.getCedula().equals(cedula));
    }

    public List<Paciente> listarPacientes() {
        return listaPacientes;
    }
}
