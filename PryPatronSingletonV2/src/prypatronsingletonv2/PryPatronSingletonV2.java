package prypatronsingletonv2;

import java.util.ArrayList;
import java.util.List;

public class PryPatronSingletonV2 {
    public static void main(String[] args) {
        
        // Lista de actividades
        List<String> listadoActividades = new ArrayList<>();
        listadoActividades.add("Inicio del sistema");
        listadoActividades.add("Usuario inicio sesion");
        listadoActividades.add("Usuario cerro sesion");

        RegistroActividades registro = RegistroActividades.getInstancia();
        registro.setActividad(listadoActividades.get(2)); 
       
        registro.mostrarActividades();
        System.out.println();

        // Lista de opciones de configuracion
        List<String> listadoModo = new ArrayList<>();
        listadoModo.add("Desarrollo");
        listadoModo.add("Produccion");

        List<String> listadoResolucion = new ArrayList<>();
        listadoResolucion.add("1280x720");
        listadoResolucion.add("1920x1080");

        GestorConfiguracion gestorConfig = GestorConfiguracion.getInstancia();
        gestorConfig.setOpcion("modo", listadoModo.get(1)); 
        gestorConfig.setOpcion("resolucion", listadoResolucion.get(0)); 
        gestorConfig.mostrarOpciones();
        System.out.println();

        // Conexion a base de datos
        ConexionBaseDatos conexionDB = ConexionBaseDatos.getInstancia();
        conexionDB.conectar();
        conexionDB.desconectar();
        System.out.println();

        // Lista de documentos a imprimir
        List<String> listadoDocumentos = new ArrayList<>();
        listadoDocumentos.add("Reporte_Mensual.pdf");
        listadoDocumentos.add("Balance_Anual.pdf");

        GestorImpresion impresora = GestorImpresion.getInstancia();
        impresora.setDocumento(listadoDocumentos.get(0)); 
        
        impresora.imprimir();
        System.out.println();

        // Lista de usuarios
        List<String> listadoUsuarios = new ArrayList<>();
        listadoUsuarios.add("Ana Lopez");
        listadoUsuarios.add("Carlos Ramirez");

        SesionUsuario sesion = SesionUsuario.getInstancia();
        sesion.setUsuario(listadoUsuarios.get(0)); 
        System.out.println("Usuario en sesion: " + sesion.getUsuario());
        System.out.println();
    }
}
