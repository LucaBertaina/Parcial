import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Usuario> usuarios;
    private List<Publicacion> publicaciones;



    public Biblioteca() {
        this.usuarios = new ArrayList();
        this.publicaciones = new ArrayList();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public void addUser(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void addPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }
}
