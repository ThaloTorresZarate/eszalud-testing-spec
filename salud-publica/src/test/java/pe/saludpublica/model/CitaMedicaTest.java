package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CitaMedicaTest {

    @Test
    @DisplayName("CIT-008: Verificar atributos tras construir el objeto")
    void shouldKeepAppointmentAttributesAfterConstruction() {
        CitaMedica citaMedica = new CitaMedica("6af7316490f1d08b4673bfa8", "6af730a190f1d08b4673b", "9bc12ef4402ddb157b277",
                "2026-12-03 15:30", "Dolor de cabeza", "ATENDIDA");
        assertEquals("6af7316490f1d08b4673bfa8", citaMedica.getIdPaciente());
        assertEquals("6af730a190f1d08b4673b", citaMedica.getIdDoctor());
        assertEquals("9bc12ef4402ddb157b277", citaMedica.getIdEspecialidad());
        assertEquals("2026-12-03 15:30", citaMedica.getFechaHora());
        assertEquals("Dolor de cabeza", citaMedica.getMotivo());
        assertEquals("ATENDIDA", citaMedica.getEstado());
    }


}
