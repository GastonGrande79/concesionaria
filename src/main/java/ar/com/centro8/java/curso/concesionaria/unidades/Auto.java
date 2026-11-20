
package ar.com.centro8.java.curso.concesionaria.unidades;

import lombok.Getter;

@Getter
public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(String marca, String modelo,
                int cantidadPuertas, double precio) {

        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {

        return "Marca: " + getMarca()
                + " // Modelo: " + getModelo()
                + " // Puertas: " + cantidadPuertas
                + " // Precio: " + formatearPrecio();
    }
}


