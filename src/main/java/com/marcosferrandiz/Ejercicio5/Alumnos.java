package com.marcosferrandiz.Ejercicio5;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Alumnos {
    private final String nombre;
    private final int fechaNac;
    private final double altura;

    public Alumnos(String nombre, int fechaNac, double altura) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaNac() {
        return fechaNac;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", fechaNac=" + fechaNac +
                ", altura=" + altura +
                '}';
    }
}
