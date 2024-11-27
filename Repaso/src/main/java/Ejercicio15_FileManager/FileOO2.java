package Ejercicio15_FileManager;

import java.time.LocalDate;

public class FileOO2 implements FileManager{
	private String nombre;
	private String extension; 
	private double tamano;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	

	public FileOO2(String nombre, String e, double tam, LocalDate fecha, String p) {
		this.nombre = nombre;
		this.extension = e;
		this.tamano = tam;
		this.fechaCreacion = fecha;
		this.fechaModificacion = fecha;
		this.permisos = p;
	}
	
	public String prettyPrint() {
		return "Aspectos del archivo: " + "\n";
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public String getTamano() {
		return Double.toString(tamano);
	}

	public String getFechaCreacion() {
		return fechaCreacion.toString();
	}

	public String getFechaModificacion() {
		return fechaModificacion.toString();
	}

	public String getPermisos() {
		return permisos;
	}
}