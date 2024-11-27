package Ejercicio9_Excursiones;

public class Provisoria extends Estado{
	
	public String informacion(Excursion e) {
		int faltantes = e.getCupoMinimo() - e.getInscriptos().size();
		return super.informacion(e) + "Cantidad de faltantes para cupo minimo: "
				+ faltantes;
	}
	
	public void inscribir(Excursion e, Usuario user) {
		e.agregarInscripto(user);
		if(e.getInscriptos().size() >= e.getCupoMinimo()) e.setEstado(new Definitiva()); 
	}
}
