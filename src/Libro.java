import java.io.Serializable;

class Libro implements Serializable {
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private transient double descuento;

    public Libro(String titulo, String autor, String isbn, double precio, double descuento) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return  "titulo: " + titulo + "\n" +
                "autor: " + autor + "\n" +
                "isbn: " + isbn + "\n" +
                "precio: " + precio +"\n"+
                "descuento: " + descuento + "\n";
    }

}