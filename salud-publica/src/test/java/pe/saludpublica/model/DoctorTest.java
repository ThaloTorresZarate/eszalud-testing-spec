package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {

    @Test
    @DisplayName("DOC-001: Crear un doctor con datos válidos")
    void shouldCreateDoctorWithValidData() {
        Doctor d = new Doctor("40123456", "Carlos", "Mendoza",
                "CMP-12345", "esp-001");
        assertNotNull(d);
        assertEquals("40123456", d.getDocumento());
        assertEquals("Carlos", d.getNombres());
        assertEquals("Mendoza", d.getApellidos());
        assertEquals("CMP-12345", d.getColegiatura());
        assertEquals("esp-001", d.getEspecialidad());
    }

    @Test
    @DisplayName("DOC-002: Rechazar doctor sin documento")
    void shouldRejectDoctorWithoutDocument() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor(null, "Carlos", "Mendoza", "CMP-12345", "esp-001"));
    }

    @Test
    @DisplayName("DOC-003: Rechazar doctor sin nombres")
    void shouldRejectDoctorWithoutFirstName() {
        assertThrows(IllegalArgumentException.class, () ->
                new Doctor("40123456", null, "Mendoza", "CMP-12345", "esp-001"));
    }

}
