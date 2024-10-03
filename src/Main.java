public class Main {
    public static void main(String[] args){

        Biblioteca bib = new Biblioteca();

        Libro libro1 = new Libro("Harry Potter", "JK.Rowling", "1234-1234-1234", 10.15, 2);
        Libro libro2 = new Libro("One Piece", "Eichiro Oda", "245-245-245", 9.80, 3);
        Libro libro3 = new Libro("Chainsaw Man", "Tatsuki Fujimoto", "482-912-234", 8.50, 2);
        Libro libro4 = new Libro("Los diarios de la Boticaria", "Desconocido", "123-123-123", 12.75, 0.75);

        bib.agregarLibro(libro1);
        bib.agregarLibro(libro2);
        bib.agregarLibro(libro3);
        bib.agregarLibro(libro4);

        bib.mostrarLibros();

        bib.serializarLibros();

        bib.deserializarLibros();
    }
}
