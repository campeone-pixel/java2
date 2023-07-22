import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();

        // Crear 5 objetos Persona con nombres y apellidos aleatorios en español
        listaPersonas.add(new Persona("Ana", "García"));
        listaPersonas.add(new Persona("Carlos", "López"));
        listaPersonas.add(new Persona("María", "Rodríguez"));
        listaPersonas.add(new Persona("Pedro", "Martínez"));
        listaPersonas.add(new Persona("Laura", "Fernández"));

        // Ordenar alfabéticamente por nombre
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenado por nombre:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        // Ordenar alfabéticamente por apellido
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido));
        System.out.println("\nOrdenado por apellido:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

        // Ordenar inversamente por apellido
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido).reversed());
        System.out.println("\nOrdenado inversamente por apellido:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }
    }
}