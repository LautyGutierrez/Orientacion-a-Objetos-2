package Ejercicio15_FileManager;

public class ExtensionDecorator extends Decorator{
	public ExtensionDecorator(FileManager file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + "Extension: " + this.getExtension() + "\n";
	}
}
