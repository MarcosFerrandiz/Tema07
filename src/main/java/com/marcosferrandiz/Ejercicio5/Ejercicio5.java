package com.marcosferrandiz.Ejercicio5;

import com.marcosferrandiz.lib.SolicitarCosas;

import java.util.Arrays;

public class Ejercicio5 {
    private static Alumnos[] alumno;
    private static int cantAlumnos;
    public static void main(String[] args) {
        int cantAlumnos = SolicitarCosas.solicitarEntero("Indique cuantos alumnos desea crear [max 50]",1,50);
        alumno = new Alumnos[cantAlumnos];
        String nombre;
        int edad;
        double altura;
        for (int i = 0; i < cantAlumnos ; i++) {
            nombre = SolicitarCosas.solicitarString("Introduzca el nombre del alumno",2,50);
            edad = SolicitarCosas.solicitarEntero("Introduzca la edad del alumno (int)",0,120);
            altura = SolicitarCosas.solicitarDoubles("Introduzca la altura del alumno",0,5);
            alumno[i] = new Alumnos(nombre,edad,altura);
            System.out.println(alumno[i].toString());
        }

        int edadMayor = 0;
        for (int i = 0; i < alumno.length ; i++) {
            if (alumno[i].getFechaNac() >= edadMayor){
                edadMayor = alumno[i].getFechaNac();
            }
        }
        for (int i = 0; i < alumno.length ; i++) {
            if (alumno[i].getFechaNac() == edadMayor){
                System.out.println("La persona mas mayor es: ");
                System.out.println(alumno[i]);
                break;
            }
        }
    }
}
