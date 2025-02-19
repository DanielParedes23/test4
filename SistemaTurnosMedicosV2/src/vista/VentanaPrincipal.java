package vista;
import controlador.ControladorPacientes;
import modelo.Paciente;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class VentanaPrincipal extends JFrame {
    private static VentanaPrincipal instancia;
    private ControladorPacientes controladorPacientes;
    private JTextField txtCedula, txtNombre, txtFecha, txtHora;
    private JTable tablaPacientes;
    private DefaultTableModel modeloTabla;
    private JLabel lblMensaje; // Label de mensajes

    private VentanaPrincipal() {
        controladorPacientes = new ControladorPacientes();

        setTitle("Gestión de Turnos Médicos");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de entrada de datos
        JPanel panelEntrada = new JPanel(new GridLayout(5, 2));

        panelEntrada.add(new JLabel("Cédula:"));
        txtCedula = new JTextField();
        panelEntrada.add(txtCedula);

        panelEntrada.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelEntrada.add(txtNombre);

        panelEntrada.add(new JLabel("Fecha (año-MesMes-DiaDia):"));
        txtFecha = new JTextField();
        panelEntrada.add(txtFecha);

        panelEntrada.add(new JLabel("Hora (Hora:Minutos):"));
        txtHora = new JTextField();
        panelEntrada.add(txtHora);

        JButton btnAgregar = new JButton("Agregar Paciente");
        btnAgregar.addActionListener(this::agregarPaciente);
        panelEntrada.add(btnAgregar);

        add(panelEntrada, BorderLayout.NORTH);

        
        modeloTabla = new DefaultTableModel(new String[]{"Cédula", "Nombre", "Fecha", "Hora"}, 0);
        tablaPacientes = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaPacientes);
        add(scrollPane, BorderLayout.CENTER);

       
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton btnEliminar = new JButton("Eliminar Paciente");
        btnEliminar.addActionListener(this::eliminarPaciente);
        panelInferior.add(btnEliminar);

        lblMensaje = new JLabel(" "); 
        lblMensaje.setForeground(Color.BLACK);
        panelInferior.add(lblMensaje);

        add(panelInferior, BorderLayout.SOUTH);
    }

    public static VentanaPrincipal getInstance() {
        if (instancia == null) {
            instancia = new VentanaPrincipal();
        }
        return instancia;
    }

    private void agregarPaciente(ActionEvent e) {
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String fecha = txtFecha.getText();
        String hora = txtHora.getText();

        if (!cedula.isEmpty() && !nombre.isEmpty() && !fecha.isEmpty() && !hora.isEmpty()) {
            boolean agregado = controladorPacientes.registrarPaciente(cedula, nombre, fecha, hora);
            if (agregado) {
                actualizarTabla();
                txtCedula.setText("");
                txtNombre.setText("");
                txtFecha.setText("");
                txtHora.setText("");
                mostrarMensaje("el paciente ya se registro.");
            } else {
                mostrarMensaje(" El paciente ya tiene un turno en esta fecha.");
            }
        } else {
            mostrarMensaje("Por favor complete todos los campos.");
        }
    }

    private void eliminarPaciente(ActionEvent e) {
        int filaSeleccionada = tablaPacientes.getSelectedRow();
        if (filaSeleccionada != -1) {
            String cedula = (String) modeloTabla.getValueAt(filaSeleccionada, 0);
            controladorPacientes.eliminarPaciente(cedula);
            actualizarTabla();
            mostrarMensaje("Paciente eliminado.");
        } else {
            mostrarMensaje("Seleccione un paciente para eliminar.");
        }
    }

    private void actualizarTabla() {
        modeloTabla.setRowCount(0);
        List<Paciente> pacientes = controladorPacientes.listarPacientes();
        for (Paciente p : pacientes) {
            modeloTabla.addRow(new Object[]{p.getCedula(), p.getNombre(), p.getFecha(), p.getHora()});
        }
    }

    private void mostrarMensaje(String mensaje) {
        lblMensaje.setText(mensaje);
    }
}
