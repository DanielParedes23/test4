package prypatronsingletonv2;

import java.util.ArrayList;
import java.util.List;

public class RegistroActividades {
    private static RegistroActividades instancia;
    private List<String> actividades;

    private RegistroActividades() {
        actividades = new ArrayList<>();
    }

    public static RegistroActividades getInstancia() {
        if (instancia == null) {
            instancia = new RegistroActividades();
        }
        return instancia;
    }

    public void setActividad(String actividad) {
        actividades.add(actividad);
    }

    public void mostrarActividades() {
        System.out.println("Registro de Actividades:");
        for (String actividad : actividades) {
            System.out.println("- " + actividad);
        }
    }
}
