package pe.saludpublica.model;

public class Paciente {

    private String documento;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;

    public Paciente(String documento, String nombres, String apellidos, String telefono, String correo) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getDocumento() {
        return null;
    }

    public String getNombres() {
        return null;
    }

    public String getApellidos() {
        return null;
    }

    public String getTelefono() {
        return null;
    }

    public String getCorreo() {
        return null;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
