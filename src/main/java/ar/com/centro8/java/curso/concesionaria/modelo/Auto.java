
package ar.com.centro8.java.curso.concesionaria.modelo;

public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(String marca, String modelo,
                int cantidadPuertas, double precio) {

        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String obtenerDescripcion() {

        return "Marca: " + getMarca()
                + " // Modelo: " + getModelo()
                + " // Puertas: " + cantidadPuertas
                + " // Precio: $" + formatearPrecio();
    }

    
}


