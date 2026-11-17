package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PacienteTest {

    @Test
    @DisplayName("Crear un paciente con datos válidos")
    void shouldCreatePatientWithValidData() {
        Paciente p = new Paciente("12345678", "Ana", "Pérez",
                "987654321", "ana@mail.com");
        assertNotNull(p);
        assertEquals("12345678", p.getDocumento());
        assertEquals("Ana", p.getNombres());
        assertEquals("Pérez", p.getApellidos());
        assertEquals("987654321", p.getTelefono());
        assertEquals("ana@mail.com", p.getCorreo());
    }
}
