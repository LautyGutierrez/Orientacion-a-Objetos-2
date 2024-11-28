package Ejercicio6_Topografias;

import java.util.List;
import java.util.ArrayList;

public class Mixta extends Topografia{
	private List<Topografia> lista; 
	
	public Mixta() {
		this.lista = new ArrayList<Topografia>();
	}
	
	public double proporcionDeAgua() {
		return this.lista.stream().mapToDouble(t -> t.proporcionDeAgua()).sum() / 4;
	}
	
	public void agregar(Topografia t) {
		if(this.lista.size() < 4) this.lista.add(t);
	}
	
	public boolean equals(Topografia t) {
		return t.equalsMixta(this);
	}
	
	public boolean equalsSimple(Topografia t) {
		return false;
	}
	
	public boolean equalsMixta(Mixta m) {
		return this.lista.equals(m.getLista());
	}
	
	public List<Topografia> getLista(){
		return this.lista;
	}
}