import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("pepe", "Argentina", new Date(2000, 9, 12));
        Autor autor2 = new Autor("Juan", "Chile", new Date(1999, 2, 1));
        ArrayList<Autor> autores = new ArrayList();
        autores.add(autor1);
        autores.add(autor2);

        Genero terror = new Genero("Terror", "Hechos paranormales");
        Genero aventura = new Genero("Aventura", "relata historias ficcticias o reales sobre lo desconocido");

        Editorial editorial1 = new Editorial("Pintal", "Pintal.com", new Direccion("adolfo calle", 123, "Mendoza", "5519M"));

        Libro Libro1 = new Libro("Libro 1", 2005, aventura, "abl", autores, editorial1);
        Libro Libro2 = new Libro("Libro 2", 2007, terror, "abk", autores, editorial1);
        Revista Revista1 = new Revista("Revista 1", 2003, aventura, 1, 1);
        Ejemplar ejemplarlibro1 = new Ejemplar("aventura1", EstadoEjemplar.DISPONIBLE, Libro1);
        Ejemplar ejemplarlibro2 = new Ejemplar("aventura1", EstadoEjemplar.EXTRAVIADO, Libro2);
        Ejemplar ejemplarRevista1 = new Ejemplar("aventura1", EstadoEjemplar.DISPONIBLE, Revista1);
        Libro1.setEjemplares(ejemplarlibro1);
        Libro2.setEjemplares(ejemplarlibro2);
        Revista1.setEjemplares(ejemplarRevista1);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addPublicacion(Libro1);
        biblioteca.addPublicacion(Libro2);
        biblioteca.addPublicacion(Revista1);

        Usuario User1 = new Usuario("Luca", "Bertaina", "46620867");

        User1.setPrestamos(new Prestamo(new Date(2025, 5, 2)), new Date(2025, 6, 2));

        LineaPrestamo linea = new LineaPrestamo(new Date(2025, 6, 2), User1.getPrestamos());

    }

    }
}