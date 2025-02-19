package controlador;
import modelo.Paciente;
import modelo.Turno;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControladorTurnos {
    private List<Turno> turnos = new ArrayList<>();

    public boolean asignarTurno(Paciente paciente, LocalDateTime fechaHora) {
        // Verificar si ya tiene turno ese día
        boolean tieneTurno = turnos.stream()
                .anyMatch(t -> t.getPaciente().equals(paciente) &&
                               t.getFechaHora().toLocalDate().equals(fechaHora.toLocalDate()));

        if (!tieneTurno) {
            turnos.add(new Turno(paciente, fechaHora));
            return true;
        }
        return false;
    }

    public List<Turno> obtenerTurnosOrdenados() {
        return turnos.stream()
                .sorted((t1, t2) -> t1.getFechaHora().compareTo(t2.getFechaHora()))
                .collect(Collectors.toList());
    }
}
