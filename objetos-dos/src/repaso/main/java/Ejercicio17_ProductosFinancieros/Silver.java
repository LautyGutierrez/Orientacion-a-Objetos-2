package Ejercicio17_ProductosFinancieros;

public class Silver extends Membresia{
	public Silver() {
		super(0.05, 35, 72);
	}
	
	public ProductoCombinado crearProducto3() {
		throw new RuntimeException("Este tipo de membresía no incluye este producto.");
	}
	
	public ProductoCombinado crearProducto4() {
		throw new RuntimeException("Este tipo de membresía no incluye este producto.");
	}
}