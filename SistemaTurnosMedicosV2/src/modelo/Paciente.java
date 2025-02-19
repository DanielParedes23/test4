package modelo;

public class Paciente {
    private String cedula;
    private String nombre;
    private String fecha;
    private String hora;

    public Paciente(String cedula, String nombre, String fecha, String hora) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getCedula() { return cedula; }
    public String getNombre() { return nombre; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
}
