package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EspecialidadTest {
    @Test
    @DisplayName("ESP-001: Crear una especialidad con datos válidos")
    void shouldCreateSpecialtyWithValidData() {
        Especialidad e = new Especialidad("Cardiología",
                "Enfermedades del corazón");
        assertNotNull(e);
        assertEquals("Cardiología", e.getNombre());
        assertEquals("Enfermedades del corazón", e.getDescripcion());
    }

    @Test
    @DisplayName("ESP-002: Rechazar especialidad sin nombre")
    void shouldRejectSpecialtyWithoutName() {
        assertThrows(IllegalArgumentException.class, () ->
                new Especialidad(null, "Enfermedades del corazón"));
    }

}

