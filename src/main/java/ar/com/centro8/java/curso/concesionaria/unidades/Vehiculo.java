
package ar.com.centro8.java.curso.concesionaria.unidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.text.DecimalFormat;

@Getter
@AllArgsConstructor

public abstract class Vehiculo implements Comparable<Vehiculo> {

    private String marca;
    private String modelo;
    private double precio;

    // Define el orden natural: marca, modelo y precio.
    @Override
    public int compareTo(Vehiculo otro) {

        int resultado = marca.compareTo(otro.marca);

        if (resultado == 0) {
            resultado = modelo.compareTo(otro.modelo);
        }

        if (resultado == 0) {
            resultado = Double.compare(precio, otro.precio);
        }

        return resultado;
    }

    // Formatea el precio.
    public String formatearPrecio() {
        DecimalFormat formato = new DecimalFormat("$#,##0.00");
        return formato.format(precio);
    }

}
