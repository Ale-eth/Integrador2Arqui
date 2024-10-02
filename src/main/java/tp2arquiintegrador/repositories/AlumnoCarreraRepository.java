package tp2arquiintegrador.repositories;

import tp2arquiintegrador.entities.Alumno;
import tp2arquiintegrador.entities.Alumno_Carrera;
import tp2arquiintegrador.entities.Carrera;

public interface AlumnoCarreraRepository {
    public void matricularAlumno(Alumno a, Carrera c, Integer inscripcion, Integer graduacion, Integer antiguedad);
    public Alumno_Carrera buscarAlumnoID(Alumno_Carrera id);
    public Alumno_Carrera buscarAlumnoID(int id);
}
