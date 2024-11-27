package Ejercicio19_PersonajesDeRol;

public class Personaje {
	private String nombre;
	private Armadura armadura;
	private Arma arma;
	private String habilidad;
	private int vida;
	
	public Personaje(String nombre, Armadura a, Arma arma, String h) {
		this.nombre = nombre;
		this.armadura = a;
		this.arma = arma;
		this.habilidad = h;
		this.vida = 100;
	}
	
	public Armadura getArmadura() {
		return this.armadura;
	}
	
	public Arma getArma() {
		return this.arma;
	}
	
	public boolean estoyVivo() {
		return this.vida > 0;
	}
	
	public void atacar(Personaje p) {
		if(this.estoyVivo()) p.recibirDano(this.arma.atacar(p.getArmadura()));
		else throw new RuntimeException("No se puede atacar estando muerto");
	}
	
	public void recibirDano(int dano) {
		if(this.estoyVivo()) {
			if((this.vida - dano) >= 0) this.vida -= dano;
			else this.vida = 0;
		} else throw new RuntimeException("Ya está muerto");
	}
}
