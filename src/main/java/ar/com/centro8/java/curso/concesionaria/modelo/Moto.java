
package ar.com.centro8.java.curso.concesionaria.modelo;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String modelo,
                int cilindrada, double precio) {

        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String obtenerDescripcion() {

        return "Marca: " + getMarca()
                + " // Modelo: " + getModelo()
                + " // Cilindrada: " + cilindrada + "c"
                + " // Precio: $" + formatearPrecio();
    }

    
}

