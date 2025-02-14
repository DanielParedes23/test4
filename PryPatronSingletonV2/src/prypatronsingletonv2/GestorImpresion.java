package prypatronsingletonv2;

import java.util.ArrayList;
import java.util.List;

public class GestorImpresion {
    private static GestorImpresion instancia;
    private List<String> documentos;

    private GestorImpresion() {
        documentos = new ArrayList<>();
    }

    public static GestorImpresion getInstancia() {
        if (instancia == null) {
            instancia = new GestorImpresion();
        }
        return instancia;
    }

    public void setDocumento(String documento) {
        documentos.add(documento);
    }

    public void imprimir() {
        System.out.println("Documentos en cola de impresion:");
        for (String doc : documentos) {
            System.out.println("- Imprimiendo: " + doc);
        }
        documentos.clear();
    }
}
