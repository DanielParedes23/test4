package prypatronsingletonv2;

public class ConexionBaseDatos {
    private static ConexionBaseDatos instancia;
    private boolean conectado;

    private ConexionBaseDatos() {
        this.conectado = false;
    }

    public static ConexionBaseDatos getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBaseDatos();
        }
        return instancia;
    }

    public void conectar() {
        conectado = true;
        System.out.println("Conectado a la base de datos.");
    }

    public void desconectar() {
        conectado = false;
        System.out.println("Desconectado de la base de datos.");
    }
}
