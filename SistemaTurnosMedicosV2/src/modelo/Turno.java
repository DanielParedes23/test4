package modelo;
import java.time.LocalDateTime;

public class Turno {
    private Paciente paciente;
    private LocalDateTime fechaHora;

    public Turno(Paciente paciente, LocalDateTime fechaHora) {
        this.paciente = paciente;
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() { return paciente; }
    public LocalDateTime getFechaHora() { return fechaHora; }

    @Override
    public String toString() {
        return paciente.getNombre() + " - " + fechaHora.toString();
    }
}
