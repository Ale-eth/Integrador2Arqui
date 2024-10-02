package tp2arquiintegrador.repositories;

import tp2arquiintegrador.dtos.ReporteCarrerasDTO;
import tp2arquiintegrador.entities.Carrera ;

import java.util.List;

public interface CarreraRepository {

    void crearCarrera(Carrera c);
    List<Carrera> listarCarreras();
    Carrera buscarCarreraPorNombre(String c);
    List<Carrera> listarCarrerasConAlumnosInscriptos();
    List<ReporteCarrerasDTO> getMajorsReport();
}

