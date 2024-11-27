package Ejercicio15_FileManager;

public class FechaModificacionDecorator extends Decorator{
	public FechaModificacionDecorator(FileManager file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + "Fecha de modificacion: " + this.getFechaModificacion() + "\n";
	}
}