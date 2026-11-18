package pe.saludpublica.model;

public class CitaMedica {

    private String idPaciente;
    private String idDoctor;
    private String idEspecialidad;
    private String fechaHora;
    private String motivo;
    private String estado;

    public CitaMedica() {
    }

    public CitaMedica(String idPaciente, String idDoctor, String idEspecialidad, String fechaHora, String motivo, String estado) {

        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.idEspecialidad = idEspecialidad;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.estado = estado;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public String getIdEspecialidad() {
        return idEspecialidad;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "idPaciente='" + idPaciente + '\'' +
                ", idDoctor='" + idDoctor + '\'' +
                ", idEspecialidad='" + idEspecialidad + '\'' +
                ", fechaHora='" + fechaHora + '\'' +
                ", motivo='" + motivo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
