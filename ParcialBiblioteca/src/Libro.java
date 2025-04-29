import java.util.List;
import java.util.ArrayList;

public class Libro extends Publicacion{
    private String isbn;
    private List<Autor> autores;
    private Editorial editorial;

    public Libro(String titulo, int anio, Genero genero, String isbn, ArrayList<Autor> autores, Editorial editorial) {
        super(titulo, anio, genero);
        this.isbn = isbn;
        this.autores = autores;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
