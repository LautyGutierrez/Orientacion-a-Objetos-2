package Ejercicio9_Excursiones;

public class EnEspera extends Estado{
	public void inscribir(Excursion e, Usuario user) {
		e.agregarEnListaDeEspera(user);
	}
}