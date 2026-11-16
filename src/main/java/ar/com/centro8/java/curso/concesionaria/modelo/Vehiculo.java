
package ar.com.centro8.java.curso.concesionaria.modelo;

import ar.com.centro8.java.curso.concesionaria.interfaces.Imprimible;
import lombok.Getter;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

@Getter
public abstract class Vehiculo implements Imprimible, Comparable<Vehiculo> {

    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

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

    // Formatea el precio con punto para miles y coma para decimales.
    public String formatearPrecio() {

        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.forLanguageTag("es-AR"));
        simbolos.setGroupingSeparator('.');
        simbolos.setDecimalSeparator(',');
        DecimalFormat formato = new DecimalFormat("#,##0.00", simbolos);

         return formato.format(precio);
    }
    
    // Define cómo se representa un vehículo al imprimirlo.
    @Override
    public String toString() {
        return obtenerDescripcion();
    }
}
