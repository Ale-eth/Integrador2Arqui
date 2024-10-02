package tp2arquiintegrador.helpers;

import tp2arquiintegrador.entities.Alumno;
import tp2arquiintegrador.entities.Carrera;

import java.util.ArrayList;
import java.util.List;

public class tableDataGenerator {
    public static List<Alumno> crearDatosAlumno() {
        Alumno a1 = new Alumno("Santiago", "Martínez", 28, "masculino", 38765432, "Rosario", 2000);
        Alumno a2 = new Alumno("Camila", "González", 21, "femenino", 45678901, "Mendoza", 5500);
        Alumno a3 = new Alumno("Javier", "Fernández", 25, "masculino", 42789123, "Córdoba", 5000);
        Alumno a4 = new Alumno("Lucía", "Pérez", 23, "femenino", 46801234, "La Plata", 1900);
        Alumno a5 = new Alumno("Agustín", "Silva", 34, "masculino", 37654321, "Mar del Plata", 7600);
        Alumno a6 = new Alumno("Valentina", "López", 29, "femenino", 41029385, "Salta", 4400);
        Alumno a7 = new Alumno("Tomás", "Romero", 22, "masculino", 48967543, "Neuquén", 8300);
        Alumno a8 = new Alumno("Sofía", "Mendoza", 35, "femenino", 34128765, "Buenos Aires", 1000);


        List<Alumno> l = new ArrayList<Alumno>();

        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a4);
        l.add(a5);
        l.add(a6);
        l.add(a7);
        l.add(a8);

        return l;
    }

    public static List<Carrera> crearDatosCarrera() {
        Carrera c1 = new Carrera("TUDAI");
        Carrera c2 = new Carrera("Ingenieria en sistemas");
        Carrera c3 = new Carrera("Ciencias Economicas");
        Carrera c4 = new Carrera("Ciencias Veterinarias");
        Carrera c5 = new Carrera("Turismo");

        List<Carrera> l = new ArrayList<Carrera>();

        l.add(c1);
        l.add(c2);
        l.add(c3);
        l.add(c4);
        l.add(c5);

        return l;
    }
}