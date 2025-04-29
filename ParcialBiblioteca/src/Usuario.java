import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private ArrayList<Prestamo> prestamos;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.prestamos = new ArrayList();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList getPrestamos() {
        return this.prestamos;
    }

    public void setPrestamos(Prestamo prestamos) {
        this.prestamos.add(prestamos);
    }
    public void mostrarHistorialPrestamos(){
        for(Prestamo prestamo:prestamos){
            System.out.println(prestamo.getFechaPrestamo() + prestamo.getFechaDevolucion());
        }
    }
}