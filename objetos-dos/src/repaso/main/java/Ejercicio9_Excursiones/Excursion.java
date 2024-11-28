package Ejercicio9_Excursiones;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Excursion {
	private String nombre, puntoEncuentro;
	private LocalDate fechaInicio, fechaFin;
	private double costo;
	private int cupoMinimo, cupoMaximo;
	private Estado estado;
	private List<Usuario> inscriptos, espera;

	public Excursion(String nombre,LocalDate inicio, LocalDate fin, String puntoE, double costo, int min, int max) {
		this.nombre = nombre;
		this.fechaInicio = inicio;
		this.fechaFin = fin;
		this.puntoEncuentro = puntoE;
		this.costo = costo;
		this.cupoMinimo = min;
		this.cupoMaximo = max;
		this.estado = new Provisoria();
		this.inscriptos = new ArrayList<>();
		this.espera = new ArrayList<>();
	}
	
	public String informacion() {
		return this.estado.informacion(this);
	}
	
	public String mailsDeUsuarios() {
		List<String> lista = this.inscriptos.stream().map(u -> u.getEmail()).collect(Collectors.toList());
		return lista.toString();
	}
	
	public void agregarInscripto(Usuario user) {
		this.inscriptos.add(user);
	}
	
	public void agregarEnListaDeEspera(Usuario user) {
		this.espera.add(user);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public void setInscriptos(List<Usuario> inscriptos) {
		this.inscriptos = inscriptos;
	}

	public List<Usuario> getEspera() {
		return espera;
	}

	public void setEspera(List<Usuario> espera) {
		this.espera = espera;
	}
}