package pe.saludpublica.model;

public class Doctor {

    private String documento;
    private String nombres;
    private String apellidos;
    private String colegiatura;
    private String especialidad;

    public Doctor(String documento, String nombres, String apellidos, String colegiatura, String especialidad) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.colegiatura = colegiatura;
        this.especialidad = especialidad;
    }

    public String getDocumento() { return null; }
    public String getNombres() { return null; }
    public String getApellidos() { return null; }
    public String getColegiatura() { return null; }
    public String getEspecialidad() { return null; }
}
