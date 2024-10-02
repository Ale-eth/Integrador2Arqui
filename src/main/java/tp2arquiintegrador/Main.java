package tp2arquiintegrador;

import tp2arquiintegrador.dtos.ReporteCarrerasDTO;
import tp2arquiintegrador.entities.Alumno;
import tp2arquiintegrador.entities.Carrera;
import tp2arquiintegrador.factory.DaoFactory;
import tp2arquiintegrador.helpers.tableDataPop;
import tp2arquiintegrador.repositories.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DaoFactory factory = DaoFactory.getInstance(1);
        AlumnoRepository alumnoRep = factory.getAlumnoRepository();
        CarreraRepository carreraRep = factory.getCarreraRepository();
        AlumnoCarreraRepository alumnoCarreraRep = factory.getAlumnoCarreraRepository();

        System.out.println("Poblando DB");
        tableDataPop.poblarTablaAlumnos(alumnoRep);
        tableDataPop.poblarTablaCarreras(carreraRep);
        tableDataPop.matricularEstudiantes(alumnoCarreraRep, alumnoRep, carreraRep);
        System.out.println("////////////////////////////////////////////");


        System.out.println("2.a - Dar de alta al alumno Alejandro Abdala:");
        Alumno alum007 = new Alumno("Alejandro", "Abdala", 24, "masculino", 4245545, "olavarria", 1901200);
        alumnoRep.crearAlumno(alum007);
        System.out.println(alumnoRep.getAlumnoByNroLibreta(1901200));
        System.out.println("////////////////////////////////////////////");


        System.out.println("2.b - Matricular al alumno Alejandro Abdala en TUDAI:");
        Carrera carrera = carreraRep.buscarCarreraPorNombre("TUDAI");
        alumnoCarreraRep.matricularAlumno(alum007, carrera, 2020, 0, 1);
        System.out.println(alumnoCarreraRep.buscarAlumnoID(alum007.getAlumno_id()));
        System.out.println("////////////////////////////////////////////");


        System.out.println("2.c - Listar todos los alumnos: (ordenado)");
        List<Alumno> alumnos = alumnoRep.getAlumnos("apellido", true);

        for (Alumno a : alumnos) {
            System.out.println(a);
        }

        System.out.println("////////////////////////////////////////////");

        System.out.println("2.d Buscar alumno por LU:");
        Alumno al = alumnoRep.getAlumnoByNroLibreta(1901200);
        System.out.println(al);
        System.out.println("////////////////////////////////////////////");


        System.out.println("2.e - Filtrar alumnos por género: (femenino)");
        List<Alumno> alumnosGenero = alumnoRep.getAlumnosByGenero("femenino");

        for (Alumno a : alumnosGenero) {
            System.out.println(a);
        }
        System.out.println("////////////////////////////////////////////");


        System.out.println("2.f - Buscar carreras con alumnos inscriptos y ordenar por cantidad de inscriptos:");
        List<Carrera> carrerasEstInscriptos = carreraRep.listarCarrerasConAlumnosInscriptos();

        for (Carrera c : carrerasEstInscriptos) {
            System.out.println(c);
        }
        System.out.println("////////////////////////////////////////////");


        System.out.println("2.g -  Filtrar alumnos por: Carrera y Ciudad de residencia");
        Carrera c5 = carreraRep.buscarCarreraPorNombre("tudai");
        List<Alumno> listarAlumnosPorCarrera = alumnoRep.getAlumnosByMajorFilteredBy(c5, "olavarria");

        for (Alumno a : listarAlumnosPorCarrera) {
            System.out.println(a);
        }
        System.out.println("////////////////////////////////////////////");


        System.out.println("3 - Reporte de las carreras (inscriptos y egresados por año) ordenadas alfabeticamente y por orden cronologico:");
        List<ReporteCarrerasDTO> majorsReport = carreraRep.getMajorsReport();

        for (ReporteCarrerasDTO m : majorsReport) {
            System.out.println(m);
        }
    }
}