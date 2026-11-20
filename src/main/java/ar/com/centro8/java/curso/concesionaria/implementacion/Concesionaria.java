
package ar.com.centro8.java.curso.concesionaria.implementacion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.com.centro8.java.curso.concesionaria.interfaz.IConcesionaria;
import ar.com.centro8.java.curso.concesionaria.unidades.Auto;
import ar.com.centro8.java.curso.concesionaria.unidades.Moto;
import ar.com.centro8.java.curso.concesionaria.unidades.Vehiculo;

public class Concesionaria implements IConcesionaria {

    // Carga todos los vehículos en un único método.
    private List<Vehiculo> cargarVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Peugeot", "206", 4, 200000.00));
        vehiculos.add(new Moto("Honda", "Titan", 125, 60000.00));
        vehiculos.add(new Auto("Peugeot", "208", 5, 250000.00));
        vehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50));

        return vehiculos;
    }

    // Ejecuta todas las operaciones de la concesionaria.
    @Override
    public void ejecutar() {
        System.out.println("\n");

        List<Vehiculo> vehiculos = cargarVehiculos();

        vehiculos.forEach(System.out::println);
        System.out.println("\n=============================\n");

        mostrarMasCaro(vehiculos);
        mostrarMasBarato(vehiculos);
        mostrarConLetraY(vehiculos);
        System.out.println("\n=============================\n");

        mostrarOrdenadosPorPrecioDesc(vehiculos);
        System.out.println("\n=============================\n");

        mostrarOrdenadosNaturalmente(vehiculos);

        System.out.println("\n");
    }

    // Busca e imprime el vehículo con el mayor precio.
    private void mostrarMasCaro(List<Vehiculo> vehiculos) {
        vehiculos.stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .ifPresent(v -> System.out.println(
                        "Vehículo mas caro : " + v.getMarca() + " " + v.getModelo()));
    }

    // Busca e imprime el vehículo con el menor precio.
    private void mostrarMasBarato(List<Vehiculo> vehiculos) {
        vehiculos.stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .ifPresent(v -> System.out.println(
                        "Vehículo mas barato: " + v.getMarca() + " " + v.getModelo()));
    }

    // Busca e imprime los vehículos cuyo modelo contiene la letra Y.
    private void mostrarConLetraY(List<Vehiculo> vehiculos) {
        vehiculos.stream()
                .filter(v -> v.getModelo().toUpperCase().contains("Y"))
                .forEach(v -> System.out.println(
                        "Vehículo que contiene en el modelo la letra ´Y´: "
                                + v.getMarca() + " " + v.getModelo()
                                + " " + v.formatearPrecio()));
    }

    // Ordena e imprime los vehículos por precio de mayor a menor.
    private void mostrarOrdenadosPorPrecioDesc(List<Vehiculo> vehiculos) {
        System.out.println("Vehículos ordenados por precio de mayor a menor:");

        vehiculos.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
                .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
    }

    // Ordena e imprime según el orden natural definido en compareTo().
    private void mostrarOrdenadosNaturalmente(List<Vehiculo> vehiculos) {
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");

        vehiculos.forEach(System.out::println);
    }
}
