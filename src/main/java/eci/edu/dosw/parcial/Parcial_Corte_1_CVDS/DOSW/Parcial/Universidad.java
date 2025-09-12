package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW.Parcial;

public class Universidad {

    private String nombre;
    private String Indicadores;
    private String mensaje;

    public Universidad (String nombre,String Indicadores) {
        this.nombre = nombre;
        this.Indicadores = Indicadores;
        this.mensaje= mensaje;
    }

    public String mensaje() {
        return nombre;
    }

    public String reportesAcademicos(String indicadores){
        return Indicadores;
    }

    public String informacion(String mensaje){
        return mensaje;
    }
}
