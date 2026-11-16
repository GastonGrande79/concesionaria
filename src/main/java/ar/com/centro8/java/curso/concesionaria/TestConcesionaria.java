
package ar.com.centro8.java.curso.concesionaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import ar.com.centro8.java.curso.concesionaria.modelo.Auto;
import ar.com.centro8.java.curso.concesionaria.modelo.Moto;
import ar.com.centro8.java.curso.concesionaria.modelo.Vehiculo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class TestConcesionaria implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TestConcesionaria.class, args);
    }

    // Carga los vehículos.
    public List<Vehiculo> cargarVehiculos() {

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Peugeot", "206", 4, 200000.00));
        vehiculos.add(new Moto("Honda", "Titan", 125, 60000.00));
        vehiculos.add(new Auto("Peugeot", "208", 5, 250000.00));
        vehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50));

        return vehiculos;
    }

    // Imprime cualquier colección.
    public <T> void imprimirColeccion(Collection<T> coleccion) {
        coleccion.forEach(System.out::println);
    }

    // Ejecuta las operaciones.
    @SuppressWarnings("null")
    public void ejecutar() {

        List<Vehiculo> vehiculos = cargarVehiculos();

        // Mostrar todos los vehículos.
        imprimirColeccion(vehiculos);

        System.out.println();
        System.out.println("=============================");
        System.out.println();

        // Vehículo más caro.
        vehiculos.stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .ifPresent(v -> System.out.println("Vehículo más caro: " + v.getMarca() + " " + v.getModelo()));

                        
        // Vehículo más barato.
        vehiculos.stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .ifPresent(v -> System.out.println("Vehículo más barato: " + v.getMarca() + " " + v.getModelo()));

                        
        // Modelos que contienen la letra Y.
        vehiculos.stream()
                .filter(v -> v.getModelo().toUpperCase().contains("Y"))
                .forEach(v -> System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + v.getMarca() + " " + v.getModelo()+ " $" + v.formatearPrecio()));
                                     
                        
        System.out.println();
        System.out.println("=============================");
        System.out.println();

        // Ordenar por precio descendente.
        System.out.println("Vehículos ordenados por precio de mayor a menor:");

        vehiculos.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
                .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));

        System.out.println();
        System.out.println("=============================");
        System.out.println();

        // Orden natural: marca, modelo y precio.
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");

        Collections.sort(vehiculos);
        imprimirColeccion(vehiculos);
    }

    @Override
    public void run(String... args) {
        ejecutar();
    }
}

