package ar.edu.unlp.info.oo2.ejercicio_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	Excursion e;
	Usuario u1, u2;
	
	@BeforeEach
	void setUp() {
		e = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2024, 5, 1), LocalDate.of(2024, 5, 3), "Paraná", 50000, 1, 2);
		u1 = new Usuario("Diego", "Gutierrez", "diego@gmail.com");
		u2 = new Usuario("Lionel", "Messi", "liomessi@gmail.com");
	}
	
	@Test
	public void inscribirTest() {
		assertTrue(e.getEstado() instanceof Provisoria);
		e.inscribir(u1);
		assertTrue(e.getEstado() instanceof Definitiva);
		e.inscribir(u2);
		assertTrue(e.getEstado() instanceof EnEspera);
	}
	
	@Test
	public void obtenerInformacionProvisoriaTest() {
		assertTrue(e.obtenerInformacion().equals("Nombre: Dos días en kayak bajando el Paraná\n"
				+ "Costo: 50000.0\n"
				+ "Fecha de inicio: 1/MAY/2024\n"
				+ "Fecha de fin: 3/MAY/2024\n"
				+ "Punto de encuentro: Paraná\n"
				+ "Cantidad de usuarios faltantes: 1"));
	}
	
	@Test
	public void obtenerInformacionDefinitivaTest() {
		e.inscribir(u1);
		assertTrue(e.obtenerInformacion().equals("Nombre: Dos días en kayak bajando el Paraná\n"
				+ "Costo: 50000.0\n"
				+ "Fecha de inicio: 1/MAY/2024\n"
				+ "Fecha de fin: 3/MAY/2024\n"
				+ "Punto de encuentro: Paraná\n"
				+ "Emails: diego@gmail.com\n"
				+ "Cantidad de usuarios faltantes: 1"));
	}
	
	@Test
	public void obtenerInformacionEnEsperaTest() {
		e.inscribir(u1);
		e.inscribir(u2);
		assertEquals(e.obtenerInformacion(), "Nombre: Dos días en kayak bajando el Paraná\n"
				+ "Costo: 50000.0\n"
				+ "Fecha de inicio: 1/MAY/2024\n"
				+ "Fecha de fin: 3/MAY/2024\n"
				+ "Punto de encuentro: Paraná\n");
	}
}