
package centralpacientes;

public class ListaPacientes {
    private Nodo cabeza;
    private int tamanio;

    public ListaPacientes() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    public void agregar(Paciente paciente) {
        Nodo nuevo = new Nodo(paciente);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamanio++;
    }

    public Paciente buscar(String id) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getPaciente().getId().equals(id)) {
                return actual.getPaciente();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public boolean eliminar(String id) {
        if (cabeza == null) return false;

        if (cabeza.getPaciente().getId().equals(id)) {
            cabeza = cabeza.getSiguiente();
            tamanio--;
            return true;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getPaciente().getId().equals(id)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                tamanio--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("No hay pacientes registrados.");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getPaciente());
            actual = actual.getSiguiente();
        }
    }

    public int getTamanio() { return tamanio; }
}
