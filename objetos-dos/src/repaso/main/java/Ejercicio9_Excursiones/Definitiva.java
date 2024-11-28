package Ejercicio9_Excursiones;

public class Definitiva extends Estado{
	public String informacion(Excursion e){
		int faltantes = e.getCupoMaximo() - e.getInscriptos().size();
		return super.informacion(e) + 
				"Usuarios : " + e.mailsDeUsuarios() +
				"Cantidad de faltantes para cupo minimo: " + faltantes;
	}
	
	public void inscribir(Excursion e, Usuario user) {
		e.agregarInscripto(user);
		if(e.getInscriptos().size() == e.getCupoMaximo()) e.setEstado(new EnEspera()); 
	}
}