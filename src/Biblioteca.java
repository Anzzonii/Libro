import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> listaLibros = new ArrayList<>();

    public void agregarLibro(Libro libro){
        listaLibros.add(libro);
    }

    public void mostrarLibros(){
        for(Libro libro : listaLibros){
            System.out.println(libro.toString());
        }
    }

    public void serializarLibros(){
        try(FileOutputStream fileOutput = new FileOutputStream("biblioteca.ser");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)){
            for(Libro libro : listaLibros){
                objectOutput.writeObject(libro);
            }
        }catch(IOException e){
            System.err.println("Error al almacenar libros: "+e.getMessage());
        }
    }

    public void deserializarLibros(){
        try(FileInputStream fileInput = new FileInputStream("biblioteca.ser");
            ObjectInputStream objectInput = new ObjectInputStream(fileInput)){

            while(true){
                try{
                    Libro libro = (Libro) objectInput.readObject();
                    System.out.println("\nInformación del libro:");
                    System.out.println(libro.toString());
                }catch (EOFException e){
                    System.err.println("Se ha alcanzado el final del archivo");
                    break;
                }
            }


        }catch (IOException | ClassNotFoundException e){
            System.err.println("Error al leer el archivo biblioteca.ser: "+e.getMessage());
        }
    }
}
