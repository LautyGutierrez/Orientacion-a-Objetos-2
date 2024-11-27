package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Directorio extends FileSystem{
	private List<FileSystem> elementos;
	
	public Directorio(String nombre, LocalDate fecha) {
		super(nombre, fecha);
		elementos = new ArrayList<FileSystem>();
	}
	
	public void agregar(FileSystem file) {
		this.elementos.add(file);
	}
	
	public int tamanoTotalOcupado() {
		return this.elementos.stream().mapToInt(e -> e.tamanoTotalOcupado()).sum() + 32;
	}
	
	public Archivo archivoMasGrande() {
		return this.elementos.stream().map(e -> e.archivoMasGrande()).max((e1, e2) -> Integer.compare(e1.tamanoTotalOcupado(), e2.tamanoTotalOcupado())).orElse(null);
	}
	
	public Archivo archivoMasNuevo() {
		return this.elementos.stream().map(e -> e.archivoMasNuevo()).max((e1, e2) -> e1.getFecha().compareTo(e2.getFecha())).orElse(null);
	}
	
	public FileSystem buscar(String nombre) {
		if(this.soyEse(nombre)) return this;
		return this.elementos.stream().map(e -> e.buscar(nombre)).filter(e -> e != null).findFirst().orElse(null);
	}
	
	public List<FileSystem> buscarTodos(String nombre){
		List<List<FileSystem>> lista = this.elementos.stream().map(e -> e.buscarTodos(nombre)).filter(e -> e != null).collect(Collectors.toList());
		List<FileSystem> l = lista.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
		if(this.soyEse(nombre)) l.add(0, this);
		return l;
	}
	/*
	public String listadoDeContenido() {
		return this.listadoDeContenidoRecursivo("/", this.nombre);
	}
	
	private String listadoDeContenidoRecursivo(String pathGeneral, String pathPadre) {
		
	}
	*/
	
}