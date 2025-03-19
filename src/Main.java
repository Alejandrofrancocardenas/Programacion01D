import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio(50); // Se crea el consultorio con capacidad para 50 pacientes
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    " MENÚ - Consultorio Odontológico\n" +
                            "1️ Registrar nuevo paciente\n" +
                            "2️ Mostrar pacientes registrados\n" +
                            "3️ Mostrar pacientes con más de 5 tratamientos\n" +
                            "4️ Salir\n\n" +
                            "Seleccione una opción:"));

            switch (opcion) {
                case 1:
                    registrarPaciente(consultorio);
                    break;
                case 2:
                    mostrarPacientes(consultorio);
                    break;
                case 3:
                    mostrarPacientesFrecuentes(consultorio);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, " Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 4);
    }

    private static void registrarPaciente(Consultorio consultorio) {
        int historiaClinica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de historia clínica:"));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente:"));
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono del paciente:"));
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección del paciente:");
        String fechaUltimaConsulta = JOptionPane.showInputDialog("Ingrese la fecha de la última consulta:");
        int tratamientosRealizados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tratamientos realizados:"));

        Pacientes nuevoPaciente = new Pacientes(historiaClinica, nombre, edad, telefono, direccion, fechaUltimaConsulta, tratamientosRealizados);

        if (consultorio.agregarPaciente(nuevoPaciente)) {
            JOptionPane.showMessageDialog(null, " Paciente registrado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, " No se pudo registrar el paciente (lista llena).");
        }
    }

    private static void mostrarPacientes(Consultorio consultorio) {
        Pacientes[] lista = consultorio.getListPacientes();
        StringBuilder mensaje = new StringBuilder("📄 Pacientes Registrados:\n");

        for (Pacientes p : lista) {
            if (p != null) {
                mensaje.append(p).append("\n");
            }
        }

        if (mensaje.toString().equals(" Pacientes Registrados:\n")) {
            mensaje.append(" No hay pacientes registrados.");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    private static void mostrarPacientesFrecuentes(Consultorio consultorio) {
        Pacientes[] lista = consultorio.getListPacientes();
        StringBuilder mensaje = new StringBuilder(" Pacientes con más de 5 tratamientos:\n");

        for (Pacientes p : lista) {
            if (p != null && p.cantidadTratamientos() > 5) {
                mensaje.append(p).append("\n");
            }
        }

        if (mensaje.toString().equals(" Pacientes con más de 5 tratamientos:\n")) {
            mensaje.append("⚠ No hay pacientes con más de 5 tratamientos.");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
