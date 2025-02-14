package prypatronsingletonv2;

import java.util.HashMap;
import java.util.Map;

public class GestorConfiguracion {
    private static GestorConfiguracion instancia;
    private Map<String, String> opciones;

    private GestorConfiguracion() {
        opciones = new HashMap<>();
    }

    public static GestorConfiguracion getInstancia() {
        if (instancia == null) {
            instancia = new GestorConfiguracion();
        }
        return instancia;
    }

    public void setOpcion(String clave, String valor) {
        opciones.put(clave, valor);
    }

    public void mostrarOpciones() {
        System.out.println("Opciones de Configuracion:");
        for (Map.Entry<String, String> entrada : opciones.entrySet()) {
            System.out.println("- " + entrada.getKey() + ": " + entrada.getValue());
        }
    }
}

