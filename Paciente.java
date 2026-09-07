
package centralpacientes;

public class Paciente {
    private String id;
    private String nombre;
    private int edad;
    private String clinica;

    public Paciente(String id, String nombre, int edad, String clinica) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.clinica = clinica;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getClinica() { return clinica; }
    public void setClinica(String clinica) { this.clinica = clinica; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad + " | Clínica: " + clinica;
    }
}
