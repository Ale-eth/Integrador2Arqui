package tp2arquiintegrador.dtos;

public class ReporteCarrerasDTO {
    private String nombreCarrera;
    private int anio;
    private int inscriptos;
    private int egresados;

    public ReporteCarrerasDTO(String nombre, int egresados, int regulares, int anio){
        this.nombreCarrera = nombre;
        this.egresados = egresados;
        this.inscriptos = regulares;
        this.anio = anio;
    }

    public ReporteCarrerasDTO() {
    }

    public String getNombreCarrera() {
        return this.nombreCarrera;
    }

    public int getAnio() {
        return this.anio;
    }
    public int getEgresados() {
        return this.egresados;
    }

    public int getInscriptos() {
        return this.inscriptos;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setEgresados(int egresados) {
        this.egresados = egresados;
    }

    public void setInscriptos(int regulares) {
        this.inscriptos = regulares;
    }

    @Override
    public String toString() {
        return "Reporte DTO => " +
                "Carrera: " + nombreCarrera + ", año:" + anio + ", inscriptos:" + inscriptos
                + ", egresados:" + egresados;
    }
}
