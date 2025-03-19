public class Consultorio {
    private Pacientes[] listPacientes;
    private int contador;

    public Consultorio(int capacidad) {
        this.contador = 0;
        this.listPacientes = new Pacientes[capacidad];

    }

    public boolean agregarPaciente(Pacientes paciente) {
        if (contador < listPacientes.length) {
            listPacientes[contador] = paciente;
            contador++;
            return true;
        }

        return false;

    }

    public Pacientes[] getListPacientes() {
        return listPacientes;
    }

    public Pacientes[] obtenerPacientesMas5Tratamientos() {
        int cont = 0;
        for (Pacientes p : listPacientes) {
            if (p != null && p.cantidadTratamientos() > 5) {
                cont++;
            }
        }


        Pacientes[] resultado = new Pacientes[cont];
        int index = 0;
        for (Pacientes p : listPacientes) {
            if (p != null && p.cantidadTratamientos() > 5) {
                resultado[index] = p;
                index++;
            }
        }
        return resultado;

}
public void listarPacientes() {
        if(contador == 0){
            System.out.println("No hay pacientes");
            return;
            }
        for(int i = 0; i<contador; i++){
            System.out.println(listPacientes[i]);
        }
}
}
