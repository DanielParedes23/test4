package prypatronsingletonv2;

public class SesionUsuario {
    private static SesionUsuario instancia;
    private String usuario;

    private SesionUsuario() {
        this.usuario = "No definido";
    }

    public static SesionUsuario getInstancia() {
        if (instancia == null) {
            instancia = new SesionUsuario();
        }
        return instancia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
}
