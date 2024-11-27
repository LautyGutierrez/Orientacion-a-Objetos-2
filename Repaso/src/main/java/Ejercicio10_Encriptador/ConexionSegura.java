package Ejercicio10_Encriptador;

public class ConexionSegura extends Conexion{
	private Encriptador encriptador;
	
	public ConexionSegura() {
		this.encriptador = new Encriptador(new RSA());
	}
	public void enviar(String mensaje) {
		this.encriptador.encriptar(mensaje);
	}
}
